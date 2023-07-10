package OOP.Polymorphism;

public class Animal {
    public void eat(){
        System.out.println("nom nom");
    }
    public void eat(int times){
        while(times!=0){
            System.out.println("nom nom");
            times--;
        }
        
    }
}
