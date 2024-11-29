package com.example.test.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Product")
@Getter
@Setter
public class Product {
    public Product() {
    }

    @Id
    @Column(name="P_ID")
    private String P_ID;
    @Column(name="P_Name")
    private String P_Name;
    @Column(name="Price")
    private float Price;
   
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_ID" ,referencedColumnName="C_ID")
    @JsonBackReference
    private Category category;

    public Product(String p_ID, String p_Name, float price, Category category) {
        P_ID = p_ID;
        P_Name = p_Name;
        Price = price;
        this.category = category;
    }
    @Override
    public String toString() {
        return "Product [P_ID=" + P_ID + ", P_Name=" + P_Name + ", Price=" + Price + ", category=" + category + "]";
    }
    

}
