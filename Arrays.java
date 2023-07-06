public class Arrays {
    public static void main(String[] args){

        //! To declare an array, define the variable type with square brackets
        char[] letters = {'a','b','c','d','e','f','g'};
        System.out.println(letters);
        letters[0] = 'p';
        System.out.println(letters[0]); //* You can access an array element by referring to the index number.

        int[] myNum = {10, 20, 30, 40};
        for(int x: myNum)
        System.out.print(x);
    }
}
