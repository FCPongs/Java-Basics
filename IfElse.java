public class IfElse {
    public static void main(String[] args) {

        boolean checker = true;
        System.out.println(checker);
        
        if (checker = true){
            System.out.println("The condition is True"); //! This will run if checker is true
        }
        else
            System.out.println("The condition is False");

        //! Short Hand if else
        //* variable = (condition) ? expressionTrue :  expressionFalse; */
        int time = 20;
        String check = (time > 18) ? "Legal" : "Minor";

        System.out.println(check);
    }
}
