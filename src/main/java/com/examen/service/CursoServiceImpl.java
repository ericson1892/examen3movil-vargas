package com.examen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.entity.Curso;
import com.examen.respository.CursoRepository;


@Service
public class CursoServiceImpl implements CursoService{

	@Autowired
	private CursoRepository repository;
	
	@Override
	public List<Curso> listarTodos() {
		
		return repository.findAll();
	}

	@Override
	public List<Curso> listarCursoPorNombre(String filtro) {
		
		return repository.listaPorNombre(filtro);
	}

}
