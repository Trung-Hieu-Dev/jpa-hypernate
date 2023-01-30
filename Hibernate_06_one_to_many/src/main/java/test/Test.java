package test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.Customer;
import model.My_Order;
import util.HibernateUtil;

public class Test {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		if (sessionFactory != null) {
			Session session = sessionFactory.openSession();
			
			Transaction tr = session.beginTransaction();
			
//			Customer c1 = new Customer("C1", "Dang Trung Hieu", "hieu@mail.com");
//			My_Order o1 = new My_Order("O1", "HCM", c1);
//			My_Order o2 = new My_Order("O2", "HCM", c1);
//			My_Order o3 = new My_Order("O3", "HCM", c1);
//			
//			List<My_Order> list = new ArrayList();
//			list.add(o1);
//			list.add(o2);
//			list.add(o3);
//			
//			c1.setOrders(list);
//			
//			session.saveOrUpdate(c1);
//			session.saveOrUpdate(o1);
//			session.saveOrUpdate(o2);
//			session.saveOrUpdate(o3);
//			
//			Customer c2 = new Customer("C2", "Nguyen Van A", "vana@mail.com");
//			session.saveOrUpdate(c2);
			
			String hql = "From Customer c where size(c.orders) > 0";
			
			List<Customer> results = session.createQuery(hql).list();
			
			for (Customer rs : results) {
				System.out.println(rs.getName());
			}
			
			
			tr.commit();
			
			session.close();
		}
		
		
	}
}
