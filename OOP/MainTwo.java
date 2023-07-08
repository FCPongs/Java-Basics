package OOP;

public class MainTwo {
    //! This will be mainly focused on CONSTRUCTORS

    public static void main(String[] args) {

    //! We just created an object with an attribute
    Human human1 = new Human("Fhelry",20,80); //* An instance to the class */
    System.out.println(human1.HumanAge); // We printed human1's age
    System.out.println(human1.HumanName); // We printed human1's name
    System.out.println(human1.HumanWeight+"\n"); // We printed human1's weight

    Human human2 = new Human("Rosifel",47,60); //* Another human */
    System.out.println(human2.HumanAge); // We printed human1's age
    System.out.println(human2.HumanName); // We printed human1's name
    System.out.println(human2.HumanWeight+"\n"); // We printed human1's weight

    human1.greet();
    human2.greet();
    }


}
