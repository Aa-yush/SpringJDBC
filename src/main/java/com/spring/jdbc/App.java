package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;
import com.spring.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigJdbc.class);
        StudentDao studentDao =  context.getBean("studentImpl",StudentDaoImpl.class);
        
 /*       Student Insert Data - 
        Student student = new Student();
        student.setStudentId(333);
        student.setStudentName("Vivek");
        student.setStudentCity("Kanpur");
        
        int count = studentDao.insert(student);
        System.out.println(count + " Number of record inserted"); */
        
/*        Student Update Data - 
        Student student = new Student();
        student.setStudentId(222);
        student.setStudentName("Nonu");
        student.setStudentCity("Bihar");
        
        int count = studentDao.updateData(student);
        System.out.println(count + " Number of record updated"); */
        
/*        Student Delete Data -
        Student student = new Student();
        student.setStudentId(222);
        student.setStudentName("Nonu");
        student.setStudentCity("Bihar");
        
        int count = studentDao.deleteData(student);
        System.out.println(count + " Number of record deleted"); */
        
//		Get Single Student Object
        
        Student student = studentDao.getStudent(333);
        System.out.println(student); 
        
//      Get All Student Object
        
        List<Student> students = studentDao.getAllStudents();
        
        for(Student s: students)
        {
        	 System.out.println(s);	
        }
        
        
    }
}
