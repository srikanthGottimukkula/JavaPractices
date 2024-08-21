package javaAIT;
interface Vechicle{
    public void enginer();
    public default void oil(){
        System.out.println("oil is completed!!!");
    }

    public static void cool(){
        System.out.println("Good cold is working!!");
    }
    //we can n no of default and static methods
    //static methods can't overide
    //default methods we can override
}

public class DeafultAndStaticExample implements Vechicle {

    public static void main(String[] args) {
        DeafultAndStaticExample d = new DeafultAndStaticExample();
        d.oil();
        d.enginer();
        Vechicle.cool();  //by using interface name we can call that method

    }

    @Override
    public void oil() {
        System.out.println("overriding the default class");
    }

    @Override
    public void enginer() {
        System.out.println("car engine satrted!!!");
    }



}
