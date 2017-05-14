package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.CategoryDetails;

@Repository
public interface CategoryDetaillsRepository extends CrudRepository<CategoryDetails, Integer>{

}
