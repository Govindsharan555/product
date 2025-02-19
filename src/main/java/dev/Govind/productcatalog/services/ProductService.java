package dev.Govind.productcatalog.services;

import dev.Govind.productcatalog.Model.Product;
import dev.Govind.productcatalog.dtos.genericproductdto;

//Govindsharan

public interface ProductService {

     genericproductdto getproductbyid(Long id);
}
