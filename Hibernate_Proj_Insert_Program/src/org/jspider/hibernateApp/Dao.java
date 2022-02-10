package org.jspider.hibernateApp;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class Dao
{
	public static void main(String[] args)
	{
	//	student s = new student();
	//	s.setName("Manish");
	//	s.setAddress("Delhi");
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory sef = conf.buildSessionFactory();
		Session ses = sef.openSession();
		//Transaction tran = ses.beginTransaction();
		student std =(student)ses.get(student.class, 19);
        System.out.println(std.getAddress());	
        System.out.println(std.getName());
	//	ses.save(std);
		//tran.commit();
		ses.close();
    
	}

}
