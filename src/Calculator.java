import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        int num1;
        int num2;
        int square;
        String operation;

        Scanner input = new Scanner(System.in);

        System.out.println("please enter the first number");
        num1 = input.nextInt();

        System.out.println("please enter the second number");
        num2 = input.nextInt();

        Scanner op = new Scanner(System.in);

        System.out.println("Please enter operation: - +, -, /, *, sq");
        operation = op.next();

        if (operation.equals("+")) {
            System.out.println("your answer is " + (num1 + num2));
        } else if (operation.equals("-")) {
            System.out.println("your answer is " + (num1 - num2));
        } else if (operation.equals("/")) {
            System.out.println("your answer is " + (num1 / num2));
        } else if (operation.equals("*")) {
            System.out.println("your answer is " + (num1 * num2));
        } else if (operation.equals("sq")) {
            System.out.println ( num1 + " squared is: " + (num1 * num1));
        } else {
            System.out.println("Wrong selection");
        }
    }
}
