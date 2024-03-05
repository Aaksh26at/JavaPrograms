interface aksh{
	private int hello() {
		return 0;
	}
	 public int ghj();
}
interface qwert{
	int qwe();
	int vbn();
}

class fhg implements aksh,qwert {

	public int hello() {
		int d = 45;
		float e =  4.5f;
		return 0;
	}

	@Override
	public int ghj() {
		int a = 34;
		 int b = 45;
		int  c = a+b;
		 System.out.println(c);
		System.out.println("Hello world");
		return 0;
	}

	@Override
	public int qwe() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int vbn() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
public class abs {
	public static void main(String args[]) {
		fhg rht = new fhg();
		rht.ghj();
		rht.qwe();
		rht.vbn();
	}
}
