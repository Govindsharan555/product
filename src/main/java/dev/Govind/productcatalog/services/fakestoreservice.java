package dev.Govind.productcatalog.services;

import dev.Govind.productcatalog.Model.Product;
import dev.Govind.productcatalog.dtos.fakestoreproductdto;
import dev.Govind.productcatalog.dtos.genericproductdto;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Service("fake")
public class fakestoreservice implements ProductService  {

   private String requestURl="https://fakestoreapi.com/products/{id}";
    private String allproductrequestURl="https://fakestoreapi.com/products";

    private RestTemplateBuilder restTemplateBuilder;

    public fakestoreservice(RestTemplateBuilder restTemplateBuilder)
    {
        this.restTemplateBuilder=restTemplateBuilder;
    }
    @Override
    public genericproductdto getproductbyid(Long id) {

        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<fakestoreproductdto> response = restTemplate.getForEntity(requestURl, fakestoreproductdto.class, id);
        response.getStatusCode();
        fakestoreproductdto fakestoreproductdto =response.getBody();
        genericproductdto product =new genericproductdto();
        product.setId(fakestoreproductdto.getId());
        product.setTitle(fakestoreproductdto.getTitle());
        product.setImage(fakestoreproductdto.getImage());
        product.setCategory(fakestoreproductdto.getCategory());
        product.setDescriptions(fakestoreproductdto.getDescriptions());
        product.setPrice(fakestoreproductdto.setPrice());
        return product;
    }

      public genericproductdto createProduct(genericproductdto product)
      {
          RestTemplate restTemplate =restTemplateBuilder.build();
          ResponseEntity<genericproductdto> response = restTemplate.postForEntity(allproductrequestURl,product, genericproductdto.class);
return response.getBody();
      }

    @Override
    public List<genericproductdto> getallproduct() {
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<fakestoreproductdto[]> response = restTemplate.getForEntity(allproductrequestURl, fakestoreproductdto[].class);
        List<genericproductdto> answer = new ArrayList<>();

        for (fakestoreproductdto fakestoreproductdto : response.getBody()){
            genericproductdto product = new genericproductdto();
            product.setId(fakestoreproductdto.getId());
            product.setTitle(fakestoreproductdto.getTitle());
            product.setImage(fakestoreproductdto.getImage());
            product.setCategory(fakestoreproductdto.getCategory());
            product.setDescriptions(fakestoreproductdto.getDescriptions());
            product.setPrice(fakestoreproductdto.setPrice());

            answer.add(product);
        }

return answer;
    }

}
