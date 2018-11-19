package com.ibm.amb.parcs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.amb.parcs.repository.ParcsRepository;
import com.ibm.amb.parcs.service.ParcsService;

@Service
public class ParcsServiceImpl implements ParcsService {
	
	@Autowired
	private ParcsRepository parcsRepository;
	
	public ParcsRepository getParcsRepository() {
		return parcsRepository;
	}
	
}
