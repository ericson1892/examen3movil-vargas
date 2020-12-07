package com.examen.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;



@Getter
@Entity
@Setter
@Table(name="sistemaevaluacion")
public class Sistemaevaluacion {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idSistemaEvaluacion;
	private String nombre;
	private String formula;
	private String estado;

}