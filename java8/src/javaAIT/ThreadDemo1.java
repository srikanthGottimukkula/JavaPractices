package javaAIT;
//print 1 to 5 approact 1
public class ThreadDemo1 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Runnable r = new ThreadDemo1();
        Thread t = new Thread(r);
        t.start();
    }
}
