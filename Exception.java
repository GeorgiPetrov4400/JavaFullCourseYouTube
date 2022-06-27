package JavaFullCourseYoutube;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a number to divide by: ");
            int y = scanner.nextInt();

            int z = x / y;
            System.out.println("The result is " + z);
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero!");
        } catch (InputMismatchException e) {
            System.out.println("PLEASE ENTER A NUMBER!");
        } finally {
            //System.out.println("This will always print!");
            scanner.close();
        }
    }
}