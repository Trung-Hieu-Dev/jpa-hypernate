package test;



import java.sql.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import dao.CatDAO;
import model.Cat;
import util.HibernateUtil;

public class TestCat {
	public static void main(String[] args) {
		/*
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			if (sessionFactory != null) {
				Session session = sessionFactory.openSession();
				try {
					Transaction tr = session.beginTransaction();
					Cat cat1 = new Cat();
					cat1.setName("Tom");
					cat1.setSex(true);
					session.save(cat1);
					tr.commit();
				} finally {
					session.close();
				}
			}
		} catch (Exception e) {
			
		}
		*/
		CatDAO cat_Dao = new CatDAO();
		
		/*
		 *Get list all
		List<Cat> list = cat_Dao.selectAll();
		for (Cat cat : list) {
			System.out.println(cat);
		}
		*/
		
		
		//get by id
		/* Cat c = new Cat();
		c.setId(1);
		
		Cat c1 = cat_Dao.selectById(c);
		System.out.println(c1);
		*/
		
		
		//insert
//		Cat c3 = new Cat("Meo mum", new Date(System.currentTimeMillis()), true);
//		cat_Dao.insert(c3);
		
		//delete
		Cat c4 = new Cat();
		c4.setId(3);
		cat_Dao.delete(c4);
		
	}
}
