class facebookaccount{
	private int memberId;
	private String memberName;
	private int memberPhoneno;
	private String memberEmployee;
	
	public int getmemberId() {
		return this.memberId = memberId;
	}
	public void setmemberId(int memberId) {
		memberId = memberId;
	}
	public String getmemberName() {
		return this.memberName = memberName;
	}
	public void setmemberName(String memberName) {
		memberName = memberName;
	}
	public int getmemberPhoneno() {
		return this.memberPhoneno = memberPhoneno;
	}
	public void setmemberPhoneno(int memberPhoneno) {
		memberPhoneno = memberPhoneno;
	}
}
public class Stat {
  public static void main(String args[]) {
	 facebookaccount f1 = new facebookaccount();
	 f1.setmemberId(101);
	int id=  f1.getmemberId();
	System.out.println(id);
	 
	 
	  
  }
 
}
