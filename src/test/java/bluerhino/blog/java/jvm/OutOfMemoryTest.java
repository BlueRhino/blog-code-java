package bluerhino.blog.java.jvm;

import org.junit.Test;

/**
 * Created by niekunlin @ 18/1/14.
 */
public class OutOfMemoryTest {
    @Test
    public void createThread() throws Exception {
        OutOfMemory outOfMemory = new OutOfMemory();
        outOfMemory.createThread();
    }
}