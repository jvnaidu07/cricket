package TestngBasics;

public class javaSplitConcept {
    public static void main(String[] args) {

        String str = "Hello-welcome-to-java-world";
        String parts[] = str.split("-");
        for (int i=0; i<parts.length; i++){
            System.out.println("==>" + parts[i]);
       }
        String str1 = "jupalle-venkateswara-naidu";
        String name[] = str1.split("-");
        for (int i=0; i< name.length; i++){
            System.out.println("---" + name[i]);
        }
        String str3 = "buy-a-laptop";
        String buy[] = str3.split("-");
        for (int i=0; i< buy.length; i++){
            System.out.println("" + buy[i]);
        }
   }
}
