package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			return new Configuration().configure().buildSessionFactory();
		} catch (Exception e) {
			System.out.println("Loi khong the tao SessionFactory");
			return null;
		}
	}
	
	//get method
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	//close
	public static void shutDown() {
		getSessionFactory().close();
	}
}
