package contracts.category

org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'GET'
        url 'category/countProductsOfCategory/'
        body(["""
            """
        ])
        headers {
            header('Accepts', 'application/json')
            header('Content-Type', 'application/json')
        }
    }
    response {
        status 200

        body("""
          {
	         "":[
 					        {
 					          "categoryName":"Motoryzacja",
 					             "categoryId":111,
 					             "productCount":111
 					        },
 					        {
 				          "categorName":"Elektronika",
 					             "categoryId":222,
 					             "productCount":222
 					        }
 	        			]
			
          }

            """)

        headers {
            contentType(applicationJson())
        }
    }
}
