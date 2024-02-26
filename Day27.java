public class Day27 {
    public static class TestDataEmptyArray{
        public static int[] get_array(){
            int newArray[] = new int[0];
            return newArray;
        }
    }
    public static class TestDataUniqueValues{
        public static int[] get_array(){
            int newArray[] = new int[10];
            newArray[0] = 40;
            newArray[1] = 10;
            newArray[2] = 38;
            newArray[3] = 20;
            newArray[4] = 25;
            newArray[5] = 30;
            newArray[6] = 56;
            newArray[7] = 22;
            newArray[8] = 45;
            newArray[9] = 50;

            return newArray;
        }
        public static int get_expected_result(){
            return 1;
        }
    }

    public static class TestDataExactlyTwoDifferentMinimums{
        public static int[] get_array(){
            int newArray[] = new int[2];
            newArray[0] = 5;
            newArray[1] = 5;
            

            return newArray;
        }
        public static int get_expected_result(){
            return 0;
        }
    }
}
