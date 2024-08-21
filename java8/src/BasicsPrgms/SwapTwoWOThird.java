package BasicsPrgms;

public class SwapTwoWOThird {
    public static void main(String[] args) {
        String a = "hello"; //6
        String b = "world"; //5

        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());
        System.out.println("b swapping is:" + b);
        System.out.println("a swapping is : " + a);

        int x =1;
        int y=2;
        x = x+y; // 3
        y=x-y; //3-2--1
        x=x-y;//3-1--2
        System.out.println(y);
        System.out.println(x);



    }


}
