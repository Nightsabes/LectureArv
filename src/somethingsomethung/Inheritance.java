package somethingsomethung;

import somethingsomethung.models.Busdriver;
import somethingsomethung.models.Carpenter;
import somethingsomethung.models.CarpenterApprentice;
import somethingsomethung.models.Person;

public class Inheritance {
    public static void main(String[] args) {
        Person person1 = new Person("Jimmy","Neutron",12);
        System.out.println(person1.getFirstName()+ " " +
                person1.getLastName() + " is fucking awesome\n");



        Carpenter carpenter1 = new Carpenter("Rudolf","Arnesen",
                45,3);
        System.out.println(carpenter1.getLastName() + " " + carpenter1.getFirstName()+
                " har bygd " + carpenter1.getNumHousesBuilt() + " hus\n");



        Busdriver busdriver1 = new Busdriver("Mister Calcoka",
                "Tekkshuport",43,"Tistern til Aremark 24/7 speedracer");
        System.out.println("Remember to thank busdriver,\n" + busdriver1.getFirstName() + " " +
                busdriver1.getLastName() + " drives the route: " + busdriver1.getRoute()+"\n");

        busdriver1.setFirstName("Jeff");
        busdriver1.setLastName("Tangen");
        System.out.println("Bro was lying, his name was actually " +
                busdriver1.getFirstName() +" "+ busdriver1.getLastName() + "\n");

        CarpenterApprentice carpenterApprentice1 = new CarpenterApprentice("Gaus", "Roms Brummund",
                91,0,"Chinese Government");
        System.out.println(carpenterApprentice1.getFirstName());
        System.out.println(carpenterApprentice1.getNumHousesBuilt() + " lol huge L");
        System.out.println(carpenterApprentice1.getTrainingPeriod() + "\n");

        person1.printDescription();
        carpenter1.printDescription();
        carpenterApprentice1.printDescription();
        System.out.println("\n"+"\n"+"\n");




        System.out.println(person1.toString());
        System.out.println(person1);
        System.out.println(carpenter1);
        System.out.println(busdriver1);
        System.out.println(carpenterApprentice1);
    }
}
