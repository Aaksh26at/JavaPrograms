import java.util.Scanner;

public class digit {
   public static void main(String args[]) {
	   int count=0;
	   Scanner scn = new Scanner(System.in);
	   System.out.println("Enter the number");
	   int fg = scn.nextInt(); 
	   
	   while(fg>0) {
		   fg=fg/10;
		   count++;
	   }
	   System.out.println("The number of digits is :" +count);
   }
}
