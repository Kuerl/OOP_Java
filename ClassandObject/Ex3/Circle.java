package ClassandObject.Ex3;

public class Circle {
    private double radius;
    
    public Circle(double radius) {
		this.radius = radius;
	}
    
    public double getArea() {
        return 3.14*radius*radius;
    }
    
    public double getCircumference() {
        return 2*radius*3.14;
    }
}