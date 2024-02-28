public class Day29 {
    public static int bitwiseAnd(int N, int K) {
        // Write your code here
        int A = 0;
        int B = 0;
        int returnValue= -1;
        int temp = 0;
        for (int i = 0; i <= N; i++) {
            A = i;
            for (int j = i+1; j <= N; j++) {
                B = j;
                temp = A & B;
                if(temp < K){
                    if(temp>returnValue){
                        returnValue = temp;
                    }
                }
            }
        }
        return returnValue;
    }
}
