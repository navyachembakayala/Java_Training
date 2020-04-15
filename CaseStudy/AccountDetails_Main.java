package CaseStudy;



import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class AccountDetails_Main {

	public static void main(String[] args) {
		
		
		List<Account_Details> lst1 = new ArrayList<Account_Details>();
		Scanner s1 = new Scanner(System.in);
		int j=0;
		System.out.println("Do you want to create the account: ");
		String Sr = s1.nextLine();
		if (Sr.equals("Y")) {
			System.out.println("How many accounts you want to create: ");
			j = s1.nextInt();
			s1.nextLine();
		}
		for(int i = 1 ; i <= j;i++) {
			
		switch(Sr) {
		case "Y":
			Account_Details ac = new Account_Details();
			System.out.println("Please enter the Account type");
			String Sr1 = s1.nextLine();
			ac.setAccount_Type(Sr1);
			
			System.out.println("Please enter the user name");
			String Sr2 = s1.nextLine();
			ac.setName(Sr2);
			
			System.out.println("Please enter the account number");
			BigInteger Sr3 = s1.nextBigInteger();
			ac.setAccount_Number(Sr3);
			
			System.out.println("Please enter the account balance");
			BigDecimal Sr4 = s1.nextBigDecimal();
			ac.setAmount(Sr4);
			
			System.out.println("Please enter the Currency");
			s1.nextLine();
			String Sr5 = s1.nextLine();
			ac.setCurrency(Sr5);
			lst1.add(ac);			
			continue;
			
		case "N":
			System.exit(0);
			
		}
		
		
		}
		for(Account_Details ac: lst1 ) {
			System.out.println("Account Type: "+ ac.Account_Type 
				    + "\n"+"User Name: "   + ac.getName()
					+ "\n"+"Account Number: "+ ac.getAccount_Number() 
					+ "\n"+"Balance: "      + ac.getAmount()
					+ "\n"+"Currency: "     + ac.Currency);
		}
	}

}
