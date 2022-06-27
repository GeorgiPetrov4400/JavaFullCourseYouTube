package JavaFullCourseYoutube.SuperKeyword;

public class Main {
    public static void main(String[] args) {

        Hero hero1 = new Hero("Batman", 42, "$$$");
        Hero hero2 = new Hero("Spiderman", 30, "Jumping");

        System.out.println(hero1.name);
        System.out.println(hero1.age);
        System.out.println(hero1.power);
        System.out.println();
        System.out.println(hero2.toString());
    }
}
