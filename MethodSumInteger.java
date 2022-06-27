package JavaFullCourseYoutube;

public class MethodSumInteger {
    public static void main(String[] args) {

        int x = 234;
        int y = 432;
        int z = sum(x, y);
        System.out.println(z);
    }

    static int sum(int x, int y) {
        int z = x + y;
        return z;
    }
}
