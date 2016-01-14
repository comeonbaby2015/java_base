package ooa.finally_demo;

/**
 * Created by hades on 2016/1/14.
 */
public class FinallyDemo {

    public static FinallyDemo gc = null;

    public static void isAlive() {
        System.out.println("yes,i am alive!!!");
    }

    public static void isDead() {
        System.out.println("no, i am dead!!!");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Finalize method is executed!!!");
        gc = this;
    }

    public static void main(String[] args) throws Throwable {
        gc = new FinallyDemo();
        gc = null;
        System.gc();
        Thread.sleep(500);
        if (gc != null)
            isAlive();
        else
            isDead();

        gc = null;
        System.gc();
        Thread.sleep(500);
        if (gc != null)
            isAlive();
        else
            isDead();
    }
}

