package com.example.ordermgmt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue
    private int id;
    private int userId;
    private int productId;
    private int quantity;
    private double totalPrice;
    public Order(){}
    public int getId()
    {
        return id;

    }
    public int getUserId()
    {
        return userId;

    }
    public int getProductId(){
        return productId;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getTotalPrice()
    {
        return totalPrice;
    }
    public void setUserId(int userId){
        this.userId=userId;
    }
    public void setProductId(int productId){
        this.productId=productId;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    public void setTotalPrice(double totalPrice)
    {
        this.totalPrice=totalPrice;
    }
}
