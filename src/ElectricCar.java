public class ElectricCar extends ACar{
    private int batteryCapacity;
    private int maxRange;


    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }


    @Override
    public int getRegistrationFee() {
        //In order to calculate the registration fee we need to convert watt hour per kilometer to kilometer per litre
        int kmPrLitreConversion = (int) (100 / (getWhPrKm() / 91.25));
        if(kmPrLitreConversion<5){
            return 10740;
        }
        if(kmPrLitreConversion<10){
            return 5500;
        }
        if(kmPrLitreConversion<15){
            return 2340;
        }
        if(kmPrLitreConversion<20){
            return 1050;
        }
        return 330;

    }
    public int getBatteryCapacityKwh(){
        return batteryCapacity;
    }

    public int getMaxRangeKm() {
        return maxRange;
    }

    public int getWhPrKm(){
        //1 kilowatt-hour amounts to 1000 watt hours and by dividing that with our maximum range we will get the watt hour per kilometer
        return (getBatteryCapacityKwh()*1000) / getMaxRangeKm();
    }


    @Override
    public String toString() {
        return super.toString()+"\n Fuel type: Electric \n Battery capacity: "+batteryCapacity+" kWh \n Maximum range: "+maxRange+" km \n";
    }
}
