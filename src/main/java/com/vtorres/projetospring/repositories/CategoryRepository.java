package com.vtorres.projetospring.repositories;

import com.vtorres.projetospring.entities.Category;
import com.vtorres.projetospring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
