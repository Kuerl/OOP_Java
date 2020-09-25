package Encapsulation;

public class Rectangle {
    private double length, width;

    public Rectangle() {

    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }
    
    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return length*width;
    }

    public double getPerimeter() {
        return 2*(length+width);
    }
}

// Dùng constructorm khưởi tạo gái trị ban đầu, setter => khởi tạo giá trị khác.