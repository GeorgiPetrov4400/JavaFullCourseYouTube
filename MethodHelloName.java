package JavaFullCourseYoutube;

public class MethodHelloName {
    public static void main(String[] args) {
        String name = "Yorgos";
        int age = 40;
        hello(name, age);
    }

    static void hello(String name, int age) {
        System.out.println("Hello " + name);
        System.out.println("You are " + age);
    }
}
