package com.userManagment.dto;

import javax.persistence.*;

import com.userManagment.model.User;

import java.util.Date;
import java.util.List;



	public class Order {

	    
	    private Integer id;


	   
	    private Date createdDate;

	 
	    private Double totalPrice;

//	    @Column(name = "session_id")
//	    private String sessionId;

//	    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY)
//	    private List<OrderItems> orderItems;

	    @ManyToOne()
	   
	    @JoinColumn(name = "user_id", referencedColumnName = "id")
	    private User user;

	    public Order() {
	    }


//	    public List<OrderItems> getOrderItems() {
//	        return orderItems;
//	    }
//
//	    public void setOrderItems(List<OrderItems> orderItems) {
//	        this.orderItems = orderItems;
//	    }

	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }


	    public Date getCreatedDate() {
	        return createdDate;
	    }

	    public void setCreatedDate(Date createdDate) {
	        this.createdDate = createdDate;
	    }

	    public Double getTotalPrice() {
	        return totalPrice;
	    }

	    public void setTotalPrice(Double totalPrice) {
	        this.totalPrice = totalPrice;
	    }

//	    public String getSessionId() {
//	        return sessionId;
//	    }
//
//	    public void setSessionId(String sessionId) {
//	        this.sessionId = sessionId;
//	    }
//
	    public User getUser() {
	        return user;
	    }

	    public void setUser(User user) {
	        this.user = user;
	    }
	}


