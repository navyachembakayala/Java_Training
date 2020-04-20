package CaseStudy;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;


public class AccountDetails_Main {

	public static void main(String[] args) throws IOException {
		
		
		//List<Account_Details> lst1 = new ArrayList<Account_Details>();
		HashMap<BigInteger, List<String>> mp = new HashMap<BigInteger, List<String>>();
		Scanner s1 = new Scanner(System.in);
		int accCount=0;
		int k = 0;
		System.out.println("Do you want to create the account: ");
		String accountCreation = s1.nextLine();
//		if (accountCreation.equals("Y")) {
//			System.out.println("How many accounts you want to create: ");
//			accCount = s1.nextInt();
//			s1.nextLine();
//		}
		while(true) {
		switch(accountCreation) {
		case "Y":
			
			try {
				Account_Details ac = new Account_Details();
				System.out.println("Please enter the Options for Account type" + "\n"+" 1 - Savings "+"\n"+" 2 - Current");
				ArrayList<String> lst = new ArrayList<String>();
				String accountType = s1.nextLine();
				if (accountType.contains("1")) {
					lst.add("Savings");
				} else if(accountType.contains("2")) {
					lst.add("Current");
				} else {
					System.out.println("Invalid input" );
					//System.exit(0);
					continue;
				}
				System.out.println("Please enter the user name");
				String Username = s1.nextLine();
				if(Username.length() > 0 && Username != null && Username.length() <23) {
				lst.add(Username);
				}else {
					System.out.println("You have not entered the proper Input");
					continue;
				}
				System.out.println("Please enter the account number");
				BigInteger accNum= s1.nextBigInteger();
				String AccN1 = accNum+"";
				if((accNum != null && !accNum.equals(BigInteger.ZERO) && AccN1.length() == 13)) {
					
					try {
						s1.nextLine();
					}catch (NullPointerException ace) {
						System.out.println("You have not entered the proper Input");
						continue;	
					}
				} else {
					System.out.println("You have not entered the proper Input");
					continue;
				}
						
				
				System.out.println("Please enter the account balance");
				BigDecimal AccBal= s1.nextBigDecimal();
				if((AccBal != null)) {
					String ss = AccBal+"";
					lst.add(ss);
				   s1.nextLine();
				}else {
					System.out.println("You have not entered the proper Input");
					continue;
				}
					
				
				System.out.println("Please enter the Currency");
				String curr =s1.nextLine();
				if(curr != null) {
					lst.add(curr);
				}else {
					System.out.println("You have not entered the proper Input");
					continue;
				}
				mp.put(accNum,lst);
				System.out.println("Do you want to add more account details....then Press '1'");
				if(!s1.nextLine().equalsIgnoreCase("1")) {
					break;
				}
			
				continue;
			}
			catch(Exception e1)
			{
				System.out.println("An error occure please give valid input");
			}
		case "N":
			System.exit(0);
			
		}
		
		break;
		}
		
		getdetails(mp);
		Scanner Ip = new Scanner(System.in);
		System.out.println("Enter the account number to update the details:"+"\n");
		BigInteger accNum = Ip.nextBigInteger();
		System.out.println("Enter your choice"+"\n"+"1.User Name"+"\n"
		+"2.Deposit the amount"+"\n"+"3.Withdraw amount"+"\n"+"4.Currency"+"\n");
		Ip.nextLine();
		String Updatedetails = Ip.nextLine();
		switch(Updatedetails){
			case "1": 
				try {
				getUpdateName(mp,accNum);
				}catch(Exception e) {
					System.out.println("Account Number Not found");
				}
				break;
			case "2":
				try {
				getUpdateDeposit(mp,accNum);
				}catch(Exception e1) {
					System.out.println("Account Number Not found");
				}
				break;
			case "3":
				try {
				getUpdatewithdrawbalance(mp,accNum);
				}catch(Exception e1) {
					System.out.println("Account Number Not found");
				}
				
				break;
			case "4":
				try {
				getUpdateCurrency(mp,accNum);
				}catch(Exception e1) {
					System.out.println("Account Number Not found");
				}
				break;
			}
		}
	
	private static void getUpdatewithdrawbalance(HashMap<BigInteger , List<String>> mp3,BigInteger accNum) {
		for(BigInteger key: mp3.keySet()) {
			List<String> s = new ArrayList<String>();
			s =mp3.get(accNum);
			String s2=s.get(2);
			System.out.println("Enter the Withdraw Amount");
			Scanner Ip = new Scanner(System.in);
			BigInteger b = Ip.nextBigInteger();
			String s3 = b +"";
			BigInteger i1 = new BigInteger(s2); 
            BigInteger i2 = new BigInteger(s3); 
            // Using subtract() method 
            BigInteger diff = i1.subtract(i2);  
			String s1 = diff +"";
			List<String> newData = new ArrayList<String>();
			newData.add(s.get(0));
			newData.add(s.get(1));
			newData.add(s1);
			newData.add(s.get(3));
			mp3.put(accNum, newData);
			getdetails(mp3);
			break;
		}
		
	}

	private static void getUpdateCurrency(HashMap<BigInteger , List<String>> mp3,BigInteger accNum) {
		for(BigInteger key: mp3.keySet()) {
			List<String> s = new ArrayList<String>();
			s =mp3.get(accNum);
			System.out.println("Enter the Currency to update");
			Scanner Ip = new Scanner(System.in);
			String s1 = Ip.nextLine();
			List<String> newData = new ArrayList<String>();
			newData.add(s.get(0));
			newData.add(s.get(1));
			newData.add(s.get(2));
			newData.add(s1);
			mp3.put(accNum, newData);
			getdetails(mp3);
			break;
		}

		
	}

	private static void getUpdateDeposit(HashMap<BigInteger , List<String>> mp3,BigInteger accNum) {
		for(BigInteger key: mp3.keySet()) {
			List<String> s = new ArrayList<String>();
			s =mp3.get(accNum);
			String s2=s.get(2);
			System.out.println("Enter the Deposited Amount");
			Scanner Ip = new Scanner(System.in);
			BigInteger b = Ip.nextBigInteger();
			String s3 = b +"";
			BigInteger i1 = new BigInteger(s2); 
            BigInteger i2 = new BigInteger(s3); 
            // Using subtract() method 
            BigInteger diff = i1.add(i2);  
			String s1 = diff +"";
			List<String> newData = new ArrayList<String>();
			newData.add(s.get(0));
			newData.add(s.get(1));
			newData.add(s1);
			newData.add(s.get(3));
			mp3.put(accNum, newData);
			getdetails(mp3);
			break;
		}
		
	}

	private static void getUpdateName(HashMap<BigInteger , List<String>> mp3,BigInteger accNum) {
		for(BigInteger key: mp3.keySet()) {
			//System.out.println(key+"\n");
			List<String> s = new ArrayList<String>();
			s =mp3.get(accNum);
			System.out.println("Enter the details to update");
			Scanner Ip = new Scanner(System.in);
			String s1 = Ip.nextLine();
			List<String> newData = new ArrayList<String>();
			newData.add(s.get(0));
			newData.add(s1);
			newData.add(s.get(2));
			newData.add(s.get(3));
			mp3.put(accNum, newData);
			getdetails(mp3);
		}
		
	}

	public static void getdetails(HashMap<BigInteger, List<String>> mp1){
		
		for(BigInteger key: mp1.keySet()) {
			//System.out.println(key+"\n");
			List<String> s = new ArrayList<String>();
			s =mp1.get(key);
			
		for(int i=0; i<s.size();i++) {		
				System.out.println("Account Type: "+ s.get(i)+"\n"
			                  +"User Name...." + s.get(i+1)
							+"\n"+"Account Number...."+key+"\n"+
								 "Account Balance...."+s.get(i+2)+"\n"+
					        		"Currency...."+s.get(i+3)+"\n");
				i+=3;
				if(i==3)
				{
					break;
				}

			}
			
		}
		
	}

	
	}


