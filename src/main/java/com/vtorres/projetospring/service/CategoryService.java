package com.vtorres.projetospring.service;

import com.vtorres.projetospring.entities.Category;
import com.vtorres.projetospring.entities.User;

import java.util.List;

public interface CategoryService {

    List<Category> listarCategory();
    Category findById(Long id);
    Category salvar(Category user);
    void deletar(Long id);

}
