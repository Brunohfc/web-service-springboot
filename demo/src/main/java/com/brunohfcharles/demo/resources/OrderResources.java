package com.brunohfcharles.demo.resources;

import com.brunohfcharles.demo.entities.Order;
import com.brunohfcharles.demo.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/orders")
public class OrderResources {

    @Autowired
    private OrderService orderService;

    @GetMapping
    private ResponseEntity<List<Order>>obterTodos(){
        List<Order> orders = orderService.encontrarTodosOsPedidos();
        return ResponseEntity.ok().body(orders);
    }

    @GetMapping(value = "/{id}")
    private Order obterPedidoPorId(@PathVariable int id){

        return orderService.encontrarPedidoPorId(id);
    }
}
