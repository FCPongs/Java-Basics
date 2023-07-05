public class TypeCasting {
    public static void main(String[] args) {
        System.out.println("Type casting is when you assign a value of one primitive data type to another type.\n");

        System.out.println("Widening Casting (automatic): converting a smaller type to a larger type size");
        int myInt = 9;
        double convertInt = myInt;
        System.out.println(myInt);          //! integer = 9
        System.out.println(convertInt);     //! double = 9.0
            System.out.println("----------------------------------------------------------------------------");

        System.out.println("Narrowing Casting (manual): converting a larger type to a smaller size type");
        double myDouble = 9.78d;            //! double = 9.78d; 
        int convertIntgr = (int) myDouble;  //! integer = 9
        System.out.println(myDouble);
        System.out.println(convertIntgr);
    }
}
