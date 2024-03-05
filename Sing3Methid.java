import java.util.Scanner;
import java.util.stream.IntStream;


// JAVA DIFFERENT METHOD OF STRING

public class Sing3Methid {
 public static void main(String args[]) {
	 Scanner scn = new Scanner(System.in);
	 String str5 = " Aakshat    ";
	 System.out.println(str5.strip());
	 System.out.println(str5.stripLeading()); 
	 System.out.println(str5.stripTrailing()); 
	 
	 String str6 = new String("HI I AM AAKSHAT");
	 String str7 = new String ("I AM NOT AAKSHAT");
	 int rty = str6.compareTo(str7);
	 
	 System.out.println(rty);
	 String str8 = "this is the";
	 String str9 = "";
	 int jkl = str9.compareToIgnoreCase(str9);
	System.out.println(jkl);
	
	// COMPARE METHOD
	String s1="hello";  
	 String s2="";  
	 String s3="me";  
	 System.out.println(s1.compareTo(s2));  
	 System.out.println(s2.compareTo(s3));
	 
	 // CONTAIN METHOD
	 String str10 = new String("This is the contain method");
	 String str11 = new String("This is the method");
	 boolean hel = str11.contains(str11);
	 System.out.println(hel);
	 
	 // ENDS WITH
	 String str13 = new String("This is the end method");
	 String str14 = new String("This is the method");
	 boolean gann = str13.endsWith(str14);
	 System.out.println(gann);
	 
//	 // FORMAT METHOD I WILL HAVE TO ASK THIS PROBLEM
//	 String str15 = new String("This is the Format method");
//	 String str16 = new String("This is the method");
//	 String eee = String.format(str9);
//	 System.out.println(eee);
	 
	 
	 // TO CONCATE THE STRING
	 
	 String str17 = "This is the new string";
	 String str18 = "This is the string";
	 String xcv = str17.concat(str18);
	 System.out.println(xcv);
	 
	 // NEXT METHOD REPEAT
	 String str19 = "This is the another method";
	 String str20 = "This is the another method program";
	 String vbn = str19.repeat(3);
	 System.out.println(vbn);
	 
	 // THIS IS THE SUBSTRING METHOD
	 String str21 = new String("This is the seen");
	 String str22 = new String("This is the second seen");
	 String ght = str21.substring(10);
	 System.out.println(ght);
	 
	 // THIS IS THE TRANSLEATEEXCAPE METHOD
	 String str23 = new String("This is the another method");
	 String str24 = "This is the meth";
	 String asd = str23.translateEscapes();	 
	 System.out.println(asd);
	
	 // THIS I WILL HAVE TO ASK
	 String str25 = new String("This is the new method");
	 String str26 = "This is the same string";
	 IntStream cvb = str26.codePoints();
	 System.out.println(cvb);
	 
	 // THIS ALSO I WILL HAVE TO ASK
	 String str27 = "This is the seen of the ";
	 String str28 = "This is the of the best seen";
	 int bnm = str27.compareToIgnoreCase(str28);
	 System.out.println(bnm);
	 
	 //THIS IS CHARAT METHOD
	 String str29 = new String("I am an java programmer");
	 System.out.println(str29.charAt(5));
	 
	 //SUB STRING METHOD
	 String str30 = "I am a java programmer";
	 System.out.println(str30.subSequence(0, 20));
	
	String str31 = "I am a new coder";
	System.out.println(str31.indexOf('e'));
	
	String str32 = "     I am alone    ";
	System.out.println(str32.stripIndent());
	
    String str33 = "This is the str33 string";
    System.out.println(str33.startsWith("This", 1));
    
    String str34 = "This is thr new string";
    System.out.println(str34.concat(str30));
	 
 }
}
