package JavaFullCourseYoutube;

public class Array {
    public static void main(String[] args) {

        /*String[] cars = {"Mazda", "Honda", "Mercedes"};

        cars [2] = "Toyota";

        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);*/

        String[] cars = new String[3];

        cars[0] = "Mazda";
        cars[1] = "Honda";
        cars[2] = "Toyota";

        /*System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);*/
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
