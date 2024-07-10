package com.hdemo2.controller;

import javax.persistence.Persistence;

import com.hdemo2.model.Emp;

import javax.persistence.EntityManager;
import  javax.persistence.EntityManagerFactory;

public class EmpManagement {

		public static void main(String[] args) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("empone");
			EntityManager        em  = emf.createEntityManager();
				em.getTransaction().begin();
					  Emp E1 = new Emp();
					  E1.setEid(1);
					  E1.setEname("Kranthi");
					  E1.setESalary(56785.90F);
				
				  em.persist(E1);
				em.getTransaction().commit();
			em.close();
			emf.close();	 
		 System.out.println("Table is created successfully and records inserted");

	}

}