package com.projeto.spring.aula.curso.repositories;

import com.projeto.spring.aula.curso.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
