package bank;

import java.util.Scanner;

public class BankAcount {
  double balance ;
  double  previousTransaction;
  String customerName;
  String CustomerId;
  
  
  public BankAcount(String customerName, String customerId) {
	super();
	this.customerName = customerName;
	this.CustomerId = customerId;
}
  
void desposit(double amount) {
	  if (amount !=0) {
		  balance = balance+amount;
		  previousTransaction= amount;
		  
	  }
  }
// where is the error ????
  
void withdraw(double amount) {
	  if (amount !=0) 
	  {
		  balance = balance - amount;
		  previousTransaction= -amount;
		  
	  }
  }
   void getPreviousTransaction() {
	   if (previousTransaction > 0) {
		   System.out.println("Desposited "+previousTransaction);
	   }else if (previousTransaction < 0) {
	   System.out.println("withdraw "+previousTransaction);
   }else 
   {
	   System.out.println("no transation occured ");
   }
	   }  

   void showMenu() {
	   
	   char option='\0';
	   Scanner sc= new Scanner(System.in);
	   System.out.println("wolcome "+customerName);
	   System.out.println("your Id is "+CustomerId);
	   System.out.println("\n");
	   System.out.println("A: check your balance");
	   System.out.println("B: Deposit");
	   System.out.println("C: withdraw ");
	   System.out.println("D: Previous Transaction ");
	   System.out.println("E: Exit");
	   
	   do
	   {
		   System.out.println("*******************************");
		   System.out.println("Enter an option ");
		   System.out.println("*******************************");
		   option =sc.next().charAt(0);
		   System.out.println("\n");
	   switch(option)
	   {
	   case 'A':
		   System.out.println("******************************");
		   System.out.println("your balace is "+balance);
		   System.out.println("******************************");
		   break;
	   case 'B':
		   System.out.println("******************************");
		   System.out.println("Enter an amount to despose ");
		   System.out.println("******************************");
		   double amount =sc.nextDouble();
		   desposit(amount);
		   System.out.println("\n");
	   break;
	   case 'C':
		   System.out.println("******************************");
		   System.out.println("Enter an amount to withdraw ");
		   System.out.println("******************************");
		   double amount2 =sc.nextDouble();
		   desposit(amount2);
		   System.out.println("\n");
		   break;
	   case 'D':
		   System.out.println("******************************");
		   System.out.println("your previous Transaction is ");
		   System.out.println("******************************");
		   getPreviousTransaction();
		   break;
		
	   case 'E':
		   System.out.println("******************************");
		   break; 
	  default:
			 System.out.println("invalid option please try again !!!!!!");
			 break;
	   } 
	   }while (option != 'E');
     
	   System.out.println("Thanks for using our services...");
	   
	   }
}

