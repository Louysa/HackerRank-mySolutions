import java.util.HashMap;
import java.util.Scanner;

public class Day8 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String,Integer> hashMap = new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            hashMap.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(hashMap.containsKey(s)){
                System.out.println(s + "=" + hashMap.get(s));
            }
            else{
                System.out.println("Not found");
            }

        }
        in.close();
    }

}
