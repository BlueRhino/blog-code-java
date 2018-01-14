package bluerhino.blog.java.jvm;

import org.junit.Test;

/**
 * Created by niekunlin @ 18/1/11.
 */
public class StackOverflowTest {
    @Test
    public void callMyself() throws Exception {
        StackOverflow overflow = new StackOverflow();
        try {
            overflow.callMyself(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}