package ForPackageTwo;

import ForPackageOne.A;

public class C extends A{
    public static void main(String[] args) {
        A aClass = new A();
        //! To access variable outside the package, make it PUBLIC  
        System.out.println(aClass.marks);
        /* 
        ? System.out.println(aClass.score); 
        ! CANNOT be accessed since it has a PRIVATE modifier
        */ 
    }
}
