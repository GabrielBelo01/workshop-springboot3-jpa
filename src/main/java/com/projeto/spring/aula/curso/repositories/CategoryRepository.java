package com.projeto.spring.aula.curso.repositories;

import com.projeto.spring.aula.curso.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
