package com.jsp.assignment.controller;

import java.util.ArrayList;
import java.util.List;

import com.jsp.assignment.dao.EmployeLaptopDao;
import com.jsp.assignment.dto.Employe;

public class DisplayLaptopandEmplye {
public static void main(String[] args) {
	EmployeLaptopDao dao=new EmployeLaptopDao();
	List<Employe> employes=new ArrayList<Employe>();
	employes=dao.displayLaptopAndEmploye();
	for(Employe employe:employes) {
		System.out.println("================================================");
		System.out.println(employe);
		System.out.println(employe.getLaptop());
		System.out.println("================================================");
	}
}
}
