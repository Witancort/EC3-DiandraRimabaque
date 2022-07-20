package com.EC3DiandraRimabaque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EC3DiandraRimabaque.model.UsuarioCliente;



@Repository
public interface ClienteUsuarioRepository extends JpaRepository<UsuarioCliente, Integer> {
	UsuarioCliente findByUsuario(String usuario);

}
