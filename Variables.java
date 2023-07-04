public class Variables{
    public static void main(String[] args) {
        System.out.println("Variables");
        
        // This is how you make a comment

        /*
        Example of a
        Multi-line comment
         */

        //** VARIABLES
        /*
        String - stores text, such as "Hello". String values are surrounded by double quotes
        int - stores integers (whole numbers), without decimals, such as 123 or -123
        float - stores floating point numbers, with decimals, such as 19.99 or -19.99
        char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
        boolean - stores values with two states: true or false
        */

        System.out.println("To print a string like this, use \"\""); //! Use ""
        //! Variable type: String
        String Fname = "Fhelry";
        System.out.println(Fname);

        String Lname = "Pongase";
        System.out.println(Lname);

        String FullName = Fname +" "+ Lname;
        System.out.println(FullName);

        System.out.println("Greetings! "+FullName);

        //! Variable type: Int/Float
        int num = 20;
        System.out.println(num);

        //! Variable type: Char (Stores single character)
        char sample = 'h';
        System.out.println(sample);

        //! Variable type: Boolean
        boolean thisIsTrue = true;
        System.out.println(thisIsTrue);

        //! Multiple Variables
        int x = 5, y = 6, z = 50;
        System.out.println(x + y + z);
        

        //! Non-Primitive Data Types
        /*
         * Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
         * A primitive type has always a value, while non-primitive types can be null.
         * A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
         */
        
    }
}