package Encapsulation;

public class Student {
    private int id, age, score;
    private String name, address;

    public Student() {

    }

    public Student(int id, String name, int age, String address, int score) {
        this.id = id;
        this.name = name;
        this. age = age;
        this.address = address;
        this.score = score;
    }

    // id
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    // name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // address
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    // score
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        if (score < 0) {
			this.score = 0;
		} else if (score > 10) {
			this.score = 10;
		} else {
			this.score = score;
		}
    }
}
