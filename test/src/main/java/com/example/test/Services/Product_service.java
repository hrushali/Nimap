package com.example.test.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.test.Entity.Product;
import com.example.test.Repository.Product_Repository;

@Service
public class Product_service {
    @Autowired

     private Product_Repository pr;


     public Page<Product> getProduct(Pageable pageable) {
        return pr.findAll(pageable);  // Pagination handled by Spring Data

     }
     
    public List<Product> getproducts(){
        return pr.findAll();
    }
    public String createProduct(Product product){
         pr.save(product);
         return "Products are Successfully Added";
    }

    public String updateProduct(Product product){
        pr.save(product);
        return "Product list Updeted";
    }

    public String deleteProduct(Product product){
        pr.delete(product);
        return "Product Deleted Successfully";
    }
}
