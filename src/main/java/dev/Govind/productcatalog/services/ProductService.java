package dev.Govind.productcatalog.services;

import dev.Govind.productcatalog.Model.Product;
import dev.Govind.productcatalog.dtos.genericproductdto;

public interface ProductService {

     genericproductdto getproductbyid(Long id);
}
