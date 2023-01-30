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
		CatDAO cat_Dao = new CatDAO();
		
		Cat cat1 = new Cat();
		cat1.setId(1);
		Cat result = cat_Dao.selectById(cat1);
		
		System.out.println(result);
	}
}
