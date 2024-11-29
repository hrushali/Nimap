package com.example.test.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.test.Entity.Category;


import org.springframework.data.jpa.repository.JpaRepository;

public interface Category_Repository extends JpaRepository<Category ,String> {
   Page<Category> findAll(Pageable pageable);
    

    
}
