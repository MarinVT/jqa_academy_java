package Homework1;

public class Task7 {


    /*
    Задача 7:
    Да се изведат числата от 1 до 100 без числата от 54 до 74.
    След извършените операции да се отпечатат получените резултати. (hint - continue)
     */

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if (i >= 54) {
                if (i <= 74) {
                    continue;
                }
            }
            System.out.println(i);

        }

    }
}
