package com.jsp.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Configuration config=new Configuration();
		SessionFactory sf=config.buildSessionFactory();
		config.configure();
		config.addAnnotatedClass(Student.class);
		Session ses=sf.openSession();
		Transaction trans=ses.beginTransaction();
		Student student = ses.get(Student.class, 1);
		System.out.println(student);
		trans.commit();
		ses.close();
	}
}
