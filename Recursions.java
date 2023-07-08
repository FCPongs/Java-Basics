public class Recursions {
    public static void main(String[] args) {
        //! RECURSION- A method that calls itself
        sayHi(3);

        System.out.println(factorial(5));

        System.out.println(add(10));
    }
    static void sayHi(int count){
        System.out.println("Hi");

        if(count <= 1){
            return; //! If count reaches 1, it will return (or stop)
        }
        sayHi(count - 1); //! It will call again but subtracts 1 to count
    }
    static int add(int given){
        if(given == 0){
            return 0;
        }else{
            System.out.println("add(" + given + ") = " + given + " + add(" + (given - 1) + ")"); //! Explanation
            return given + add(given-1);
        }
    }
    static int factorial(int num){
        if(num == 1){ //! If num reaches to 1 then stop - 3! = 3 * 2 * 1
            return 1;
        } else {
            return num * factorial(num - 1);
            /*
            5 * 4
            |   \__ recursion with argument as '4' and returns the result of calling same function
            
             */
        }
        
    }
}
