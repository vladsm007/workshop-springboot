package com.vtorres.projetospring.resources;


import com.vtorres.projetospring.entities.Product;
import com.vtorres.projetospring.entities.User;
import com.vtorres.projetospring.service.ProductServieImpl;
import com.vtorres.projetospring.service.UserServieImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResources {

    @Autowired
    private ProductServieImpl productServie;


    @GetMapping
    public ResponseEntity<List <Product>> listarProducts() {
        List<Product> list = productServie.listarProducts();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Product obj = productServie.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
