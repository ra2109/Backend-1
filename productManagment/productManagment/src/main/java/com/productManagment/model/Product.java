package com.productManagment.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;

import java.util.List;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private  String name;
    private  double price;
    private  String description;






//    @JsonIgnore
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
//    private List<Cart> carts;





//    public Product(ProductDto productDto, Category category) {
//        this.name = productDto.getName();
//        this.imageURL = productDto.getImageURL();
//        this.description = productDto.getDescription();
//        this.price = productDto.getPrice();
//
//    }

//    public Product(String name, String imageURL, double price, String description, Category category) {
//        super();
//        this.name = name;
//        this.imageURL = imageURL;
//        this.price = price;
//        this.description = description;
//        this.category = category;
//    }

    public Product() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}

