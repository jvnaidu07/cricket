public class Switch123 {
    public static void main(String[] args) {
        int num1=7,num2=9;
        String operation="add";
        switch (operation){
            case "add":
                System.out.println(num1+num2);
            case "sub":
               System.out.println(num1-num2);
            case "mul":
                System.out.println(num1*num2);
            case "div":
                System.out.println(num1/num2);
            case "mod div":
                System.out.println(num1%num2);
        }
    }
}

