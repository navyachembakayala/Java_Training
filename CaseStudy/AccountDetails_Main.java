package CaseStudy;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class AccountDetails_Main {

	public static void main(String[] args) throws IOException {
		
		
		//List<Account_Details> lst1 = new ArrayList<Account_Details>();
		ArrayList<String> lst = new ArrayList<String>();
		Scanner s1 = new Scanner(System.in);
		int j=0;
		int k = 0;
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
			
			try {
			Account_Details ac = new Account_Details();
			System.out.println("Please enter the Options for Account type" + "\n"+" 1 - Savings "+"\n"+" 2 - Current");
			String sr1 = s1.nextLine();
			if (sr1.contains("1")) {
				lst.add("Savings");
			} else if(sr1.contains("2")) {
				lst.add("Current");
			} else {
				System.out.println("Invalid input" );
				System.exit(0);
			}
			System.out.println("Please enter the user name");
			lst.add(s1.nextLine());
			
			System.out.println("Please enter the account number");
			BigInteger accNum= s1.nextBigInteger();
			s1.nextLine();
			String s = accNum+"";
			lst.add(s);		
			
			System.out.println("Please enter the account balance");
			BigDecimal AccBal= s1.nextBigDecimal();
			s1.nextLine();
			String ss = AccBal+"";
			lst.add(ss);	
			
			System.out.println("Please enter the Currency");
			lst.add(s1.nextLine());			
			continue;
			}
			catch(NullPointerException e1) {
				if (lst.isEmpty()) {
					System.out.println("Can't handle null arrya");
				}
				
			}
			
			catch(Exception e1)
			{
				System.out.println("An error occure please give valid input");
			}
		case "N":
			System.exit(0);
			
		}		
		}
		int n=1;
		
			for( int a=0; a<=lst.size()-1;a+=5) {
				if(n<=j){
				System.out.println("Account Type: "+ lst.get(a)+"\n"
				                  +"User Name...." + lst.get(a+1) 
							+"\n"+"Account Number...."+lst.get(a+2)+"\n"+
								 "Account Balance...."+lst.get(a+3)+"\n"+
					        		"Currency...."+lst.get(a+4)+"\n");
			}
				
			}
	}

}
