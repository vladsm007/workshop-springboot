package com.vtorres.projetospring.service;

import com.vtorres.projetospring.entities.Order;
import com.vtorres.projetospring.entities.User;
import com.vtorres.projetospring.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderRepository orderRepository;
    @Override
    public List<Order> listarOrder() {
        return orderRepository.findAll();
    }

    @Override
    public Order findById(Long id) {
        Optional<Order> obj = orderRepository.findById(id);
        return obj.get();
    }

    @Override
    public Order salvar(Order order) {
        return null;
    }

    @Override
    public void deletar(Long id) {

    }
}
