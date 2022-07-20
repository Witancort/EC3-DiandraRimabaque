package com.EC3DiandraRimabaque.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EC3DiandraRimabaque.dto.ClienteDTORequest;
import com.EC3DiandraRimabaque.dto.ClienteDTOResponse;
import com.EC3DiandraRimabaque.model.Cliente;
import com.EC3DiandraRimabaque.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	private ClienteRepository repository;

	@Override
	public void guardarCliente(ClienteDTORequest cliente) {
		Cliente p = new Cliente();
		p.setCliente(cliente.getCliente());
		p.setCelular(p.getCelular());
		repository.save(p);
		
	}

	@Override
	public void actualizarCliente(ClienteDTORequest cliente) {
		Cliente p = new Cliente();
		p.setCliente(cliente.getCliente());
		p.setCelular(p.getCelular());

		repository.saveAndFlush(p);
		
	}

	@Override
	public void eliminarCliente(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public List<ClienteDTOResponse> listarCliente() {
List<ClienteDTOResponse> listar = new ArrayList<>();
		
		ClienteDTOResponse dto = null;
		
		List<Cliente> p = repository.findAll();
		
		for (Cliente cliente : p) {
			
			dto = new ClienteDTOResponse();
			
			dto.setCliente(cliente.getCliente());
			dto.setCelular(cliente.getCelular());

			
			listar.add(dto);
		}
		
		return listar;
	}
	

	@Override
	public ClienteDTOResponse obtenerClienteId(Integer id) {
		Cliente cliente= repository.findById(id).orElse(null);
		ClienteDTOResponse dto = new ClienteDTOResponse();
		
		dto.setCliente(cliente.getCliente());
		dto.setCelular(cliente.getCelular());
		
		return dto;
	}
	

}
