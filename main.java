
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first Number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second Number: ");
        int b = sc.nextInt();

        System.out.print("Enter the Operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        int result = 0;

        switch (op) {

            case '+':
                result = a + b;
                break;

            case '-':
                result = a - b;
                break;

            case '*':
                result = a * b;
                break;

            case '/':
                if (b == 0) {
                    System.out.println("Error! Cannot divide by zero.");
                    return;
                }
                result = a / b;
                break;

            default:
                System.out.println("Invalid Operator!");
                return;
        }

        System.out.println("Result: " + result);

        sc.close();
    }
}
