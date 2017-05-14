package com.example.controller;

import java.math.BigDecimal;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Product;
import com.example.repository.ProductRepository;
import com.example.utils.DataBaseContentGenerator;

@RestController
@RequestMapping("/api")
public class SimpleTestRestClass {

	private DataBaseContentGenerator dbGen;
	private ProductRepository productRepo;
	Integer counter = 0;
	
	private static final Logger log = Logger.getLogger(SimpleTestRestClass.class);

	@Autowired
	public SimpleTestRestClass(ProductRepository productRepo , DataBaseContentGenerator dbGen) {
		log.info("Object SimpleTestRestClass created..");
		this.productRepo = productRepo;
		this.dbGen = dbGen;
	}

	@RequestMapping(value = "/test/", method = RequestMethod.GET)
	public String getInfo() {
		log.info("INVOKE getInfo..");
		counter=counter+1;
		Product p = new Product("BMW z "+counter.toString(),new BigDecimal("20800"),"RED","Lublin");
		productRepo.save(p);
		return "TEST!";
	}
	
	@RequestMapping(value = "/generateCategories/", method = RequestMethod.GET)
	public String generateCategories() {
		log.info("INVOKE generateCategories..");
		dbGen.addCategoriesAndDetails();

		return "WYGENEROWANO KATEGORIE!";
		
	}
	
	@RequestMapping(value = "/generateProduct/", method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> generateProduct() {
		log.info("INVOKE generateProduct..");
		dbGen.generateProduct(5);
		
		List<Product> allProduct = (List<Product>) productRepo.findAll();
		//ResponseEntity<List<Product>> reponse = new  ResponseEntity<>(allProduct,HttpStatus.OK);
		/*
		 * TUTAJ BLAD JESZCZE NIE NAPRAWILEM , niE CHCE ZWROCIC JASON'A
		 */
		ResponseEntity<List<Product>> reponse = new  ResponseEntity<>(HttpStatus.OK);
		return reponse;
		
	}
	
}
