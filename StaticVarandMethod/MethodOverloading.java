package StaticVarandMethod;

/**
 * Math
 */
class Math {

    public static int abs(int x) {
        return x<0?-x:x;
    }

    public static double abs(double x) {
        return x<0?-x:x;
    }

    public static long abs(long x) {
        return x<0?-x:x;
    }
    
}
/**
 * MethodOverloading
 */
public class MethodOverloading {

    public static void main(String[] args) {
        System.out.println(Math.abs(-10));
        System.out.println(Math.abs(-0.5));
        System.out.println(Math.abs(-119273817));
    }
}