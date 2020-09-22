package StaticVarandMethod;

public class Student {
    private String name;
    private char gender;
    
    Student() {
        this.name = "Unknown";
        this.gender = 'u';
    }
    
    Student(String name) {
        this.name = name;
        this.gender = 'u';
    }
    
    Student(char gender) {
        this.name = "Unknown";
        this.gender = gender;
    }
    
    Student(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }
    
    public void display() {
        System.out.println("Name: "+name);
        if(gender == 'u') System.out.println("Gender: Unknown");
        if(gender == 'm') System.out.println("Gender: Male");
        if(gender == 'f') System.out.println("Gender: Female");
    }
}