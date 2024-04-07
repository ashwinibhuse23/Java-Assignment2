package javaassignment;

public class AccountMain {

	public static void main(String[] args) {
		
		
		System.out.println("print saving account details");
		
		System.out.println("==========================");
		
		SavingAccount sa=new SavingAccount("SA20052",0.05);
		sa.printAccountDetails();
		
		System.out.println("==========================");
		sa.deposite(5000);
		sa.printAccountDetails();
		
		System.out.println("==========================");
		
		sa.addInterest();
		sa.printAccountDetails();
		System.out.println("==========================");
		
		System.out.println("print housing loan details");
		
		
		HousingLoan hl=new HousingLoan("HA266656", 5000, 15);
		hl.printAccountDetails();
		
		System.out.println("==========================");
		
		
		hl.deposite(15000);
		hl.payEMI(5000);
		hl.extendTenure(15);
		hl.printAccountDetails();
	
		

	}




	}


