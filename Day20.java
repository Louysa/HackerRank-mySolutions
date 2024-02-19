import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Day20 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        int count=0;
        int sort=0;
        for (int j = 0; j < a.size(); j++) {
            for (int i = 0; i < a.size()-1; i++) {
                if(a.get(i) > a.get(i+1)){
                    count++;
                    sort++;
                    int temp = a.get(i+1);
                    a.set(i+1, a.get(i));
                    a.set(i, temp);
                }
            }
            if(sort==0){
                break;
            }

        }
        // Write your code here
        System.out.println("Array is sorted in "+count+" swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(a.size()-1));

        bufferedReader.close();
    }
}
