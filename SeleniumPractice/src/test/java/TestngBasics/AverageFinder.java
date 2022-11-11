package TestngBasics;

import org.jetbrains.annotations.NotNull;

public class AverageFinder {
    public static void main(String[] args) {
        //int[] array = {1, 2, 3};
        //int length = array.length;
        //int sum = 0;
//        for (int i = 0; i < length; i++) {
//            sum += array[i];
//        }
        String[] array = {"1","2","3"};
        double average = findAverage(array);
//        double average = sum / length;
        System.out.println("average of the array is: " + average);
    }
    private static double findAverage(String[] input) {
        double result = 0;
        for (String s : input) {
            result += Integer.parseInt(s);
        }
        return result/ input.length;
    }
}

