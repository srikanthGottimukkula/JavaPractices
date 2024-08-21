package javaAIT;

import java.time.LocalDate;
import java.time.Month;

public class DateTimeDemo {
    public static void main(String[] args) {
        //converting string to date "parse"
        //converting date to string

        //getting current date
        LocalDate date = LocalDate.now();
        System.out.println(date);

        //getting specific method using of method
        LocalDate date1= LocalDate.of(2024,12,12);
        System.out.println(date1);

        date1 = LocalDate.of(2024, Month.OCTOBER,16);
        System.out.println(date1);

        //converting string to date using parse
        LocalDate date2 = LocalDate.parse("2024-12-16");
        System.out.println(date2);

        //adding 4 days to given date
        LocalDate days = date2.plusDays(5);
        System.out.println(days);



    }
}
