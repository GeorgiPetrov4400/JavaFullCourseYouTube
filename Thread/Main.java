package JavaFullCourseYoutube.Thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println(Thread.activeCount());
        Thread.currentThread().setName("Thread");
        System.out.println(Thread.currentThread().getName());

        for (int i = 5; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1_000);
        }
        System.out.println("Finished");
    }
}
