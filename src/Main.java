import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberConverter numberConverter = new NumberConverter();

        System.out.println("\n-----------------------");
        System.out.println("Roman Numeral Generator");
        System.out.println("-----------------------");

        int num = 0;
        while (true) {
            // get input from user
            System.out.print("\nEnter an integer between 1 and 3999, or 'Q' to quit the program: ");
            String numStr = scanner.nextLine();

            if (numStr.equals("Q") || numStr.equals("q")) {
                break;
            }

            // parse and validate number
            try {
                num = Integer.parseInt(numStr);
                if (num < 1 || num > 3999) {
                    System.err.println("Number must be within specified range. Please try again.");
                    continue;
                }
                // print converted roman numeral
                System.out.println(numberConverter.generate(num));
            } catch (NumberFormatException e) {
                System.err.println("Input must be a valid number. Please try again.");
                continue;
            }
        }
    }
}
