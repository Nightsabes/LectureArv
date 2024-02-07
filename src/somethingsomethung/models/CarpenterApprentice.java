package somethingsomethung.models;

public class CarpenterApprentice extends Carpenter {

    private String trainingPeriod;

    public CarpenterApprentice(String firstName,String lastName, int age, int numHousesBuilt, String trainingPeriod) {
        super(firstName, lastName, age, numHousesBuilt);
        this.trainingPeriod = trainingPeriod;
    }

    public String getTrainingPeriod() {
        return trainingPeriod;
    }

    public void setTrainingPeriod(String trainingPeriod) {
        this.trainingPeriod = trainingPeriod;
    }
}
