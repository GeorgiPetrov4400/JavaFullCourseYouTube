package JavaFullCourseYoutube;

public class Array2D {
    public static void main(String[] args) {

        /*String[][] cars = new String[3][3];

        cars[0][0] = "Mazda";
        cars[0][1] = "Honda";
        cars[0][2] = "Mercedes";
        cars[1][0] = "Toyota";
        cars[1][1] = "Suzuki";
        cars[1][2] = "Nissan";
        cars[2][0] = "Subaru";
        cars[2][1] = "Audi";
        cars[2][2] = "Skoda";

        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
            System.out.println();
        }*/
        String[][] cars = {{"Mazda", "Honda", "Mercedes"},
                {"Toyota", "Suzuki", "Nissan"},
                {"Subaru", "Audi", "Skoda"}};

        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
            System.out.println();
        }
    }
}
