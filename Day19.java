import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface AdvancedArithmetic{
    int divisorSum(int n);
}
class Test implements AdvancedArithmetic {
    public int divisorSum(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                list.add(i);
            }
        }
        int sum=0;
        for (int i = 0; i < list.size(); i++) {
            sum+=list.get(i);
        }

        return sum;
    }
}
public class Day19 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Test();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }

}

