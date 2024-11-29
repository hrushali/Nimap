package com.example.test.Services;

import java.util.List;
import com.example.test.Entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.test.Repository.Category_Repository;

@Service
public class Category_service {
    @Autowired
    private Category_Repository cr;

    public Page<Category> getCategory(Pageable pageable) {
      return cr.findAll(pageable);  // Pagination handled by Spring Data
  }


    public List<Category> getcategories(){
      
        return cr.findAll();
    }
 public String createCategories(Category category){
    
    cr.save(category);
    return "Categories are Successfully Added";
 }
 public String UpadateCategories(Category category){
    cr.save(category);
    return "Upadeted Categories";
 }

 public String DeleteCategories(Category category){
    cr.delete(category);
    return "Delete successfully!";
 }

    
}
