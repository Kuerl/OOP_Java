package ClassandObject;

/**
 * Constructor
 */
class Students {
    private String  name;
    private int age;
    public Students() {
        name = "Tuan";
        age = 24;
    }
    public void display() {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

/**
 * Constructor
 */
public class Constructor {
    public static void main(String[] args) {
        Students s = new Students();
        s.display();
    }
}