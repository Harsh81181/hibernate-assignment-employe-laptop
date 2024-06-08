package com.jsp.assignment.controller;

import com.jsp.assignment.dao.EmployeLaptopDao;

public class UpdateLaptopPriceByEmployeId {
public static void main(String[] args) {
	EmployeLaptopDao dao=new EmployeLaptopDao();
	if(dao.updateLaptopPriceByEmployeId(10, 98562.23)) {
		System.out.println("Price has updated");
	}
	else {
		System.out.println("Price has not updated");
	}
}
}
