package com.example.utils;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.constants.CategoryDetailsExample;
import com.example.constants.CategoryExample;
import com.example.constants.DescriptionExample;
import com.example.constants.ProductDetailsExample;
import com.example.constants.ProductExample;
import com.example.entity.Category;
import com.example.entity.CategoryDetails;
import com.example.entity.Product;
import com.example.entity.ProductDetails;
import com.example.repository.CategoryDetaillsRepository;
import com.example.repository.CategoryRepository;
import com.example.repository.ProductDetailsRepository;
import com.example.repository.ProductRepository;

@Component
public class DataBaseContentGenerator {

	private CategoryDetaillsRepository cdRepo;
	private CategoryRepository cRepo;
	private ProductRepository pRepo;
	private ProductDetailsRepository pdRepo;

	@Autowired
	public DataBaseContentGenerator(CategoryDetaillsRepository cdRepo, CategoryRepository cRepo,
			ProductRepository pRepo, ProductDetailsRepository pdRepo) {
		super();
		this.cdRepo = cdRepo;
		this.cRepo = cRepo;
		this.pRepo = pRepo;
		this.pdRepo = pdRepo;
	}

	public void addCategoriesAndDetails(){
		
		for (CategoryExample ce : CategoryExample.values()){
			Category c = new Category();
			c.setName(ce.name());
			c.setActive(1);
			
			List<String> cDetailsStringList =  CategoryDetailsExample.CategoryDetailsExampleMap.get(ce.getNumber());
			List<CategoryDetails> cdList= new ArrayList<>();
			
			cDetailsStringList.forEach(x -> {
				CategoryDetails cDet = new CategoryDetails();
				cDet.setCategory(c);
				cDet.setName(x);
				cdList.add(cDet);
			});
			c.setCategoryDetails(cdList);
			cRepo.save(c);
			cdList.forEach(cdetails -> cdRepo.save(cdetails));
		}
	}
	
	public void generateProduct(Integer generateSize) {
		
		List<Category> categoryList = (List<Category>) cRepo.findAll();
		categoryList.sort((c1,c2) -> c1.getId().compareTo(c2.getId()));
		
		for (int i = 0; i < generateSize; i++) {
			Random r = new Random();
			Product p = new Product();
			p.setActive(1);
			p.setCreationDate(LocalDateTime.now());
			p.setCity(ProductExample.cityList.get(r.nextInt(6)));
			p.setDescripton(DescriptionExample.DESCRIPTIONS.get(r.nextInt(9)));
			int categoryId = r.nextInt(9) + 1;
			Category cc = categoryList.
					stream().
					filter(c -> (c.getId().intValue() == categoryId)).
					findFirst().orElse(null);
			
			List<String> pList = ProductExample.ProductExampleMap.get(categoryId);
			
			p.setName(pList.get(r.nextInt(pList.size())));
			p.setCategory(cc);
			Integer price = r.nextInt(100000) + 1;
			p.setPrice(new BigDecimal(price));
			List<String> cde = CategoryDetailsExample.CategoryDetailsExampleMap.get(categoryId);
			List<ProductDetails> pdList = new ArrayList<>();
			
			cde.forEach(el -> {
				ProductDetails pd = new ProductDetails();
				List <String> l = ProductDetailsExample.ProductDetailsExampleMap.get(el);
				String value = l.get(r.nextInt(l.size()));
				pd.setName(el);
				pd.setValue(value);
				pd.setProduct(p);
				pdList.add(pd);
			});
			p.setProductDetails(pdList);
			pRepo.save(p);
			pdList.forEach(pdetails -> pdRepo.save(pdetails));
		}

	}

}
