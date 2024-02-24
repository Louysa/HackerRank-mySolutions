import java.util.Scanner;

public class Day25 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            boolean isPrime = true;
            int value = scanner.nextInt();
            if(value==2){
                System.out.println("Prime");
                continue;
            }
            if(value%2==0 || value == 1){
                System.out.println("Not prime");
                continue;
            }


            for (int j = 2; j <= Math.sqrt(value); j++) {
                if(value % j ==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println("Prime");
            }else{
                System.out.println("Not prime");
            }
        }


    }
}
