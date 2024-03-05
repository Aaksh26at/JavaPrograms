import java.util.Scanner;
public class Myamount { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner scn = new Scanner(System.in); 
	   int amount = 5000; 
	 
	 while(1==1) {
	   System.out.println("your wallet amount is " + amount);
	   System.out.println("we have below product:");
	   System.out.println("1. Shirt Rs.1000");
	   System.out.println("2. Jeans Rs.800");
	   System.out.println("3. Shoes Rs.550");
	   System.out.println("4. Exit");
	   int input = scn.nextInt(); 
	   
	   if(amount < 550 || input ==4) {
		   System.out.println("thanks for vist our application ");
		   break; 
	   }
	   
	   if(input==1) {
		   System.out.println("you have purchase shirt that price is rs.1000");
		   amount -= 1000; 
	   }
	   else if(input==2){
		  System.out.println("You have purchase jeans that price is rs.800"); 
		  amount -=800;  
	   }
	   else if(input==3){
		   System.out.println("you have purchase shoes that price is rs.550");
		   amount -= 550; 
	   }
	   else {
		   System.out.println("you have choose incorrect option");
	   }
		   
	   }
	 }
	  
} 	
	


// shooping 
