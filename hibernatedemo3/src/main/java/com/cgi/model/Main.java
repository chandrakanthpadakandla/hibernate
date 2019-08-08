package com.cgi.model;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.cgi.repository.StudentRepository;

public class Main{
	   public static void main(String str[]){
	StudentRepository studentRepository=new StudentRepository();
	Scanner scanner=new Scanner(System.in);
	Student student=new Student();
	int choice=0;
	while(true){
	System.out.println("1)ADD STUDENT");
	System.out.println("2)UPDATE STUDENT");
	System.out.println("3)DELETE STUDENT");
	System.out.println("4)DISPLAY STUDENT");
	System.out.println("5)EXIT");
	System.out.println("ENTER YOUR CHOICE");
	choice=scanner.nextInt();
	switch(choice) {
	case 1:	
	System.out.println("enter the id");
	int id1=scanner.nextInt();
	System.out.println("enter the firstname");
	String firstname=scanner.next();
	System.out.println("enter the lastname");
	String lastname=scanner.next();
	System.out.println("enter the section");
	String section=scanner.next();
	student.setId(id1);
	student.setFirstName(firstname);
	student.setLastName(lastname);
	student.setSection(section);
	studentRepository.addStudent(student);
    break;
	case 2:System.out.println("enter the id to be updated");
		int id=scanner.nextInt();
	    student.setId(id);
	    studentRepository.update(id);	
	break;
	case 3:System.out.println("enter the id to be deletee");
	int id2=scanner.nextInt();
	student.setId(id2);
	studentRepository.deleteStudent(id2);
	break;
	case 4 : List<Student> studentList=studentRepository.getAllStudents();
	for(Student s:studentList) {
		System.out.println(s.getId()+"\t"+s.getFirstName()+"\t"+s.getLastName()+"\t"+s.getLastName()+"\t"+s.getSection());
	}
	break;
	case 5: System.exit(0);
	}

	
	}
	  }
	  
	}

