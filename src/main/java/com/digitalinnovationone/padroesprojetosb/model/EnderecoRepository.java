package com.digitalinnovationone.padroesprojetosb.model;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

	Optional<Endereco> findById(String cep);

}
