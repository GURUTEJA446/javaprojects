package abc;

import java.util.HashSet;
import java.util.Scanner;

public class StudentHashSet{
	public static void main(String[] args) {
		HashSet<String> stdudent=new HashSet<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of 5 Student");
		while(students.size()<5){
			System.out.println("enter student names"+i+":");
			String name=sc.nextLine();
			stdudent.add(name);
		}
		System.out.println("Student names are:");
		for(String Student:stdudent) {
			System.out.println(Student);
		}

	}

}
