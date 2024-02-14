package Homework3;


/*
Да се създаде клас CarPerson, с main метод.
В рамките на main метода да се създадат 2 обекта от тип Car.

Да се зададат стойности на всеки от колите за year, price,
fuelTankCapacity, freeFuel, engineFuelOperationSystem.Нека едината кола да е спортна.
На едната от колата да е заделено 35 литра гориво (чрез
метода useFuel), а на другия, да се смени горивната система (чрез
метода changeЕngineFuelOperationSystem), след което да се изведат на екрана всичките полета на дете коли
 */

import java.util.ArrayList;
import java.util.List;

public class CarPerson {

    public static void main(String[] args) {

        Car sportCar = (new Car(
                2020,
                25.222,
                true,
                50,
                35,
                "Petrol"));

        Car urbanCar = (new Car(
                2016,
                10.500,
                false,
                60,
                35,
                "Diesel"));

//        System.out.println(sportCar.toString());
        System.out.println("My sport car properties info");
        List sportCarProps = new ArrayList<>();
        sportCarProps.add(sportCar);

        System.out.println("My original car properties before the modifications" + sportCar);
        System.out.println("Original fuel operation system is: " + sportCar.getEngineFuelOperationSystem());
//        sportCar.changeЕngineFuelOperationSystem("Diesel");
        System.out.println("------------------------------------------------------");
        sportCar.setEngineFuelOperationSystem("Diesel");
        System.out.println("My new engine fuel operation system has been changed to " + sportCar.getEngineFuelOperationSystem());
        System.out.println("My new car with newest modifications: ");
        System.out.println(sportCarProps);

        System.out.println("---------------------------------------------------------");
        System.out.print("My urban car properties info:");
        List urbanCarListProps = new ArrayList<>();
        urbanCarListProps.add(urbanCar);
        System.out.println(urbanCarListProps);
        System.out.println("Info about fuel consumption");
        urbanCar.useFuel(30);

    }

}
