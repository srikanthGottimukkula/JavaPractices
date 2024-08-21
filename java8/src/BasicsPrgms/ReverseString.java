package BasicsPrgms;

public class ReverseString {
    public static void main(String[] args) {
//        String s = "srikanth";
//
//        StringBuffer sb = new StringBuffer(s);
//        System.out.println(sb.reverse());


        //approach-2
        String s = "java";
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev+s.charAt(i) ;
        }
        System.out.println(rev);
    }
}
