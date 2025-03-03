import java.util.Scanner;

public class EvenOddChecker {

    public static void main(String[] args) {
        int number = getIntegerInput();
        String result = checkEvenOrOdd(number);
        System.out.println(result);
    }

    public static int getIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter an integer: ");
            return scanner.nextInt();
        } finally {
            scanner.close();
        }
    }

    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return number + " is an Even number.";
        } else {
            return number + " is an Odd number.";
        }
    }
}
