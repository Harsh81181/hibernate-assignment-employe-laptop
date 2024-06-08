package com.jsp.assignment.dao;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.assignment.dto.Employe;
import com.jsp.assignment.dto.Laptop;

public class EmployeLaptopDao {
	EntityManager em= Persistence.createEntityManagerFactory("hibernate").createEntityManager();
	EntityTransaction et=em.getTransaction();
	public Employe insertEmployeLaptopDao(Employe employe,Laptop laptop) {
		
		try {
			et.begin();
			employe.setLaptop(laptop);
			em.persist(employe);
			et.commit();
			return employe;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean deleteLaptopByLaptopId(int laptopId) {
		Laptop laptop=em.find(Laptop.class, laptopId);
		if(laptop!=null) {
			try {
				String selectQuery="Select e from Employe e where e.laptop.id=?1";
				Query query=em.createQuery(selectQuery);
				query.setParameter(1, laptopId);
				Employe employe=(Employe)query.getSingleResult();
				employe.setLaptop(null);
				et.begin();
				em.remove(laptop);
				et.commit();
				return true;
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	return false;
}
	public int deleteEmployeByDoj(LocalDate doj) {
		try {
			String selectQuery="Delete from Employe e where e.doj=?1";
			Query query=em.createQuery(selectQuery);
			query.setParameter(1, doj);
			et.begin();
			int x=query.executeUpdate();
			et.commit();
			return x;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return -1;
	}

	public boolean updateLaptopPriceByEmployeId(int id,double price) {
		Employe employe= em.find(Employe.class, id);
		employe.getLaptop().setPrice(price);
		try {
			et.begin();
			em.merge(employe);
			et.commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
	
	public List<Employe> displayLaptopAndEmploye(){
		try {
			String selectQuery="from Employe";
			Query query=em.createQuery(selectQuery);
			return query.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
}
