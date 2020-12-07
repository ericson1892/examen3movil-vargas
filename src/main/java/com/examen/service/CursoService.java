package com.examen.service;

import java.util.List;

import com.examen.entity.Curso;

public interface CursoService {
	
	public List<Curso> listarTodos();
	public List<Curso> listarCursoPorNombre(String filtro);

}
