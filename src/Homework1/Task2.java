package Homework1;

import java.util.Scanner;

public class Task2 {

    /*
    Задача 2:
        Въведете 4 различни числа от конзолата и разменте стойността им две по две.
        Нека числата бъдат от различен тип (int и duoble). Разпечатайте новите им стойности.
        Направете кастване (casting) конвертиране на числата веднъж от int to double и после от double to int
        и след всяко конвертиране изведете сумата им
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int temp1;
        double temp2;

        int num1 = scanner.nextInt();
        System.out.println("You entered the number " + num1);
        double num2 = scanner.nextDouble();
        System.out.println("You entered the number " + num2);
        int num3 = scanner.nextInt();
        System.out.println("You entered the number " + num3);
        double num4 = scanner.nextDouble();
        System.out.println("You entered the number " + num4);

        System.out.println();

        temp2 = num1;
        num1 = (int) num2;
        num2 = temp2;

        int sum = (int) (num1 + num2);

        System.out.println("First number has new value of " + num1 + " after switching the value with Second num which new" +
                " value is " + num2 + " which total sum is " + sum);

        System.out.println();

        temp1 = num3;
        num3 = (int) num4;
        num4 = temp1;

        double sum2 = (int) num3 +  num4;


        System.out.println("3rd number has new value of " + num3 + " after switching the value with 4rd num which new" +
                " value is " + num4 + " which total sum is " + sum2);
    }

}
