
public class equal {
	// Java program to demonstrate use of Class Variable 
	class GFG { 
		public static int ctr = 0; 
		public GFG() { ctr++; } 
		public static void main(String[] args) 
		{ 
			GFG obj1 = new GFG(); 
			GFG obj2 = new GFG(); 
			GFG obj3 = new GFG(); 
			System.out.println("Number of objects created are "
							+ GFG.ctr); 
		} 
	}

  }

