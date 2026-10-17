package me.johndimitry.designpatterns.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import me.johndimitry.designpatterns.model.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}