package com.vtorres.projetospring.service;

import com.vtorres.projetospring.entities.User;
import java.util.List;

public interface UserService {

    List<User> listarUsuarios();
    User findById(Long id);
    User salvar(User user);
    void deletar(Long id);

}
