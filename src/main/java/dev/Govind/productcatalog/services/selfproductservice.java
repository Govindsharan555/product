package dev.Govind.productcatalog.services;

import dev.Govind.productcatalog.Model.Product;
import dev.Govind.productcatalog.dtos.genericproductdto;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("self")
public class selfproductservice implements ProductService{


    @Override
    public genericproductdto getproductbyid(Long id) {

        System.out.println("fhghh");

        return null;
    }

    @Override
    public genericproductdto createProduct(genericproductdto product) {
        return null;
    }

    @Override
    public List<genericproductdto> getallproduct() {
        return List.of();
    }

}
