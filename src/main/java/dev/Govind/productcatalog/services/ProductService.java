package dev.Govind.productcatalog.services;

import dev.Govind.productcatalog.Model.Product;
import dev.Govind.productcatalog.dtos.genericproductdto;
import org.springframework.web.bind.annotation.RequestBody;

//Govindsharan

public interface ProductService {

     genericproductdto getproductbyid(Long id);

     genericproductdto createProduct(genericproductdto product);
}
