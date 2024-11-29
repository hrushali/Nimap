package com.example.test.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="category")
@Getter
@Setter
public class Category {
    @Id
    @Column(name ="C_ID")
    private String C_ID;
    @Column(name="C_Name")
    private String C_Name;
    @Column(name="Discription")
    private String Discription;

    
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
   @JsonManagedReference
    private List<Product> products;
    public Category() {
    }

    public Category(String c_ID, String c_Name, String discription, List<Product> products) {
        C_ID = c_ID;
        C_Name = c_Name;
        Discription = discription;
        this.products = products;
    }

   
    @Override
    public String toString() {
        return "Category [C_ID=" + C_ID + ", C_Name=" + C_Name + ", Discription=" + Discription + ", products="
                + products + "]";
    }

  


   
    
}
