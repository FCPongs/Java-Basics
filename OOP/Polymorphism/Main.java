package OOP.Polymorphism;

public class Main {
    public static void main(String[] args) {
        System.out.println("Means many forms");
        System.out.println("Classes doing the same thing in different way");

        Animal animal = new Animal();
        animal.eat();

        //* METHOD OVERRIDE
        Dog dog = new Dog();
        dog.eat(); //! Dog class OVERRIDES the function of eat in Animal

        Cat cat = new Cat();
        cat.eat(); //! Cat class OVERRIDES the function of eat in Animal

        //* METHOD OVERLOADING - Same name but different parameter
        animal.eat(3);

        //* SAME THING IN A DIFFERENT WAY
    }
}
