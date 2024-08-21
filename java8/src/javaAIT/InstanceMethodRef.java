package javaAIT;
// instead of run method m1 method is calling!!
public class InstanceMethodRef {

    public void m1() {
        System.out.println("Good Morning!!!");
    }

    public static void main(String[] args) {
        InstanceMethodRef ir = new InstanceMethodRef();
        Runnable r = ir::m1;
        Thread t = new Thread(r);
        t.start();

    }
}
