package Oops_Concept;

public class Bank_Account_Main_Class {

	public static void main(String[] args) {

       Bank_Account b1 = new Bank_Account(322261, "XYZ", 100000);
       b1.Currbal();
       b1.Withdraw(2000);;
       b1.Currbal();
       b1.deposit(-1000);
       b1.Currbal();
       b1.deposit(1000);
       b1.Currbal();
	}

}
