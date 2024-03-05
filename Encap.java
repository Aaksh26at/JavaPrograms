

class hello{
    public final char[] dateofbirth = null;
	int memberId = 101; ;
   private String MemberName ;
     private int Dateofbirth ;
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return MemberName;
	}
	public void setMemberName(String memberName) {
		MemberName = memberName;
	}
	public int getDateofbirth() {
		return Dateofbirth;
	}
	public void setDateofbirth(int dateofbirth) {
		Dateofbirth = dateofbirth;
	}
     
    
}


public class Encap {

public static void main(String args[]) {
	   hello e1 = new hello();
	    e1.setMemberId(101);
	   e1.setMemberName("Aakshat");
	   e1.setDateofbirth(2003405);
	System.out.println(e1.memberId); 
	System.out.println(e1.getMemberName()); 
	System.out.println(e1.dateofbirth); 
	
	   
   }
}
