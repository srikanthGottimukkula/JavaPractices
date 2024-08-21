public class CalculatorDemo {
    public static void main(String[] args) {

        Calculator cal = (int a, int b)-> a+b;

        System.out.println( cal.add(2,3));

    }
}
