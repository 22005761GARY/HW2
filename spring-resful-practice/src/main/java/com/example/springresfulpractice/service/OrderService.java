package com.example.springresfulpractice.service;

import com.example.springresfulpractice.model.Meal;
import com.example.springresfulpractice.model.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class OrderService {

    private List<Order> orderList;
    public  OrderService(){
        this.orderList = new ArrayList<>();
        List<Meal> mealList1 = new ArrayList<>();
        mealList1.add(new Meal("burger", 150, "tasty"));
        List<Meal> mealList2 = new ArrayList<>();
        mealList2.add(new Meal("cake", 100, "sweet"));
        this.orderList.add(new Order(1, 1000, "Gary", mealList1));
        this.orderList.add(new Order(2, 1500, "Jason", mealList2));
    }

    public List<Order> getAllOrders(){
        return this.orderList;
    }

    public Order getOrderById(int id){
        for(Order order : this.orderList){
            if(id == order.getSeq()){
                return order;
            }
        }
        return  null;
    }

    public Order createOrder(Order order){
        this.orderList.add(order);
        return order;
    }

    public Order updateOrder(int seq, Order order){
        for(Order updatedOder : this.orderList){
            if(seq == updatedOder.getSeq()){
                updatedOder.setSeq(order.getSeq());
                updatedOder.setTotalPrice(order.getTotalPrice());
                updatedOder.setWaiter(order.getWaiter());
                updatedOder.setMealList(order.getMealList());
                return updatedOder;
            }
        }
        return null;
    }

    public Order deleteOrder(int seq){
        for(Order deletedOrder : this.orderList){
            if(seq == deletedOrder.getSeq()){
                this.orderList.remove(deletedOrder);
                return deletedOrder;
            }
        }
        return null;
    }
}
