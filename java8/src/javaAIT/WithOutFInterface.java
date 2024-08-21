package javaAIT;

interface MyInterfaceOne{

    public void Demo();
}
//without functional interface
public class WithOutFInterface implements MyInterfaceOne {

    @Override
    public void Demo() {
        System.out.println("Good morning!!");
    }

    public static void main(String[] args) {
        WithOutFInterface w = new WithOutFInterface();
        w.Demo();

    }

}
