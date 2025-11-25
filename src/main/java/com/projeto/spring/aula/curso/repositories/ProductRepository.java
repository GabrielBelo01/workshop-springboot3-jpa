package com.projeto.spring.aula.curso.repositories;

import com.projeto.spring.aula.curso.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
