package com.example.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.controller.reponse.category.Response_countProdoFCat;
import com.example.entity.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer>{

//	@Query(value="select new com.example.controller.reponse.category.class.Response_countProdoFCat(v.answer, count(v))" )
	@Query(value="select name from Category where id = 1" )
	public ArrayList<Response_countProdoFCat> getCountProductsoFCategory();

}
