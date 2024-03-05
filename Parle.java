
//public class Parle {
//  public static void main(String args[]) {
//	  String name = "Sunfest";
//	  int go = 30;
//	  
//	  if(name == "Parle") {
//		  if(go==40) {
//			  System.out.println("you can purchase 40 rupees parle");
//		  }else {
//			  System.out.println("You cannot purchase anything");
//		  }
//	  }  
//	   else{
//		  System.out.println("you can purchase sunfest");
//	  }
//  }
//}

public class Parle{
	public static void main(String args[]) {
		String item1 = "Marie Gold";
		String item2 = "Parle";
		String item3 = "Sunfest";
		int item1price = 40;
		int item2price = 50;
		int item3price = 60;
		
		if(item1 == "Marie Gold") {
			System.out.println("You can purchase the Marie Gold");
		}if(item1price == 40) {
			System.out.println("we do not have this price packet");
		}else {
			System.out.println("You purchase any else thing");
		}
		if(item2price == 50) {
			System.out.println("we do not have this price packet");
		}else {
			System.out.println("You purchase any else thing");
		}
		if(item2 == "Parle") {
			System.out.println("You can purchase Parle");
		}else {
			System.out.println("you cannot purchase Parle");
		}if(item3=="sunfest") {
			System.out.println("you can purchase the sunfest");
		}else {
			System.out.println("you cannot purchase anything");
		}
		else{
			System.out.println("you cannot purchase Marie Gold");
		}
	}
}
