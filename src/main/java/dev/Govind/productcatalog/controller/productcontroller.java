package dev.Govind.productcatalog.controller;


import dev.Govind.productcatalog.Model.Product;
import dev.Govind.productcatalog.dtos.genericproductdto;
import dev.Govind.productcatalog.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products/")
public class productcontroller {

    private ProductService productService;

    public productcontroller(@Qualifier("fake") ProductService productService)
    {
        this.productService = productService;
    }
@GetMapping("{id}")
public genericproductdto getproductbyid(@PathVariable("id") Long id)
{
    return productService.getproductbyid(id);
}

}
