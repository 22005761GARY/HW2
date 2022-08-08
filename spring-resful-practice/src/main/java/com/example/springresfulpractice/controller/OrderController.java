package com.example.springresfulpractice.controller;

import com.example.springresfulpractice.model.Order;
import com.example.springresfulpractice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    private OrderService orderService;
    @GetMapping()
    public List<Order> getAllOrders(){
        List<Order> orderList = this.orderService.getAllOrders();
        return orderList;
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable int id){
        Order order = this.orderService.getOrderById(id);
        return order;
    }

    @PostMapping()
    public  Order createOrder(@RequestBody Order order){
        Order newOrder = this.orderService.createOrder(order);
        return  newOrder;
    }

    @PutMapping("/{seq}")
    public Order updateOrder(@PathVariable int seq, @RequestBody Order order){
        Order updatedOrder = this.orderService.updateOrder(seq, order);
        return updatedOrder;
    }

    @DeleteMapping("/{seq}")
    public Order deleteOrder(@PathVariable int seq){
        Order deletedOrder = this.orderService.deleteOrder(seq);
        return deletedOrder;
    }
}
