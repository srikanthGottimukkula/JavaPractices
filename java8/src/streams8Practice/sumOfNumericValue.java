package streams8Practice;
//Find sum of all digits of a number in Java 8?
public class sumOfNumericValue {
    public static void main(String[] args) {
        int num = 12789;

        int sum = String.valueOf(num)//convert number to String
                .chars() //convert String to char
                .map(Character::getNumericValue) //convert char to numeric number
                .sum();
        System.out.println("the total sum is :" + sum);

    }
}
