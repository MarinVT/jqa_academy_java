package Homework3;

/*
year – числова стойност показваща година на производство на колата
price – числова стойност (не е задължително да е цяло число) показваща цената на колата
isSportCar – булева стойност – дали колата е спортна или не
fuelTankCapacity – числова стойност за размера на резервоара
freeFuel – числова стойност показваща наличното свободно гориво
engineFuelOperationSystem – текстово поле за вида гориво,което използва автомобила
 */
public class Car {

    private int yearManufacturing;
    private double priceCar;
    private boolean isCarSportModel;
    private int fuelTankCapacity;
    private int freeFuel;
    private String engineFuelOperationSystem;

    // Constructor


    public Car(int yearManufacturing, double priceCar, boolean isCarSportModel, int fuelTankCapacity, int freeFuel, String engineFuelOperationSystem) {
        this.yearManufacturing = yearManufacturing;
        this.priceCar = priceCar;
        this.isCarSportModel = isCarSportModel;
        this.fuelTankCapacity = fuelTankCapacity;
        this.freeFuel = freeFuel;
        this.engineFuelOperationSystem = engineFuelOperationSystem;
    }

    public int getYearManufacturing() {
        return yearManufacturing;
    }

    public void setYearManufacturing(int yearManufacturing) {
        this.yearManufacturing = yearManufacturing;
    }

    public double getPriceCar() {
        return priceCar;
    }

    public void setPriceCar(double priceCar) {
        this.priceCar = priceCar;
    }

    public boolean isCarSportModel() {
        return isCarSportModel;
    }

    public void setCarSportModel(boolean carSportModel) {
        isCarSportModel = carSportModel;
    }

    public int getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(int fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public int getFreeFuel() {
        return freeFuel;
    }

    public void setFreeFuel(int freeFuel) {
        this.freeFuel = freeFuel;
    }

    public String getEngineFuelOperationSystem() {
        return engineFuelOperationSystem;
    }

    public void setEngineFuelOperationSystem(String engineFuelOperationSystem) {
        this.engineFuelOperationSystem = engineFuelOperationSystem;
    }

    /*
        Класът да дефинира следните методи:
        -метод void changeЕngineFuelOperationSystem(String newЕngineFuelOperationSystem), който сменя
        стойността на полето engineFuelOperationSystem със стойността подадена като параметър.
        -метод void useFuel(double fuel), който намалява свободното гориво
        (freeFuel) със стойността подадена като аргумент.
        Ако стойността на аргумента е по-голяма от наличното гориво, извеждa
        съобщение "Not enough free fuel!"
         */
    public void changeЕngineFuelOperationSystem(String newЕngineFuelOperationSystem) {
        System.out.println(engineFuelOperationSystem = newЕngineFuelOperationSystem);
    }

    public void useFuel(double fuel) {
        double fuelConsumption = freeFuel - fuel;

        if (fuel >= freeFuel) {
            System.out.println("Not enough free fuel!");
        } else {
            System.out.println(fuelConsumption);
        }

    }

    @Override
    public String toString() {
        return "Car properties are:" +
                " yearManufacturing = " + yearManufacturing +
                ", priceCar = " + priceCar +
                ", isCarSportModel = " + isCarSportModel +
                ", fuelTankCapacity = " + fuelTankCapacity +
                ", freeFuel = " + freeFuel +
                ", engineFuelOperationSystem = '" + engineFuelOperationSystem + '\'';
    }
}
