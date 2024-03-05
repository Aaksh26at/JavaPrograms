import java.util.Scanner;

public class Has2 {
  public static void main(String args[]) {
	  Scanner scn = new Scanner(System.in);
	  System.out.println("input from the user");
	  String key = scn.next();
	  Has2 h2 = new Has2();
	  h2.add(134, 234);
  }
  void add(int a , int b) {
	  System.out.println(a+b);
  }
  void sub(int a ,int b) {
	  System.out.println(a-b);
  }
}
