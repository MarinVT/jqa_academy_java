package Homework2;

import java.util.Scanner;

public class Task3 {
    /*
    Задача 3
    Да се прочете масив от екрана с 5 числа по избор от тип double и да се отпечатат всички резултати
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("The five numbers of elements you want to store in array are: ");

        double[] myCustomArr = new double[5];


        System.out.println("It enter elements of my arrays");
        for(int i=0; i < 5; i++) {
            myCustomArr[i]=scanner.nextDouble();
        }

        System.out.println("Entered elements are: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(myCustomArr[i] + ", ");
        }

    }

}
