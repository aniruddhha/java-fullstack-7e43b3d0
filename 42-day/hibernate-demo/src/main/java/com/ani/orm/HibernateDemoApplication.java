package com.ani.orm;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ani.orm.domain.Car;
import com.ani.orm.util.HibernateUtil;

@SpringBootApplication
public class HibernateDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateDemoApplication.class, args);

		Car car = new Car();
		car.setId(50L);
		car.setName("abc");
		car.setCost(56.90d);

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction txn = session.beginTransaction();
		session.save(car);
		txn.commit();

		session.close();
	}

}
