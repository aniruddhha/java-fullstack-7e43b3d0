package com.ani.orm;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ani.orm.domain.Car;
import com.ani.orm.util.HibernateUtil;

@SpringBootApplication
public class HibernateDemoApplication {


	public static void demo1() {
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

	public static void demo2() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		// Transaction txn = session.beginTransaction();
		Query<Car> query1 = session.createQuery("from Car", Car.class);
		List<Car> cars1 = query1.getResultList();
		cars1.forEach(System.out::println);
		// txn.commit();	
		// session.close();

		Query<Car> query2 = session.createQuery("from Car where id = :id", Car.class);
		query2.setParameter("id", 1L);
		Car car1 = query2.getSingleResult();
		System.out.println(car1);

		session.close();
	}

	public static void main(String[] args) {
		SpringApplication.run(HibernateDemoApplication.class, args);

		demo2();
	}

}
