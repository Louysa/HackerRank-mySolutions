import java.util.Scanner;

public class Day6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String string;
        
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < number; i++) {
            string = sc.nextLine();
            String temp1 ="";
            String temp2 ="";
            for (int j = 0; j < string.length(); j++) {
                if(j%2==0){
                    temp1 = temp1 + string.substring(j, j+1);
                }
                else{
                    temp2 = temp2 + string.substring(j, j+1);
                }

            }
            System.out.println(temp1 + " " + temp2);

        }
        sc.close();
    }
}
