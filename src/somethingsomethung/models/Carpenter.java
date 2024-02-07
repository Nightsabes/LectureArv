package somethingsomethung.models;

public class Carpenter extends Person {

    //Fornavn, etternavn og alder samt da noe som er litt konkret for um snekker som er antall hus bydg

    private int numHousesBuilt;

    public Carpenter(String firstName,String lastName, int age, int numHousesBuilt){
        super(firstName,lastName,age);
        this.numHousesBuilt = numHousesBuilt;
    }

    public int getNumHousesBuilt() {
        return numHousesBuilt;
    }

    public void setNumHousesBuilt(int numHousesBuilt){
        this.numHousesBuilt = numHousesBuilt;
    }
}
