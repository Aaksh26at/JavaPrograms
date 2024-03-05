
public class SingImp {
   public static void main(String args[]) {
	   String s1 = new String("You cannot change me");
	   String s2 = new String("You cannot change me");
	   System.out.println(s1==s2);
	   String s3 = "you can not change me";
	   System.out.println(s1==s3);
	   String s4 = "you can not change me";
	   System.out.println(s3==s4);
	   String s5 = "you can not" + "change me";
	   System.out.println(s3==s5);
	   String s6 = "you can not";
	   String s7 = s6 + "change me";
	   System.out.println(s3==s7);
	   final String s8 = "you can not";
	   String s9 = s8 + "change me";
	   System.out.println(s3==s9);
	   System.out.println(s6==s8);
   }
}
