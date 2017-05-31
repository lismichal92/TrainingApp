package com.example;

import static org.mockito.BDDMockito.given;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.example.controller.CategoryRestController;
import com.example.controller.reponse.category.Response_countProdoFCat;
import com.example.main.DemoApplication;
import com.example.service.CategoryServiceImpl;
import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;


@EnableSpringDataWebSupport
@RunWith(MockitoJUnitRunner.class)
@SpringBootTest(classes = {DemoApplication.class},
                webEnvironment = NONE)

public abstract class CategoryBase {

	    @Mock
	    CategoryServiceImpl CategoryServiceImpl;

	    @InjectMocks
	    CategoryRestController CategoryRestController;

	    @Before
	    public void setup() {
	        MockitoAnnotations.initMocks(this);
	       
	       List <Response_countProdoFCat> respList = new ArrayList<>();
	       respList.add(new Response_countProdoFCat("Elektronika", 222,222L));
	       respList.add(new Response_countProdoFCat("Motoryzacja", 111, 111L));
	       
	       given(CategoryServiceImpl.getCountProductsoFALLCategory()).willReturn(respList);

	       MockMvc mockMvc = MockMvcBuilders.standaloneSetup(CategoryRestController)
	                                         .build();
	       RestAssuredMockMvc.mockMvc(mockMvc);

	    }
	
}
