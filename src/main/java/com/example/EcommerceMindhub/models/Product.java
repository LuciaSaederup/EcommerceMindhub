package com.example.EcommerceMindhub.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Long id;

    private String name;

    private double price;

    private int stock;


    //Falta la relación con PurchaseOrder

    /*
    * EJEMPLO
    *     @OneToOne(mappedBy = "client", fetch = FetchType.EAGER)
    Set<ShoppingCart> shoppingCart=new HashSet<>();

    * */


    public Product() {
    }


    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nombre='" + name + '\'' +
                ", precio=" + price +
                ", stock=" + stock +
                '}';
    }
}
