package ClassandObject;

/**
 * Student3
 */
class Student3 {

    String name;
    int age;

    public Student3(String n, int a) {
        name = n;
        age = a;
    }

    public void Entry() {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
/**
 * Constructor2
 */
public class Constructor2 {

    public static void main(final String[] args) {
        Student3 s = new Student3("Kuerl",19);
        s.Entry();
    }
}