package JavaFullCourseYoutube.Constructor;

public class Main {
    public static void main(String[] args) {

        Human human = new Human("Joro", 40, 88);
        Human human2 = new Human("Simona", 33, 65);

        System.out.println(human.name);
        System.out.println(human.age);
        System.out.println(human.weight);
        human.drink();
        System.out.println();
        System.out.println(human2.name);
        System.out.println(human2.age);
        System.out.println(human2.weight);
        human2.eat();
    }
}
