package com.brunohfcharles.demo.services;

import com.brunohfcharles.demo.entities.Order;
import com.brunohfcharles.demo.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> encontrarTodosOsPedidos(){
        return orderRepository.findAll();
    }


    public Order encontrarPedidoPorId(int id){
        Optional<Order> order = orderRepository.findById(id);
        return order.get();
    }
}
