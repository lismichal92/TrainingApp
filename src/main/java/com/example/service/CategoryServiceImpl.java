package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.controller.reponse.category.Response_countProdoFCat;
import com.example.entity.Category;
import com.example.repository.CategoryRepository;

@Service
@Transactional(readOnly = true)
public class CategoryServiceImpl implements CategoryService {

	private static final Logger log = Logger.getLogger(CategoryServiceImpl.class);

	public CategoryServiceImpl(CategoryRepository categoryRepo, Source source) {
		super();
		this.categoryRepo = categoryRepo;
		this.source = source;
	}

	private CategoryRepository categoryRepo;
	private Source source;

	@Override
	public int getCountOfCategories() {

		int count = (int) categoryRepo.count();
		log.info("getCountOfCategories - count " + count);

		source.output().send(MessageBuilder.withPayload(new Integer(count)).build());

		return count;
	}

	@Override
	public List<Response_countProdoFCat> getCountProductsoFALLCategory() {
		List<Response_countProdoFCat> ret = categoryRepo.getCountProductsoFALLCategory();
		ret.forEach(System.out::println);
		return ret;
	}

	@Override
	public Response_countProdoFCat getCountProductsoFCategory(int id) {
		Response_countProdoFCat ret = categoryRepo.getCountProductsoFCategory(id);
//		if (ret != null)
//			ret.toString(); nie che wypisac stringa ........................
		return ret;
	}

}
