package com.vtorres.projetospring.resources;


import com.vtorres.projetospring.entities.Category;
import com.vtorres.projetospring.entities.User;
import com.vtorres.projetospring.service.CategoryServieImpl;
import com.vtorres.projetospring.service.UserServieImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResources {

    @Autowired
    private CategoryServieImpl categoryServie;


    @GetMapping
    public ResponseEntity<List <Category>> listarCategory() {
        List<Category> list = categoryServie.listarCategory();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id) {
        Category obj = categoryServie.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
