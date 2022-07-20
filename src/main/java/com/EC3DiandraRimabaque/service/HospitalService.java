package com.EC3DiandraRimabaque.service;

import java.util.List;

import com.EC3DiandraRimabaque.dto.HospitalDTORequest;
import com.EC3DiandraRimabaque.dto.HospitalDTOResponse;



public interface HospitalService {
	void guardarHospital(HospitalDTORequest clienteUsuario);
	void actualizarHospital(HospitalDTORequest clienteUsuario);
	void eliminarHospital(Integer id);
	List<HospitalDTOResponse> listarHospital();
	HospitalDTOResponse obtenerHospital(Integer id);

}
