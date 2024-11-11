package com.vtorres.projetospring.service;

import com.vtorres.projetospring.entities.Category;
import com.vtorres.projetospring.entities.User;
import com.vtorres.projetospring.repositories.CategoryRepository;
import com.vtorres.projetospring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServieImpl implements CategoryService{

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> listarCategory() {
        return List.of();
    }

    @Override
    public Category findById(Long id) {
        Optional<Category> obj = categoryRepository.findById(id);
        return obj.get();
    }

    @Override
    public Category salvar(Category category) {
        return null;
    }

    @Override
    public void deletar(Long id) {

    }
}
