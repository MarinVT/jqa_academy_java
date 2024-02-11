package Homework2;

import java.util.Arrays;

public class Task5 {
    /*
    Задача 5
        Да се състави масив със следните стойности {10 12 1 8 4}.
        След създаването на масива да се копират стойностите в нов масив
     */

    public static void main(String[] args) {
        int[] baseArr = {10, 12, 1, 8, 4};

        int[] copyOfBaseArr = new int[baseArr.length];

        System.out.println("Old array is: ");
        for (int i = 0; i < baseArr.length; i++) {
            System.out.println(baseArr[i]);
        }

        System.out.println("New array which values are taken from the old array are: ");
        for (int i = 0; i < copyOfBaseArr.length; i++) {
            System.out.println(copyOfBaseArr[i] = baseArr[i]);
        }

        // Using arraycopy()

        String[] carBrands = {"BMW", "Mercedes", "Audi", "Ford", "Lada", "Fiat"};
        String[] newArrCopyOfCarBrand = new String[carBrands.length];
        System.arraycopy(carBrands, 0, newArrCopyOfCarBrand, 0, carBrands.length);
//        System.out.println("New Brands Are: " + Arrays.toString(newArrCopyOfCarBrand));
    }
}
