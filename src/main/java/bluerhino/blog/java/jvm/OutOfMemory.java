package bluerhino.blog.java.jvm;

/**
 * Created by niekunlin @ 18/1/14.
 */
public class OutOfMemory {
    public void createThread() {
        while (true) {
            Thread t = new Thread(() -> {
                while (true) {
                    System.out.println(System.currentTimeMillis());
                }
            });
            t.start();
        }
    }
}
