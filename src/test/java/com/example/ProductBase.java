package com.example;

import com.example.controller.reponse.category.Response_countProdoFCat;
import com.example.main.DemoApplication;
import com.example.service.CategoryServiceImpl;
import com.example.controller.CategoryRestController;
import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.BDDMockito.given;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;

@EnableSpringDataWebSupport
@RunWith(MockitoJUnitRunner.class)
@SpringBootTest(classes = {DemoApplication.class},
                webEnvironment = NONE)

public abstract class ProductBase {

    @Mock
    CategoryServiceImpl CategoryServiceImpl;

    @InjectMocks
    CategoryRestController CategoryRestController;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        Response_countProdoFCat response_countProdoFCat =
                new Response_countProdoFCat("testCategory", 1, 1L);

        given(CategoryServiceImpl.getCountProductsoFCategory(1)).willReturn(response_countProdoFCat);

        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(CategoryRestController)
                                         .build();
        RestAssuredMockMvc.mockMvc(mockMvc);

    }

}
