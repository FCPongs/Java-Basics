package OOP.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();

        human.SetName("Fhelry");
        human.SetAge(20);

        System.out.println(human.getAge());
        System.out.println(human.getName());

    }
}
