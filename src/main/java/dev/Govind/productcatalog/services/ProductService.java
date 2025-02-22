package dev.Govind.productcatalog.services;

import dev.Govind.productcatalog.Model.Product;
import dev.Govind.productcatalog.dtos.genericproductdto;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


//Govindsharan

public interface ProductService {

     genericproductdto getproductbyid(Long id);

     genericproductdto createProduct(genericproductdto product);

     List<genericproductdto> getallproduct();
}
