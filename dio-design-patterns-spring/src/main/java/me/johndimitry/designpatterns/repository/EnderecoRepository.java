package me.johndimitry.designpatterns.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import me.johndimitry.designpatterns.model.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {
}