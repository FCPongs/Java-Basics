public class Loops {
    public static void main(String[] args) {
        int counter = 5;
        
        System.out.println("While Loop");
        while(counter >= 0){
            System.out.println("Counter is: " + counter);
            counter--;
        }
        System.out.println("\nFor Loop");
        for(int counter2 = 5; counter2 >= 0; counter2--){
            System.out.println("Counter is: "+counter2);
        }

        //! For-Each Loop
        System.out.println("\nFor-Each Loop");
        String[] names = {"Fhelry","John","Alex","Brandon"};
        for(String x: names){
            System.out.println(x);
        }
    }
}
