package Encapsulation;

public class Employee {
    private int id, salary;
    private String firstName, lastName;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id =id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // get
    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getFullName() {
        return firstName+" "+lastName;
    }
    public int getSalary() {
        return salary;
    }

    // set
    public void setId(int id) {
        this.id = id;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
