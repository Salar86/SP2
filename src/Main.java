public class Main {
    public static void main(String[] args) {
        FleetOfCars fleet = new FleetOfCars();
        Car c1 = new GasolineCar("AJ22548", "Honda", "Civic", 5, 25);
        Car c2 = new GasolineCar("DH36598", "Toyota", "Yaris", 5, 20);
        Car c3 = new GasolineCar("DT85478", "Lamborghini", "Countach", 2, 3);
        Car c4 = new GasolineCar("PL01088", "Audi", "Q8", 5, 8);
        Car c5 = new ElectricCar("BB46987", "Nissan", "LEAF", 3,24, 175);
        Car c6 = new ElectricCar("FO08456", "Toyota", "RAV4", 5,28, 153);
        Car c7 = new ElectricCar("CH69852", "Tesla", "Model S", 5,75, 417);
        Car c8 = new ElectricCar("TA30048", "Porsche", "Taycan", 2,79, 350);
        Car c9 = new DieselCar("SS34654", "Ford","Ka", 4, 20, true);
        Car c10 = new DieselCar("LT52147", "Mercedes", "CLA200D", 5, 21, false);
        Car c11 = new DieselCar("HO54037", "BMW", "X3", 5, 16, true);
        Car c12 = new DieselCar("ED52414", "Jaguar", "XF", 4, 19, false);
        fleet.addCar(c1);
        fleet.addCar(c2);
        fleet.addCar(c3);
        fleet.addCar(c4);
        fleet.addCar(c5);
        fleet.addCar(c6);
        fleet.addCar(c7);
        fleet.addCar(c8);
        fleet.addCar(c9);
        fleet.addCar(c10);
        fleet.addCar(c11);
        fleet.addCar(c12);
        System.out.println(fleet);
        System.out.println("The total registration fee is "+fleet.getTotalRegistrationFeeForFleet()+" kr.");




    }
}
