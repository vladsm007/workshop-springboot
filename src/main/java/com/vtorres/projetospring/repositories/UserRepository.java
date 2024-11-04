package com.vtorres.projetospring.repositories;

import com.vtorres.projetospring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
