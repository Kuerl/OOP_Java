//Execute Area and Perimeter of a Rectangle
package ClassandObject;

import java.util.Scanner;

class Rectangle{
    Scanner sc = new Scanner(System.in);
    // Define Variable
    double l, w;
    // Define Function
    public void getInformation() {
        l = sc.nextDouble();
        w = sc.nextDouble();
    }
    public void display() {
        System.out.println("Area: "+(l*w));
        System.out.println("Perimeter: "+(2*(l+w)));
    }
}

public class Second {
	public static void main(String[]args) {
		Rectangle r = new Rectangle();
		r.getInformation();
		r.display();
	}
}