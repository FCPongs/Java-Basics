public class Strings {
    public static void main(String[] args) {

        String greeting = "Hello";
        System.out.println(greeting);

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //! Length is strName.length()
        System.out.println("The length of the txt string is: " + txt.length());
        System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD" //! UpperCase is strName.length()
        System.out.println(txt.toLowerCase());   // Outputs "hello world" //! LowerCase is strName.length()

        //! Finding a Character
        String txtStr = "Please locate where 'locate' occurs!";
        System.out.println(txtStr.indexOf("locate"));
        System.out.println("---------------------------------------------------------------------\n");

        //! CONCATENATION
        System.out.println("CONCATENATION");
        String firstName = "John";
        String lastName = "Doe";
        String middleName= "Pongase";
        System.out.println(firstName + " " + lastName);
        //* OR */
        System.out.println(firstName.concat(lastName).concat(middleName));
        System.out.println("---------------------------------------------------------------------\n");

        //! SPECIAL CHARACTERS
        System.out.println("This is a: \' - Single quote");
        System.out.println("This is a: \" - Double quote");
        System.out.println("This is a: \\ - Backslash");
    }
}
