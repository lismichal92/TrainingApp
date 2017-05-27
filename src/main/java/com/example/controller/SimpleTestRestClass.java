package com.example.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Product;
import com.example.service.ProductService;
import com.example.utils.DataBaseContentGenerator;

@RestController
@RequestMapping("/api")
public class SimpleTestRestClass {

	private DataBaseContentGenerator dbGen;
	private ProductService productService;
	Integer counter = 0;
	
	private static final Logger log = Logger.getLogger(SimpleTestRestClass.class);

	@Autowired
	public SimpleTestRestClass(ProductService productService , DataBaseContentGenerator dbGen) {
		this.productService = productService;
		this.dbGen = dbGen;
	}

	
	@RequestMapping(value = "/generateCategories/", 
					method = RequestMethod.GET)
	public String generateCategories() {
		log.info("INVOKE generateCategories..");
		dbGen.addCategoriesAndDetails();
		log.info("DONE generateCategories..");
		return "WYGENEROWANO KATEGORIE!";
	}
	
	@RequestMapping(value = "/generateProduct/{numberOfProduct}",
					method = RequestMethod.GET,
					produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> generateProduct(@PathVariable("numberOfProduct") int numberOfProduct) {
		
		log.info("INVOKE generateProduct..");
		
		dbGen.generateProduct(numberOfProduct);
		List<Product> allProduct = (List<Product>) productService.findAll();
		ResponseEntity<List<Product>> reponse = new  ResponseEntity<>(allProduct,HttpStatus.OK);
		
		log.info("DONE generateProduct..");
		return reponse;
	}
	
	@RequestMapping(value = "/getProduct/{numberOfProduct}",
					method = RequestMethod.GET,
					produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getProductById(@PathVariable("id") int id) {
		
		log.info("INVOKE getProductById..");
		
		Product product =  productService.findProductById(id);
		ResponseEntity<Product> reponse = new  ResponseEntity<>(product,HttpStatus.OK);
		
		log.info("DONE getProductById..");
		return reponse;
	}
	
}
