import java.util.Scanner;


public class SING2 {
  public static void main(String args[]) {
	  Scanner scn = new Scanner(System.in);  
	  String str1 = "hello";
	   int length =  str1.length();
	    System.out.println("The length of the string is" + length);
	    
	    
	    String str2 = "ghghg";
	   String fth =  str2.toUpperCase();
	   System.out.println(fth);
	   
	   String str3 = "thsht";
	    String ght = str3.replace('t', 'a');
	    System.out.println(ght);
	    
	    
	    String str4 = "This is the string program";
	    String qwe = str4.replaceAll("h","a");
	    System.out.println(qwe);
	     
//	    String srt2 = "sham";
//      String str3 = "gthu";
//      str1.chars();
//      srt2.describeConstable();
//      str3.codePointAt(0);
//      System.out.println(str1);
//      System.out.println(srt2==str1);
//      System.out.println(str3==srt2);
//      System.out.println(str3==str3);
//	    System.out.println(srt2);
//	    System.out.println(str3);
//      System.out.println(str1==srt2);     
  }
}
