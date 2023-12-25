package src_onlineclass.DEC24_ARRAY;

public class Ex0108 {
    public static void main(String[] args) {


        // Create a program that determines whether a given year is a leap year.
        // A leap year is divisible by 4
        // but not by 100 unless it is also divisible by 400
        // use an if-else statement to make this determination.

        // coding ->
        // 1. user input --> ?
        // 2. Rough Logic --> (year%4==0)-> Leap and ( (year%100==0)->Leap or (year%400==0))
        // 3. Brute Force
        // 4. Logic correction

        int  year =2000;
        if( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ){
                System.out.println(year + " Is a Leap Year");
            } else{
            System.out.println(year+ " Is not a Leap Year");
        }
        }
    }

