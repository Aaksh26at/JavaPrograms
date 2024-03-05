import java.util.Scanner;

public class prime {
    public static void main(String args[]) {
    	int count=0;
    	Scanner scn = new Scanner(System.in);
    	System.out.println("Enter a value");
    	int key = scn.nextInt();
    	for(int i=1;i<=key;i++) {
    		if(key%i==0) {
				count++;
    		}
    		if(count==2) {
    			System.out.println("Prime number");
    		}else
    			System.out.println("Not a prime number");
    	}
    }
}
