package com.example.ordermgmt.controller;

import com.example.ordermgmt.model.Order;
import com.example.ordermgmt.model.Product;
import com.example.ordermgmt.repository.OrderRepository;
import com.example.ordermgmt.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {
    private OrderRepository orderRepository;
    private ProductRepository productRepository;
    public OrderController(OrderRepository orderRepository,ProductRepository productRepository){
        this.orderRepository=orderRepository;
        this.productRepository=productRepository;
    }
    @PostMapping
    public Order createOrder(@RequestParam int userId, @RequestParam int productId, @RequestParam int quantity){
        Product p=productRepository.findById(productId).get();
        Order o=new Order();
        o.setUserId(userId);
        o.setProductId(productId);
        o.setQuantity(quantity);
        o.setTotalPrice(p.getPrice()*quantity);
        return orderRepository.save(o);
    }
    @GetMapping("/{id}")
    public Order getOrder(@PathVariable int id){
        return orderRepository.findById(id).get();
    }
}
