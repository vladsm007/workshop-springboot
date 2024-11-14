package com.vtorres.projetospring.service;

import com.vtorres.projetospring.entities.Product;
import com.vtorres.projetospring.entities.User;
import com.vtorres.projetospring.repositories.ProductRepository;
import com.vtorres.projetospring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServieImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;


    @Override
    public List<Product> listarProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(Long id) {
        Optional<Product> obj = productRepository.findById(id);
        return obj.get();
    }

    @Override
    public Product salvar(Product product) {
        return null;
    }

    @Override
    public void deletar(Long id) {

    }
}
