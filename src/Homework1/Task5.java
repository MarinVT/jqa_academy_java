package Homework1;

public class Task5 {
    /*
    Задача 5:
    Да се изведат числата от 1 до 100 във възходящ и в низходящ ред
    и да се отпечатат получените резултати с помоща на for цикъл
     */
    public static void main(String[] args) {

//        printNumbers1To100АscendingOrder(1, 100);
//        printNumbers1To100DescendingOrder(1, 100);

    }

    public static void printNumbers1To100АscendingOrder(int startNum, int endNum){
        for (int i = startNum; i <= endNum; i++) {
            System.out.println(i);
        }
    }

    public static void printNumbers1To100DescendingOrder(int startNum, int endNum){
        for (int i = endNum; i >= startNum; i--) {
            System.out.println(i);
        }
    }

}
