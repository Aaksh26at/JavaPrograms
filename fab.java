import java.util.Scanner;

public class fab {
   public static void main(String args[]) {
	   int a=0,b=1,c;
	   System.out.println("Enter a term");
	   Scanner scn = new Scanner(System.in);
	   int roll = scn.nextInt();
	   for(int i=1;i<=roll;i++) {
		   System.out.println(a+" ");
		   c=a+b;
		   a=b;
		   b=c;
	   }
   }
}
