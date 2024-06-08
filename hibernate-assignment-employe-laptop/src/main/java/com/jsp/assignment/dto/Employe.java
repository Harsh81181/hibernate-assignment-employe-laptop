package com.jsp.assignment.dto;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Employe {
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", doj=" + doj + ", email=" + email + "]";
	}
	@Id
	private int id;
	private String name;
	private LocalDate doj;
	private String email;
	@OneToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	private Laptop laptop;
	
	
}
