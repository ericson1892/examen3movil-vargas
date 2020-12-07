package com.examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.entity.Sistemaevaluacion;
import com.examen.service.SistemaevaluacionService;


@RestController
@RequestMapping("/api/rest/sistemaevaluacion")
public class SistemaevaluacionController {

	@Autowired
	private SistemaevaluacionService service;
	
	@GetMapping("/")
	public ResponseEntity<List<Sistemaevaluacion>> lista(){
		return ResponseEntity.ok(service.listaSistemaevaluacion());
	}
}
