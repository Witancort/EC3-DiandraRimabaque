package com.EC3DiandraRimabaque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EC3DiandraRimabaque.model.Hospital;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Integer> {

}
