package com.vtorres.projetospring.service;

import com.vtorres.projetospring.entities.Order;

import java.util.List;

public interface OrderService {

    List<Order> listarOrder();
    Order findById(Long id);
    Order salvar(Order order);
    void deletar(Long id);

}
