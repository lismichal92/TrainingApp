package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.controller.reponse.category.Response_countProdoFCat;
import com.example.entity.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer>{

	
	// @Query(value="select name from Category where id = 1" )
	@Query(value="select new com.example.controller.reponse.category.Response_countProdoFCat(c.name, c.id, count(p.id)) from Product p RIGHT JOIN  p.category c WHERE p.category = c.id GROUP BY c.name, c.id " )
	public List<Response_countProdoFCat> getCountProductsoFALLCategory();
	
	@Query(value="select new com.example.controller.reponse.category.Response_countProdoFCat(c.name, c.id, count(p.id)) from Product p RIGHT JOIN  p.category c WHERE p.category.id = :categoryId GROUP BY c.name, c.id " )
	public Response_countProdoFCat getCountProductsoFCategory(@Param("categoryId")int id);


}
