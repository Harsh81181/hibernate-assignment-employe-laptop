package com.jsp.assignment.controller;

import java.time.LocalDate;

import com.jsp.assignment.dao.EmployeLaptopDao;

public class DeleteEmployeByDoj {
public static void main(String[] args) {
	EmployeLaptopDao dao=new EmployeLaptopDao();
	if(dao.deleteEmployeByDoj(LocalDate.parse("2010-12-20"))!=-1) {
		System.out.println("Employe has deleted");
	}
	else {
		System.out.println("Employe has not deleted");
	}
}
}
