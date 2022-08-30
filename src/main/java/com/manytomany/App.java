package com.manytomany;

import java.util.ArrayList;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cnf = new Configuration();
        cnf.configure("hibernate2.cfg.xml");
        SessionFactory factory = cnf.buildSessionFactory();
        
        Session ses = factory.openSession();
        Employee e1 = new Employee();
        e1.setEmpId(101);
        e1.setEmpName("Anand");
        Employee e2=new Employee();
        e2.setEmpId(345);
        e2.setEmpName("Babu");
        
        Project p1 = new Project();
        p1.setProjectId(2036);
        p1.setProjeName("cloud");
        
        Project p2 = new Project();
        p2.setProjectId(5021);
        p2.setProjeName("EDP");
        
        List<Employee> list1 = new ArrayList<Employee>();
        List<Project> list2 = new ArrayList<Project>();
        
        list1.add(e1);
        list1.add(e2);
        
        list2.add(p1);
        list2.add(p2);
        
        e1.setProjects(list2);
        p2.setEmps(list1);
        
        Transaction tr = ses.beginTransaction();
        ses.save(e1);
        ses.save(e2);
        ses.save(p1);
        ses.save(p2);
        tr.commit();
        
        
        
        
        
        
        
    }
}