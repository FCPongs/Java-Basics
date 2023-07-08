public class Methods {
    public static void main(String[] args) {

    //todo This is the main method

        //* FUNCTIONS CALLED
        hello();
        greet("Fhelry"); //! Where you will add the argument
        greetAge("Fhelry",20);
        System.out.println(add(5, 12));
    }

    //todo Outside the main method

        //* FUNCTIONS
        /*  YOU NEED "STATIC" SO THAT YOU NO LONGER
             HAVE TO CREATE AN OBJECT FOR IT   */

        static void hello(){ 
            System.out.println("Hello");
        }
        static void greet(String name){  //! You have a parameter
            System.out.println("Hello! "+name);
        }
        static void greetAge(String name, int age){ //! Multiple parameter
            System.out.println("Hello "+name+" your age is "+age);
        }
        static int add(int a, int b){
            return (a+b);
        }
}
