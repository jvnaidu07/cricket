package JavaQuestions;

public class AverageCalculation {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6};
        int len = array.length;
        float sum = 0;

        for (int i=0; i<len; i++){
            sum += array[i];

        }
        float avg = sum/len;
        System.out.println(avg);
    }
}

// instead of float we can use double also double is a primitive datatype
//float =The float keyword is a data type that can store fractional numbers from