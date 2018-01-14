package bluerhino.blog.java.jvm;

/**
 * Created by niekunlin @ 18/1/11.
 */
public class StackOverflow {

    public void callMyself(int depth) {
        int a,b,c,d,e,f,g,h,i,j,k;
        System.out.println(depth+"|");
        callMyself(++depth);
    }
}
