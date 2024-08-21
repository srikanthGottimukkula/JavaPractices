package practiceStreams;

public class SumGivenNum {
    public static void main(String[] args) {
        int num = 12345;

        System.out.println("the sum is :"+ String.valueOf(num).chars().map(Character::getNumericValue).sum());


    }
}
