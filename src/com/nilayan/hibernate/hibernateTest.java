package com.nilayan.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.nilayan.hibernate.dto.userDetails;

public class hibernateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		userDetails user = new userDetails();
		user.setUserid(1);
		user.setFirstName("Nilayan");
		user.setLastName("Bhatt");
		
	//	@SuppressWarnings("deprecation")
		Configuration configuration = new Configuration().configure();
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
		SessionFactory sessionFactory= configuration.buildSessionFactory(serviceRegistry);
		Session session =sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		

	}

}
