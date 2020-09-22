package ClassandObject.Ex2;

public class Student {
    private String name, gender;
    private int age;
    private double gpa;
    
    public Student(String name, int age, String gender, double gpa) {
        // This dùng để truy xuất thuộc tính cừ class
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.gpa = gpa;
    }
    
    public void display() {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("GPA: "+gpa);
    }
}
