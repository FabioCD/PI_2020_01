package br.com.integrador.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.integrador.model.Pessoa;

public interface PessoaRepository extends JpaRepository< Pessoa ,Long> {

	
}
