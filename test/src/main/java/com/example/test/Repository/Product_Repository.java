package com.example.test.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.test.Entity.Product;

public interface Product_Repository extends JpaRepository<Product,String> {
    Page<Product> findAll(Pageable pageable);
}
