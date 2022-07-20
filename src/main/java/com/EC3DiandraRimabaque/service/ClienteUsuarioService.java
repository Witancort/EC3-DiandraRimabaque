package com.EC3DiandraRimabaque.service;

import java.util.List;

import com.EC3DiandraRimabaque.dto.ClienteUsuarioDTORequest;
import com.EC3DiandraRimabaque.dto.ClienteUsuarioDTOResponse;



public interface ClienteUsuarioService {
	
	void guardarClienteUsuario(ClienteUsuarioDTORequest clienteUsuario);
	void actualizarClienteUsuario(ClienteUsuarioDTORequest clienteUsuario);
	void eliminarClienteUsuario(Integer id);
	List<ClienteUsuarioDTOResponse> listarClienteUsuario();
	ClienteUsuarioDTOResponse obtenerClienteUsuarioId(Integer id);

}
