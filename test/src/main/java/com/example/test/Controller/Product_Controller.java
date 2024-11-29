package com.example.test.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.test.Entity.Product;
import com.example.test.Services.Product_service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;



@RestController
@RequestMapping("/api")
public class Product_Controller {
    @Autowired

    private Product_service ps;


      @GetMapping("/showProduct")
    public Page<Product> getProd(@RequestParam(defaultValue = "0") int page, 
                                     @RequestParam(defaultValue = "10") int size) {
        Pageable pageable = PageRequest.of(page, size);  // Creating Pageable instance for pagination
        return ps.getProduct(pageable);  // Pagination handled here
                                     }

     @GetMapping("/products")
   public List<Product> getMethodName() {
       return ps.getproducts();
}
@PostMapping("/products")
public String postMethodName(@RequestBody Product product) {
  
    return ps.createProduct(product);
   
}

@GetMapping("/products/{di}")
public List<Product> getMethodName(@PathVariable String di, @RequestBody Product product) {
    return ps.getproducts();

}
@PutMapping("products/{di}")
public String putMethodName(@PathVariable String di, @RequestBody Product product) {
  
    
    return ps.updateProduct(product);
}

@DeleteMapping("products/{di}")
public String DeleteMethod(@PathVariable String di, @RequestBody Product product){
    return ps.deleteProduct(product);
}
}
