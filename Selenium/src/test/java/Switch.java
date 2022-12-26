public class Switch {
    public static void main(String[] args) {
        int num1 = 20,
            num2 = 40;

        String operation = "add";
        switch (operation) {
            case "add":
                System.out.println(num1 + num2);
                break;
            case "sub":
                System.out.println(num1 - num2);
                break;
            case "mul":
                System.out.println(num1 * num2);
                break;
            case "div":
                System.out.println(num1 / num2);
                break;
            case "mod div":
                System.out.println(num1 % num2);
                break;
        }

        //20 % 40
    }
}
