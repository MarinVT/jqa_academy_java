package Homework2;

public class Task1 {
    /*
    Да се състави метод, който приема като аргументи две числа и отпечатва на екрана техния сбор.
     */

    public static void main(String[] args) {
        sum2Numbers(1, 2);
    }

    static void sum2Numbers(int num1, int num2) {
        int result = num1 + num2;
        System.out.printf("The sum of 2 numbers is:  %d +  %d = %d ", num1, num2, result);
    }

}
