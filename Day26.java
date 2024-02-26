import java.util.Date;
import java.util.Scanner;

public class Day26 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int returnDay = sc.nextInt();
        int returnMonth = sc.nextInt();
        int returnYear = sc.nextInt();

        int expectDay = sc.nextInt();
        int expectMonth = sc.nextInt();
        int expectYear = sc.nextInt();

        Date date1 = new Date(returnYear, returnMonth, returnDay);
        Date date2 = new Date(expectYear, expectMonth, expectDay);

        if(date1.after(date2)){
            if(returnYear>expectYear){
                System.out.println(10000);
            }else if(returnMonth>expectMonth){

                System.out.println( (returnMonth-expectMonth) * 500 );
            }else{
                //

                System.out.println((returnDay-expectDay)*15);
            }
        }
        else{
            System.out.println("0");
        }


    }
}
