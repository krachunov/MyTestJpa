package edu.pragmatic.homework.sql.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DemoHibernate {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// Create a new EntityManagerFactory using the System properties.
		// The "hellojpa" name will be used to configure based on the
		// corresponding name in the META-INF/persistence.xml file
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("empTest");
		try {
			// Create a new EntityManager from the EntityManagerFactory. The
			// EntityManager is the main object in the persistence API, and is
			// used to create, delete, and query objects, as well as access
			// the current transaction
			EntityManager em = factory.createEntityManager();

			// Begin a new local transaction so that we can persist a new entity
//			em.getTransaction().begin();

			// Create and persist a new Message entity
			// Employee emp = new Employee("1953-09-02", "ICO", "krachu", "m",
			// 857454, "1986-06-26");
			// em.persist(emp);

			// Commit the transaction, which will cause the entity to
			// be stored in the database
			// em.getTransaction().commit();

			// Perform a simple query for all the Message entities
			Query query = em.createQuery("select m from Employee m");

			// // Go through each of the entities and print out each of their
			// // messages, as well as the date on which it was created
			for (Employee m : (List<Employee>) query.getResultList()) {
				System.out
						.printf("%s  %s\n", m.getFirstName(), m.getLastLame());
			}

			// It is always good practice to close the EntityManager so that
			// resources are conserved.
			em.close();
		} finally {
			factory.close();
		}
	}
}