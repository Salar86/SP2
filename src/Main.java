public class Main {
    public static void main(String[] args) {
        FleetOfCars fleet = new FleetOfCars();
        Car c1 = new GasolineCar("AJ22548", "Honda", "Civic", 5, 25);
        Car c2 = new GasolineCar("DH36598", "Toyota", "Yaris", 5, 20);
        Car c3 = new ElectricCar("BB46987", "Nissan", "LEAF", 3,24, 175);
        Car c4 = new ElectricCar("FO08456", "Toyota", "RAV4", 5,42, 166);
        Car c5 = new DieselCar("SS34654", "Ford","Ka", 4, 20, true);
        Car c6 = new DieselCar("LT52147", "Mercedes", "CLA200D", 5, 21, false);
        fleet.addCar(c1);
        fleet.addCar(c2);
        fleet.addCar(c3);
        fleet.addCar(c4);
        fleet.addCar(c5);
        fleet.addCar(c6);
        System.out.println(fleet);
        System.out.println("The total registration fee is "+fleet.getTotalRegistrationFeeForFleet()+" kr.");




    }
}
