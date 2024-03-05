
import java.util.Scanner;

public class DigitCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to count its digits: ");
        long number = scanner.nextLong();

        int count = countDigits(number);

        System.out.println("The number of digits in " + number + " is: " + count);
    }

    public static int countDigits(long num) {
        // Convert the number to a string and get its length
        int count = String.valueOf(Math.abs(num)).length();
        return count;
        
    }
}
