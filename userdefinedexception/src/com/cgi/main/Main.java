package com.cgi.main;

import java.util.Scanner;

import com.cgi.exception.ZeroValueNotAllowedException;

public class Main {

	public static void main(String[] args) {
		try {
 Scanner scanner= new Scanner(System.in);
 System.out.println("Enter the number");
 int num=scanner.nextInt();
 if(num==0)
 {
	 throw new ZeroValueNotAllowedException("zero value not allowed");
 }
		}catch(ZeroValueNotAllowedException ex)
 {
	 System.out.println(ex.getMessage());
	 }
 }
	}


