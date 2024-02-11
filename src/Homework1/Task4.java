package Homework1;

import java.util.Scanner;

public class Task4 {
    /*
    Задача 4:
    Въведете 3 променливи от клавиатурата – брой работни часове (целочислен тип), сума пари (число
    с плаваща запетая), дали е почивен ден – булев тип.
    Съставете програма, която взема решения на базата на тези данни по следния начин:
    - ако не е почивен ден ще работя
    - ако имам пари и е почивен ден ще отида на кино
    - ако нямам – ще стоя вкъщи и ще гледам телевизия
    - ако е почивен ден
    - ако имам по-малко от 10 лв ще отида за сладолед
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfWorkingHours = Integer.parseInt(scanner.nextLine());
        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        boolean dayOff = Boolean.parseBoolean(scanner.nextLine());

        if (dayOff == false) {
            System.out.println("Today is not day off and I've a job to do.");
        } else if (amountOfMoney != 0 && dayOff == true) {
            System.out.println("Today is day off and I've a money so I will go to the cinema.");
        }  else if (amountOfMoney <= 0 && dayOff == true) {
            System.out.println("I'm going to stay home and watching TV.");
        } else if (amountOfMoney < 10 && dayOff == true) {
            System.out.println("I will go to buy an icecream");
        } else {
            System.out.println("I will not eat icecream");
        }


    }
}
