package Simple_Banking_Application;

import java.util.Scanner;

public class sbm {

	public static void main(String[] args) {
		BankAccount obj1 = new BankAccount("Ishant Mishra",2910); 
		obj1.showMenu();
	}

}

class BankAccount{
	  int balance;
	  int previousTransaction;
	  String customerName;
	  int customerId;
	  
	  BankAccount(String cname,int cid)
	  {
		  customerName = cname;
		  customerId = cid;
	  }
	  
	  void deposit(int amount) 
	  {
		  if(amount !=0) 
		  {
			  balance = balance + amount;
			  previousTransaction = amount;
		  }
	  }
	  
	  void withdraw(int amount) 
	  {
		  if(amount !=0) 
		  {
			  balance = balance - amount;
			  previousTransaction = - amount;
		  }
	  }
	  
	  void getPreviousTransaction() 
	  {
		   if(previousTransaction > 0) 
		   {
			   System.out.println("Deposited : " + previousTransaction);
		   }
		   else if(previousTransaction < 0)
		   {
			   System.out.println("Withdrawn : " +Math.abs(previousTransaction));
		   }
		   else 
		   {
			   System.out.println("No transaction Occured");
		   }
	  }
	  
	  void showMenu() 
	  {
		  char option ='\0';
		  Scanner scanner =  new Scanner(System.in);
		  
		  System.out.println("Welcome "+customerName);
		  System.out.println("Your ID is "+customerId);
		  System.out.println("\n");
		  System.out.println("A. Check Balance");
		  System.out.println("B. Deposit");
		  System.out.println("C. Withdraw");
		  System.out.println("D. Previous Transaction");
		  System.out.println("E. Exit");
		  
		  do 
		  {
			  System.out.println("Enter an option : ");
			  option = scanner.next().charAt(0);
			  System.out.println("\n");
			  
			  switch(option) 
			  {
			  case 'A':
				  System.out.println("Balance = "+balance);
				  break;
			  
			  case 'B':
				  System.out.println("Enter the amount to deposit: ");
				  int amount = scanner.nextInt();
				  deposit(amount);
				  System.out.println("\n");
				  break;
			  case 'C':
				  System.out.println("Enter the amount to withdraw: ");
				  amount = scanner.nextInt();
				  withdraw(amount);
				  System.out.println("\n");
				  break;
			  case 'D':
				  getPreviousTransaction();
				  break;
			  case 'E':
				  break;
			  default:
				  System.out.println("Invalid option try again");
				  break;
			  }
			  
		  }
		  while(option !='E');
		  {
			  System.out.println("Thank you for using our services");
		  }
		  
		  
	  }
	  
}
