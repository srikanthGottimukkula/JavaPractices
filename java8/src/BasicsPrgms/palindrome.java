package BasicsPrgms;

public class palindrome {
    public static void main(String[] args) {
        String s = "madam";
//        String x ="";
//        for(int i=s.length()-1;i>=0;i--){
//            x =x+s.charAt(i);
//        }
//      if(s.equals(x)){
//          System.out.println("yes palindorme");
//      }else {
//          System.out.println("not");
//      }

        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        String s1 = sb.toString();
        if(s.equals(s1)){
            System.out.println("yes polindrome!!");
        }else {
            System.out.println("not polidrome!!");
        }













    }

}
