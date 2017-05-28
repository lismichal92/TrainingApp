package contracts.product

org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'GET'
        url 'category/countProductsOfCategory/1'
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
             "categorName":"testCategory",
             "categoryId":1,
             "productCount":1
          }

            """)

        headers {
            contentType(applicationJson())
        }
    }
}
