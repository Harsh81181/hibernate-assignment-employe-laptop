package com.jsp.assignment.controller;

import com.jsp.assignment.dao.EmployeLaptopDao;

public class deleteLaptopByLaptopIdController {
		public static void main(String[] args) {
			EmployeLaptopDao dao=new EmployeLaptopDao();
			if(dao.deleteLaptopByLaptopId(120)){
				System.out.println("Laptop deleted successfully");
			}
			else {
				System.out.println("Laptop not deleted successfully");
			}
}

}