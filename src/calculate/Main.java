package calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean result = true;
        while (result) {
            System.out.println("would you like to do" + "more calculation please enter 'Y' or 'N':");
            char ch = scanner.next().charAt(0);
            switch (ch) {

                case 'Y':
                case 'y':
                    System.out.println("Enter first number: ");
                    int a = scanner.nextInt();
                    System.out.println("Enter second number: ");
                    int b = scanner.nextInt();
                    System.out.println("Please enter one of the symbol +,_,*,/: ");
                    char symbol = scanner.next().charAt(0);


                    Calculator calculator = new Calculator();
                    calculator.calculateResult(a, b, symbol);
                    break;
                case 'N':
                case 'n':

                    result = false;
                    break;
            }
        }
         scanner.close();

        }

    }

