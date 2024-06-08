package com.jsp.assignment.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Laptop {
	@Id
	private int id;
	private String name;
	private double price;
	private String mfg_by;
}
