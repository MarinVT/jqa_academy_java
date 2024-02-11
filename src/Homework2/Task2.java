package Homework2;

public class Task2 {
    /*
    Задача 2
    Да се състави метод, който приема като аргументи две числа и връща тяхното средноаритметично.
     */

    public static void main(String[] args) {
        averageSum2Numbers(2.5,3.5);
    }


    static void averageSum2Numbers(int num1, int num2) {
        int resultAvrg = (num1 + num2) / 2;
        System.out.println("Average result of " + num1 + " and " + num2 + " is " + resultAvrg);
    }

    static void averageSum2Numbers(double num1, double num2) {
        double resultAvrg = (num1 + num2) / 2;
        System.out.println("Average result of " + num1 + " and " + num2 + " is " + resultAvrg);
    }

}
