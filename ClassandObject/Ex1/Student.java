package ClassandObject.Ex1;
import java.util.Scanner;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public void getInformation() {
        Scanner test = new Scanner(System.in);
        name = test.next();
        age = test.nextInt();
    }

    public void display() {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
