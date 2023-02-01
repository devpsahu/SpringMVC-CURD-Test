package com.pks.users;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("first");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	public String saveUser(UserModel userModel) {

		et.begin();
		em.persist(userModel);
		et.commit();
		return userModel.getName() + "is saved.";
	}

	public ArrayList<UserModel> getAllUsers() {

		Query q=em.createQuery("select u from UserModel u");

		return (ArrayList<UserModel>) q.getResultList();
	}
	
	public String deleteUser(int id) {
		
		UserModel user=em.find(UserModel.class, id);
		
		et.begin();
		em.remove(user);
		et.commit();
		return "Data is deleted";
	}
	
}
