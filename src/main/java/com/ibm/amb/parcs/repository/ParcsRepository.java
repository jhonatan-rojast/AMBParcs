package com.ibm.amb.parcs.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ibm.amb.parcs.model.Parcs;

public interface ParcsRepository extends MongoRepository<Parcs, String>{
	
	List<Parcs> findByIncidencia(String incidencia);

}
