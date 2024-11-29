package com.example.test.Controller;

import java.util.List;
import com.example.test.Entity.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.Services.Category_service;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;


@RestController
@RequestMapping("/api")
public class Category_Controller {
    @Autowired

   private Category_service cs;

  @GetMapping("/showCategoryes")
    public Page<Category> getCateg(@RequestParam(defaultValue = "0") int page, 
                                        @RequestParam(defaultValue = "10") int size) {
        Pageable pageable = PageRequest.of(page, size);  
        return cs.getCategory(pageable);  

                                        }

   @GetMapping("/categories")
   public List<Category> getMethodName() {
       return cs.getcategories();
   }
   
   @PostMapping("/categories")
   public String postMethodName(@RequestBody Category category) {
       
       
       return cs.createCategories(category);
   }
   
   @GetMapping("/categories/{di}")
   public List<Category> getMethodName(@PathVariable String di, @RequestBody Category category) {
       return cs.getcategories();
   }
   
   @PutMapping("categories/{di}")
   public String putMethodName(@PathVariable String di, @RequestBody Category category) {
    
       return cs.UpadateCategories(category);
   }
   @DeleteMapping("categories/{di}")
   public String DeleteMethod(@PathVariable String di, @RequestBody Category category){
    return cs.DeleteCategories(category);
   }
    

}
