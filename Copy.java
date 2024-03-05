
// Java Program to demonstrate the use of the strip() 
// method,stripLeading() method,stripTrailing() method 

public class Copy { 
	public static void main(String[] args) 
	{ 
		String str 
			= "	 Geeks For Geeks Internship ! "; 

		// removing leading and 
		// trailing white spaces 
		System.out.println(str.strip()); 

		// removing leading white spaces 
		System.out.println(str.stripLeading()); 

		// removing trailing white spaces 
		System.out.println(str.stripTrailing()); 
	} 
}
