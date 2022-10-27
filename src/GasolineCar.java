public class GasolineCar extends AFuelCar{
    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }
    public String getFuelType(){
        return "Gasoline";
    }
    @Override
    public int getRegistrationFee() {
        if(getKmPrLitre()<5){
            return 10740;
        }
        if(getKmPrLitre()<10){
            return 5500;
        }
        if(getKmPrLitre()<15){
            return 2340;
        }
        if(getKmPrLitre()<20){
            return 1050;
        }
        return 330;

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
