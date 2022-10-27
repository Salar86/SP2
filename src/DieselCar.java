public class DieselCar extends AFuelCar{
    private boolean particleFilter;



    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.particleFilter = particleFilter;
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }

    @Override
    public int getRegistrationFee() {
        int totalRegistrationFee = 0;
        if(getKmPrLitre() < 5){
            totalRegistrationFee = 10740+15260; //for diesel fueled cars there is an additional fee because of a different cost of fuel
        }
        if(getKmPrLitre() < 10){
            totalRegistrationFee = 5500+2770;
        }
        if(getKmPrLitre() < 15){
            totalRegistrationFee = 2340+1850;
        }
        if(getKmPrLitre() < 20){
            totalRegistrationFee = 1050+1390;
        }
        if(getKmPrLitre() < 25){
            totalRegistrationFee = 330+130;
        }
        if(!hasParticleFilter()){
            return totalRegistrationFee + 1000;
        }
        return totalRegistrationFee;

    }
    public boolean hasParticleFilter() {
        return particleFilter;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
