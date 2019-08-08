package com.cgi.repository;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.cgi.model.Student;

public class StudentRepository {
	private Session session;
	private SessionFactory sessionFactory;
	
	public StudentRepository() {
	 sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
	 Scanner scanner=new Scanner(System.in);
	}
	public void addStudent(Student student) {
	      Session session = sessionFactory.openSession();
	      session.beginTransaction();
	       session.save(student);
	       session.getTransaction().commit();
	       session.close();
	}	
	public void update(int id)
    {
      Session session = sessionFactory.openSession();
     session.beginTransaction();
     Student student = (Student) session.get(Student.class, id);
	 Scanner scanner=new Scanner(System.in);
	 int choice=0;
        System.out.println("enter the choice to be updated");        
		System.out.println("1) firstname");
		System.out.println("2) lastname");
		System.out.println("3)section");
		System.out.println("4)EXIT");
		choice=scanner.nextInt();
		switch(choice) {
		case 1 : System.out.println("enter the firstname to be updated");
		String firstname=scanner.next();
		student.setFirstName(firstname);
		break;
		case 2: System.out.println("enter ythe last name to be updated");
		String lastname=scanner.next();
		student.setLastName(lastname);
		break;
		case 3: System.out.println("enter the section to be updated");
		String section=scanner.next();
		student.setSection(section);
		break;
		}
    // student.setSection(section);
    //session.update(student);//No need to update manually as it will be updated          automatically on transaction close.
    session.getTransaction().commit();
    session.close();
 }
public void deleteStudent(int id) {
    Session session = sessionFactory.openSession();
    session.beginTransaction();
    Student student = (Student) session.get(Student.class, id);
    session.delete(student);
    session.getTransaction().commit();
    session.close();
}
public List<Student> getAllStudents() {
    Session session = sessionFactory.openSession();
            List<Student> students = (List<Student>) session.createQuery("FROM Student s ORDER BY s.firstName ASC").list();
           // session.getTransaction().commit();
             session.close();
             return students;
}
}
