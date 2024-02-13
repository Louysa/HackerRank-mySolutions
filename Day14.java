public class Day14 {
    class Difference {
        private int[] elements;
        public int maximumDifference;

        // Add your code here

        Difference(int[] array){
            this.elements = array;
        }
        void computeDifference(){
            maximumDifference = Integer.MIN_VALUE;
            for (int i = 0; i < elements.length; i++) {
                for (int j = i+1; j < elements.length; j++) {
                    int difference = Math.abs(elements[i]-elements[j]);
                    if(difference>=maximumDifference){
                        maximumDifference = difference;
                    }
                }
            }
        }

    }
}
