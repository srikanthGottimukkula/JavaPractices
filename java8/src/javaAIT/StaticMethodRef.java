package javaAIT;

@FunctionalInterface
interface MyInteface {
    public void m1();
}

public class StaticMethodRef {

    public static void m2() {
        System.out.println("Static method reference!!");
    }

    public static void main(String[] args) {
        MyInteface s = StaticMethodRef::m2;
        s.m1();
    }


}
