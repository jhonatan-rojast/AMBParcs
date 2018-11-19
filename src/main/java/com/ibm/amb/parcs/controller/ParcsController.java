package com.ibm.amb.parcs.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.amb.parcs.model.Parcs;
import com.ibm.amb.parcs.service.ParcsService;

@RestController
@RequestMapping(value = "/parcs")
public class ParcsController {
	
	private static final Logger logger = LoggerFactory.getLogger(ParcsController.class);
	
	@Autowired
	ParcsService parcsService;
			
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Parcs> getFindAll(){
		logger.info("Entro");
		return parcsService.getParcsRepository().findAll();
	}
	
	@RequestMapping(value = "/incidencia/{incidencia}", method = RequestMethod.GET)
	public List<Parcs> getFindByIncidencia(@PathVariable String incidencia){
		
		return parcsService.getParcsRepository().findByIncidencia(incidencia);
	}

}
