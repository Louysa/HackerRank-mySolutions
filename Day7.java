import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day7 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");


        for (int i = 0; i < arrTemp.length/2; i++) {
            String temp = arrTemp[i];
            int number = (arrTemp.length-1) -i;
            arrTemp[i] = arrTemp[number];
            arrTemp[number] = temp;
        }
        for (int i = 0; i < arrTemp.length; i++) {
            System.out.print(arrTemp[i] + " ");
        }

        bufferedReader.close();
    }
}
