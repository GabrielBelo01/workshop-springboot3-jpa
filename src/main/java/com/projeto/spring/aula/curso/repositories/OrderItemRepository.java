package com.projeto.spring.aula.curso.repositories;

import com.projeto.spring.aula.curso.entities.OrderItem;
import com.projeto.spring.aula.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
