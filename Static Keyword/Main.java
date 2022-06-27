package JavaFullCourseYoutube.StaticKeyword;

public class Main {
    public static void main(String[] args) {

        Friend friend = new Friend("Yorgos");
        Friend friend2 = new Friend("Simona");
        Friend friend3 = new Friend("Siyana");
        Friend friend4 = new Friend("Martin");

        System.out.println(Friend.numberOfFriends);
        Friend.displayFriends();
    }
}
