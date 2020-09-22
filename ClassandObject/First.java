// Create the the First class
package ClassandObject;

import java.util.Scanner;

class Student{
	Scanner sc = new Scanner(System.in);
	String name;
	int age;

	public void display() {
		System.out.println("Name: "+name+"\nAge: "+age);
	}
	public void getInformation() {
		name = sc.next();
		age = sc.nextInt();
	}
}


public class First {
	public static void main(String[]args) {
		Student s1 = new Student();
		s1.getInformation();
		s1.display();
	}
}
