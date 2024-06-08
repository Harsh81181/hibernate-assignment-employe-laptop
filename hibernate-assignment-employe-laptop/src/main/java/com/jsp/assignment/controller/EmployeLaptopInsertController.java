package com.jsp.assignment.controller;

import java.time.LocalDate;

import com.jsp.assignment.dao.EmployeLaptopDao;
import com.jsp.assignment.dto.Employe;
import com.jsp.assignment.dto.Laptop;

public class EmployeLaptopInsertController {
public static void main(String[] args) {
	EmployeLaptopDao dao=new EmployeLaptopDao();
	if(dao.insertEmployeLaptopDao(new Employe(10, "Kalu Prasad", LocalDate.parse("2010-12-10"), "wdjscvdu23@gmail.com", null), new Laptop(120, "DELL-01", 54120.35, "BBK-ELECTRONICS"))!=null)
	{
		System.out.println("Data inserted successfully");
	}
}
}
