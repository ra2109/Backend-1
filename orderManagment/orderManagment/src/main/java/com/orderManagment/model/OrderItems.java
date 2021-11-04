package com.orderManagment.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.orderManagment.Dto.Product;

import javax.persistence.*;

import java.util.Date;

@Entity
@Table(name = "orderitems")
public class OrderItems {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(name = "quantity")
    private  int quantity;

    @Column(name = "price")
    private  double price;


    @Column(name = "created_date")
    private Date createdDate;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private Order order;

    @OneToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Product product;

//    public OrderItems(){}
//
//    public OrderItems(Order order, Product product,  int quantity, double price) {
//        this.product = product;
//        this.quantity = quantity;
//        this.price = price;
//        this.order= order;
//        this.createdDate = new Date();
//    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
