import java.util.Scanner;

public class count {
   public static void main(String args[]) {
	   Scanner scn = new Scanner(System.in);
	   System.out.println("Enter the values");
	   int row = scn.nextInt();
	   int count = countDigits(row);
	   System.out.println("The number of digits in " + row+ " is: " + count);
   }
	   
   

private static int countDigits(int row) {
	int count = String.valueOf(Math.abs(row)).length();
	return 0;
}
}
