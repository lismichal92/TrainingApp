package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.ProductDetails;

@Repository
public interface ProductDetailsRepository extends CrudRepository<ProductDetails, Integer>{

}
