package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Gerant implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long idGerant;
	public String nom;
	public String prenom;
	
	
}
