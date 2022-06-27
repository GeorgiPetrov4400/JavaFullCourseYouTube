package JavaFullCourseYoutube;

import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args) {

        /*String[] animals = {"cat", "dog", "bird", "rat"};

        for (String i : animals) {
            System.out.println(i);
        }*/
        ArrayList<String> animals = new ArrayList<String>();

        animals.add("cat");
        animals.add("dog");
        animals.add("bird");
        animals.add("rat");

        for (String i : animals) {
            System.out.println(i);
        }
    }
}
