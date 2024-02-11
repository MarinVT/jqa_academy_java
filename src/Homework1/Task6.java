package Homework1;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task6 {

    /*
    Задача 6:
    Да се въведе число от клавиатурата от 1 до 7 и да се изведе
    съобщение кой ден от седмицата отговаря на съответно число с подходящо съобщение
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter One number 1 to 7 to day of the week.");
        int dayOfWeek = Integer.parseInt(scanner.nextLine());


            if (dayOfWeek == 1) {
                System.out.println("Today is Monday");
            } else if (dayOfWeek == 2) {
                System.out.println("Today is Tuesday");
            } else if (dayOfWeek == 3) {
                System.out.println("Today is Wednesday");
            } else if (dayOfWeek == 4) {
                System.out.println("Today is Thursday");
            } else if (dayOfWeek == 5) {
                System.out.println("Today is Friday");
            } else if (dayOfWeek == 6) {
                System.out.println("Today is Saturday");
            } else if (dayOfWeek == 7) {
                System.out.println("Today is Sunday");
            } else {
                System.out.println("Invalid number or added text!!!!");
            }

    }


}
