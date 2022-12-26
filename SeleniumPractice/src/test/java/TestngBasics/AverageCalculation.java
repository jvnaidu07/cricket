package TestngBasics;

public class AverageCalculation {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        int len = array.length;
        float sum  = 0;
        for (int i=0; i<len; i++){
            sum += array[i];
        }
        float average = sum/len;
        System.out.println(average);
    }
}

