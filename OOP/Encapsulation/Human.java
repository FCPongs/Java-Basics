package OOP.Encapsulation;

public class Human {

    //* Ideally, you need to PRIVATE your variables 
    private int age;
    private String name;
    
    //todo: You can access (or GET) them indirectly
    public int getAge(){
        return age; //! You can access the age here since it is in the same class
    }
    public String getName(){
        return name; //! You can access the name here since it is in the same class
    }
    //todo: You can assign (or SET) them indirectly
    public void SetAge(int a){
        age = a;
    }
    public void SetName(String n){
        name = n;
    }
}
