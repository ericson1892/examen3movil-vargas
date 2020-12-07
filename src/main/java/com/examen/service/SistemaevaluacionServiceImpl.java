package com.examen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.entity.Sistemaevaluacion;
import com.examen.respository.SistemaevaluacionRepository;


@Service
public class SistemaevaluacionServiceImpl  implements SistemaevaluacionService{

	@Autowired
	private SistemaevaluacionRepository repository;
	
	@Override
	public List<Sistemaevaluacion> listaSistemaevaluacion(){
		
		return repository.findAll();
	}

}
