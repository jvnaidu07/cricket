package TestngBasics;

public class javaRemoveSpecialCharacters {
    public static void main(String[] args) {
        String str = "#$j%a&va";
        //Approach-1 replaceAll()method
        String plainstr = str.replaceAll("[^a-zA-Z0-9^]", " ");
        System.out.println(plainstr);

        String str1 = "j a va  vvvv";
        str1 = str1.replaceAll("\\s", "");
        System.out.println(str1);
        String x = "        java";
        x = x.replaceAll("\\s", "");
        //t refers tab keyword
        //s refers sequence
        System.out.println(x);

            String dob = "12/12/1990/(43years)";
            System.out.println(dob);
            String split[] = dob.split("/");
            for (int i = 0; i < split.length; i++) {
                System.out.println("" + split[i]);
            }
    }

}

