package javaAIT;

@FunctionalInterface
interface MyInterfaceTwo{
    public void Demo();
}
//Function Interface by using
public class WithFInterface {

    public static void main(String[] args) {
        MyInterfaceTwo w =()-> System.out.println("Hello Good Morning!!");
        w.Demo();
    }
}
