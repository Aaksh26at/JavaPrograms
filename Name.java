import java.util.Scanner;

public class Name {
	public static void main(String[] args){
	    Scanner input = new Scanner(System.in);

	    System.out.println("Hello, Welcome to Işık NameIt program. ");
	    System.out.println("----------------------------------------");
	    System.out.println("The following options are available for you:\n" +
	            "1) Display a name\n" +
	            "2) Change the size\n" +
	            "3) Exit Program");
	    System.out.print("Choose an option: ");

	    int option = input.nextInt();
	    int size = option.length;

	    while(option !=3){
	    switch (option){

	        case 1:
	             for(int index = 0; index <= size; index++) {
	                 System.out.print("*");
	             }
	             System.out.println(" ");
	        case 2:
	            System.out.print("What is the new size? ");
	            size = input.nextInt();
	            input.nextLine();
	        case 3:
	            break;

	      }
	   }
	}
}
