package test;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.Author;
import model.Book;
import util.HibernateUtil;

public class Test {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		if (sessionFactory != null) {
			Session session = sessionFactory.openSession();
			
			Transaction tr = session.beginTransaction();
			
//			Author author_1 = new Author("001", "Nguyen Nhat Anh", new Date(System.currentTimeMillis()));
//			Book book_1 = new Book("B01", "Sach 01", 5000, author_1);
//			Book book_2 = new Book("B02", "Sach 02", 57000, author_1);
//			Book book_3 = new Book("B03", "Sach 03", 2500, author_1);
//			
//			session.saveOrUpdate(author_1);
//			session.saveOrUpdate(book_1);
//			session.saveOrUpdate(book_2);
//			session.saveOrUpdate(book_3);
			
//			Author author_2 = new Author("002", "Dang Trung Hieu", new Date(System.currentTimeMillis()));
//			Book book_3 = new Book("B03", "Sach 03", 15000, author_2);
//			Book book_4 = new Book("B04", "Sach 04", 60000, author_2);
//			Book book_5 = new Book("B05", "Sach 05", 30000, author_2);
//			
//			session.saveOrUpdate(author_2);
//			session.saveOrUpdate(book_3);
//			session.saveOrUpdate(book_4);
//			session.saveOrUpdate(book_5);
			
			Book b1 = session.find(Book.class, "B01");
			System.out.println("Tac gia cua sach " + b1.getTitle() + " la " + b1.getAuthor().getName());
			
			tr.commit();
			
			
			session.close();
		}
	}
}
