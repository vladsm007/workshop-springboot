package com.vtorres.projetospring.service;

import com.vtorres.projetospring.entities.User;
import com.vtorres.projetospring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServieImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> listarUsuarios() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        Optional<User> obj = userRepository.findById(id);
        return obj.get();
    }

    @Override
    public User salvar(User user) {
        return null;
    }

    @Override
    public void deletar(Long id) {

    }
}
