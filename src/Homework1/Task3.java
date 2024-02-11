package Homework1;

import java.util.Scanner;

public class Task3 {
    /*
    Въведете 3 числа от клавиатурата ч1, ч2 и ч3.
    Разменете стойностите им така, че ч1 да има стойността на ч2,
    ч2 да има стойността на ч3,  а ч3 да има старатастойност на ч1.
    Съберете ч1 и ч2 и след това намерете разликата между получения сбор и ч3.
    Разпечатете стойностите на числата на етапи
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();


//        int num1 = 1;
//        int num2 = 2;
//        int num3 = 3;

        System.out.println("Numbers before switching  the values:"
                + " num1 = " + num1
                + ", num2 = " + num2
                + ", num3 = " + num3
        );

        int temp1 = num1;
        num1 = num2;
        num2 = num3;
        num3 = temp1;

        int resultSumNum1Num2 = num1 + num2;

        System.out.println("Total sum of num1 and num 2 is: " + resultSumNum1Num2);
        System.out.println();
        int differenceTotalSumNum1Num2 = resultSumNum1Num2 - num3;
        System.out.println("Difference of total sum to num1 and num 2 versus num 3 is: " + differenceTotalSumNum1Num2);

    }

}
