package javaAIT;
//Approach 3
public class ThreadDemo3Lamnda {
    public static void main(String[] args) {

        Runnable r = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
            }
        };
        Thread t = new Thread(r);
        t.start();
    }
}
