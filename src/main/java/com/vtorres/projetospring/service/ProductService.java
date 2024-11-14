package com.vtorres.projetospring.service;

import com.vtorres.projetospring.entities.Product;
import com.vtorres.projetospring.entities.User;

import java.util.List;

public interface ProductService {

    List<Product> listarProducts();
    Product findById(Long id);
    Product salvar(Product user);
    void deletar(Long id);

}
