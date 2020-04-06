package Oops_Concept;

public class Bank_Account {
	
	private long acnt_no;
	private String acnt_name;
	private double acnt_bal;
	
	public void deposit(double amount) {
	   if (amount > 0) {
		   acnt_bal = acnt_bal + amount;
		   System.out.println("Successfully deposited " + amount);
	   } else {
		   System.out.println("Can not deposite " + amount);
	   }
		
	}
	public void Withdraw(double amount) {
		   if (amount > 0) {
			   acnt_bal = acnt_bal - amount;
			   System.out.println("Successfully withdraw " + amount);
		   } else {
			   System.out.println("Can not withdraw " + amount);
		   }
			
		}
	public void Currbal() {
		     System.out.println("Your current balance is $:" + acnt_bal);
		   
			
		}
	
	public Bank_Account (long acnt_no,String acnt_name, double acnt_bal) {
		this.acnt_no = acnt_no;
		this.acnt_bal = acnt_bal;
		this.acnt_name = acnt_name;
		
	}

}
