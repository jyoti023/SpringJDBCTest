package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.dao.MyClassDao;
import com.spring.dao.MyClassDoaImpl;
import com.spring.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "Program Started............." );
        ApplicationContext contex =
        		new ClassPathXmlApplicationContext("Configuration.xml");
        //JdbcTemplate template = contex.getBean("JdbcTemplate",JdbcTemplate.class);
        
        MyClassDao myclass = contex.getBean("MyClass",MyClassDao.class);
        
        Employee emp = new Employee();
        emp.setId(101);
        emp.setName("XYZ");
        
       int result= myclass.insert(emp);
        System.out.println(result+"Data Inserted");
        
       // System.out.println("Connected Database SuccessFuly");
        //template.execute("create table employee (id int, name varchar(100))");
       // System.out.println("Table Created Successfully");
    }
}
