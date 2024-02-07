package somethingsomethung.models;

public class Person {

    private String firstName;
    private String lastName;
    private int age;


    public Person(String firstName,String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public void printDescription(){
        System.out.println("My name is "+ firstName +" "+ lastName +
                ". I am at age " + age + ", and I have kinapped over 6 childern");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
