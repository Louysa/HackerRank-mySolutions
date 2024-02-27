import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Day28 {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        List<List<String>> myDatabase = new ArrayList<>();
        List<String> myOutputList = new ArrayList<>();


        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            String firstName = sc.next();
            String emailID = sc.next();
            List<String> tempList = new ArrayList<>();
            tempList.add(firstName);
            tempList.add(emailID);
            myDatabase.add(tempList);
        }

        for (int i = 0; i < myDatabase.size(); i++) {
            String email = myDatabase.get(i).get(1);
            if(email.endsWith("@gmail.com")){
                myOutputList.add(myDatabase.get(i).get(0));
            }
        }
        Collections.sort(myOutputList);

        for (int i = 0; i < myOutputList.size(); i++) {
            System.out.println(myOutputList.get(i));
        }


    }
}
