package CrudOperation;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Sample {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");// dev is the name of persistence unit
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
	//	 insert
		 Student s1 = new Student();
		s1.setSid(1);
		s1.setSname("veeru");

		Student s2 = new Student();
		s2.setSid(2);
		s2.setSname("Mallikarjun");
		Student s3 = new Student();
		s3.setSid(3);
		s3.setSname("Sharath");

		et.begin();
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		et.commit();
		System.out.println("values inserted");

		// fetch by id
		et.begin();
		Student std = em.find(Student.class, 2);
		et.commit();

		System.out.println(std.getSid() + " " + std.getSname());

		// update by id
		Student s4 = new Student();
		s4.setSid(2);
		s4.setSname("abc");
//
		et.begin();
		em.merge(s4);
		et.commit();
		System.out.println("data updated....");

	}
}
