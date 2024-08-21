package javaAIT;

import java.util.function.Supplier;
//supplier not take any value but give get value. otp generation
public class SupplierDemo {

    public static void main(String[] args) {

        Supplier<String> s = () -> {
            String otp = "";
            for (int i = 1; i <= 5; i++) {
                otp = otp + (int) (Math.random() * 10);
            }
            return otp;
        };
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
    }
}
