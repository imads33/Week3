import java.util.Scanner;

public class SwitchCase {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        char operator;
        int number1, number2;
        System.out.println("Enter number1 value : ");
        number1 = s.nextInt();
        System.out.println("Enter number2 value : ");
        number2 = s.nextInt();
        System.out.println("Enter Operator to perform opration : ");
        operator = s.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Addithon of two numbers is : " + (number1 + number2));
                break;
            case '-':
                System.out.println("Substraction of two numbers is : " + (number1 - number2));
                break;
            case '*':
                System.out.println("Multiplication of two numbers is : " + (number1 * number2));
                break;
            case '/':
                System.out.println("Division of two numbers is : " + (number1 / number2));
                break;
            default:
                System.out.println("Invalid Operatort");
                break;
        }
    }

}