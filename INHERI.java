class StudentLoan {
    private String name;
    private String fatherName;
    private String motherName;
    private String schoolName;
    private int classLevel;
    private int rollNo;

    public StudentLoan(String name, String fatherName, String motherName, String schoolName, int classLevel, int rollNo) {
        this.name = name;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.schoolName = schoolName;
        this.classLevel = classLevel;
        this.rollNo = rollNo;
    }
    public String getName() {
        return name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public int getClassLevel() {
        return classLevel;
    }

    public int getRollNo() {
        return rollNo;
    }
}

    // Getter and setter methods


class Homeloan {
    private int interestRate;
    private int loanAmount;
    private String addressProof;

    public Homeloan(int interestRate, int loanAmount, String addressProof) {
        this.interestRate = interestRate;
        this.loanAmount = loanAmount;
        this.addressProof = addressProof;
    }
    public int getintersrtRate() {
    	return interestRate;
    }
    public int getloanAmount() {
    	return loanAmount;
    }
    public String getaddressProof() {
    	return addressProof;
    }

    // Getter and setter methods
}

class CarLoan extends Homeloan {
    private int years;
    private String model;

    public CarLoan(int interestRate, int loanAmount, String addressProof, int years, String model) {
        super(interestRate, loanAmount, addressProof);
        this.years = years;
        this.model = model;
    }
    public int getyears() {
    	return years;
    }
    public String model() {
    	return model;
    }
    // Getter and setter methods
}

class PersonalLoan extends Homeloan {
    private int fee;
    private String renovation;
    private String medical;

    public PersonalLoan(int interestRate, int loanAmount, String addressProof, int fee, String renovation, String medical) {
        super(interestRate, loanAmount, addressProof);
        this.fee = fee;
        this.renovation = renovation;
        this.medical = medical;
    }
    public int getfee() {
    	return fee;
    }
    public String getrenovation() {
    	return renovation;
    }
    public String getmedical() {
    	return medical;
    }
    // Getter and setter methods
}

class GoldLoan {
    private int lowerInterestRates;
    private int goldValuation;
    private int repayment;

    public GoldLoan(int lowerInterestRates, int goldValuation, int repayment) {
        this.lowerInterestRates = lowerInterestRates;
        this.goldValuation = goldValuation;
        this.repayment = repayment;
    }
    public int getlowerIntersetRates() {
    	return lowerInterestRates;
    }
    public int getgoldValuation() {
    	return goldValuation;
    }
    public int getrepayement() {
    	return repayment;
    }
    // Getter and setter methods
}

class FarmerLoan {
    private String incomeProof;
    private String identityProof;
    private String addressProof;

    public FarmerLoan(String incomeProof, String identityProof, String addressProof) {
        this.incomeProof = incomeProof;
        this.identityProof = identityProof;
        this.addressProof = addressProof;
    }
    public String getincomeProof() {
    	return incomeProof;
    }
    public String getidentityProof() {
    	return identityProof;
    }
    public String getaddressProof() {
    	return addressProof;
    	// Getter and setter methods
    }
}

public class INHERI {
    public static void main(String args[]) {
        StudentLoan stu1 = new StudentLoan("Aakshat", "Santosh Agarwal", "Hemlata Agarwal", "TPS", 10, 01);
        System.out.println("Student Name: " + stu1.getName());
        System.out.println("Father Name: " + stu1.getFatherName());
        System.out.println("Mother Name: " + stu1.getMotherName());
        System.out.println("School Name: " + stu1.getSchoolName());
        System.out.println("Class Name: " + stu1.getClassLevel());
        System.out.println("Rool No: " + stu1.getRollNo());
      
        System.out.println();

        Homeloan h1 = new Homeloan(7, 400000, "H-80 Radha Govind Residency");
        System.out.println("IntersetRate: " + h1.getintersrtRate());
        System.out.println("loanAmount: " + h1.getloanAmount());
        System.out.println("AddressProof: " + h1.getaddressProof());
      
        System.out.println();
        
        CarLoan c1 = new CarLoan(7, 400000, "H-80 Radha Govind Residency", 4, "Tata Nexon");
        System.out.println("IntersetRate: " + c1.getintersrtRate());
        System.out.println("LoanAmount: " + c1.getloanAmount());
        System.out.println("AddressProof: " + c1.getaddressProof());
        System.out.println("Years: " + c1.getyears());
        System.out.println("Model: " + c1.model());
        
        System.out.println();
        
        PersonalLoan p1 = new PersonalLoan(7, 400000, "H-80 Radha Govind Residency", 45000, "House", "Go Medical");
        System.out.println("IntersetRate: " + p1.getintersrtRate());
        System.out.println("LoanAmount: " + p1.getloanAmount());
        System.out.println("AddressProof: " + p1.getaddressProof());
        System.out.println("Fee: " + p1.getfee());
        System.out.println("Medical: " + p1.getmedical());
        System.out.println("Renovation" + p1.getrenovation());
       
        System.out.println();
        
        GoldLoan g1 = new GoldLoan(34, 40, 12000);
        System.out.println("LoweIntersetRate: " + g1.getlowerIntersetRates());
        System.out.println("GoldValuation: " + g1.getgoldValuation());
        System.out.println("Repayement: " + g1.getrepayement());
    
        System.out.println();
        
        FarmerLoan f1 = new FarmerLoan("Bank", "Aadhar CARD", "H-80 Radha Govind Residency");
        System.out.println("AddressProof: " + f1.getaddressProof());
        System.out.println("IdentityProof: " + f1.getidentityProof());
        System.out.println("IncomeProof: " + f1.getincomeProof());
        
        System.out.println();
    }
}
