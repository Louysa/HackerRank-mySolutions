import java.util.Scanner;

public class Day21 <T> {
    /**
     * Method Name: printArray
     * Print each element of the generic array on a new line. Do not return anything.
     *
     * @param A generic array
     **/
    static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    // Write your code here

}
public class Generics {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        n = scanner.nextInt();
        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            stringArray[i] = scanner.next();
        }

        Day21<Integer> intPrinter = new Day21<Integer>();
        Day21<String> stringPrinter = new Day21<String>();
        intPrinter.printArray( intArray  );
        stringPrinter.printArray( stringArray );
        if(Day21.class.getDeclaredMethods().length > 1){
            System.out.println("The Printer class should only have 1 method named printArray.");
        }
    }
}
