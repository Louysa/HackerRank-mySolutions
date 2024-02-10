import java.util.ArrayList;
import java.util.List;

public class Day11 {

    public static void main(String[] args) {
        List<List<Integer>> myList = new ArrayList<>();
        int max = -63;
        int sum = 0;
        for (int i = 0; i < myList.size()-2; i++) {
            for (int j = 0; j < myList.size()-2; j++) {
                sum = myList.get(i).get(i) + myList.get(i).get(i+1) + myList.get(i).get(i+2)
                                            + myList.get(i+1).get(i+1)+
                        myList.get(i+2).get(i)+myList.get(i+2).get(i+1) + myList.get(i+2).get(i+2);
                if(sum>=max){
                    max=sum;
                }
            }
        }
        System.out.println(max);
    }
}
