package com.EC3DiandraRimabaque.service;

import java.util.List;

import com.EC3DiandraRimabaque.dto.ClienteDTORequest;
import com.EC3DiandraRimabaque.dto.ClienteDTOResponse;


public interface ClienteService {

	void guardarCliente(ClienteDTORequest cliente);
	void actualizarCliente(ClienteDTORequest cliente);
	void eliminarCliente(Integer id);
	List<ClienteDTOResponse> listarCliente();
	ClienteDTOResponse obtenerClienteId(Integer id);
}
