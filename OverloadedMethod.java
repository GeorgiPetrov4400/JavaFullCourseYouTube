package JavaFullCourseYoutube;

public class OverloadedMethod {
    public static void main(String[] args) {
        int result = sum(1, 2, 3);
        System.out.println(result);
        double result2 = sum(1, 2, 3);
        System.out.println(result2);
    }

    static int sum(int a, int b) {
        System.out.println("This is a overloaded method #1");
        return a + b;
    }

    static int sum(int a, int b, int c) {
        System.out.println("This is a overloaded method #2");
        return a + b + c;
    }

    static int sum(int a, int b, int c, int d) {
        System.out.println("This is a overloaded method #3");
        return a + b + c + d;
    }

    static double sum(double a, double b) {
        System.out.println("This is a overloaded method #4");
        return a + b;
    }

    static double sum(double a, double b, double c) {
        System.out.println("This is a overloaded method #5");
        return a + b + c;
    }

    static double sum(double a, double b, double c, double d) {
        System.out.println("This is a overloaded method #6");
        return a + b + c + d;
    }
}
