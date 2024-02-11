package Homework1;

import java.util.Scanner;

public class Task1 {

    /*
    Задача 1:
    Да се изпишат подканващи съобщения към user, с които да въведе две числа от клавиатурата (тип int или double).
    След всяко въвеждане числата да бъдат отпечатени с подходящ текст.
    Да се въведе и 3-то число като се провери дали то е между първото и второто, като се изведе подходящо съобщение.

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 2 numbers");

        int num1 = scanner.nextInt();
        System.out.println("You entered the number " + num1);
        int num2 = scanner.nextInt();
        System.out.println("You entered the number " + num2);
        int num3 = scanner.nextInt();
        System.out.println("You entered the number " + num3);

        System.out.println();

//        if (num1 < num3 && num2 > num3) {
//            System.out.println(num3 + " is between " + num1 + " and " + num2);
//        } else {
//            System.out.println(num3 + " is not between " + num1 + " and " + num2);
//        }


        enterNumbersWithSpecificMessage(num1, num2, num3);

    }

    public static void enterNumbersWithSpecificMessage(int num1, int num2, int num3) {

        System.out.println("If the 3rd number " + num3 + " is between " + num1 + " and " + num2 + " you will see a new message!");

        if (num1 < num3 && num2 > num3) {
            System.out.println(num3 + " is between " + num1 + " and " + num2);
        } else {
            System.out.println(num3 + " is not between " + num1 + " and " + num2);
        }

    }
}
