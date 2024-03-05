
public class arry {
    public static void main(String args[]) {
    	int row = 10;
    	int coll = 10;
    	
    	for(int i=1; i<=row; i++) {
    		for(int j=1; j<=coll; j++) {
    			if(i==1 || j==1 || i==row || j==coll) {
    				System.out.print("*");
    			}else
    				System.out.print(" ");
    		}
    		System.out.println();
    	}
    			
    }
}
