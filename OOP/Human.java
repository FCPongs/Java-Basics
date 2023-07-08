package OOP;

public class Human {
    //! We create variables to be assigned to the attributes (in the contructor)
    String HumanName;
    int HumanAge;
    double HumanWeight;

    //! This is the CONSTRUCTOR, where we have the attributes (inside)
    Human(String name, int age, double weight){

        //? this. = humanName.name-- Human's name
        this.HumanName = name;
        this.HumanAge = age;
        this.HumanWeight = weight;
    }
    void greet(){
        System.out.println("Hello! " + this.HumanName);
    }
}
