package com.basic;

public class SavingBalance {
static  int annualInterestRate;
double savingBalance;
double interest;
public SavingBalance(double savingBalance)
{
this.savingBalance=	savingBalance;
}
public void  calculateMonthlyInterest()
{
	interest = ((savingBalance * annualInterestRate/100.0)/12);
	savingBalance+=interest;
	System.out.println("Balance"+savingBalance);
}
public static void modifyInterestRate (int newvalue)
{
	annualInterestRate=newvalue;
}
public static void main(String[] args)
{
	SavingBalance s1 = new SavingBalance(2000);
	SavingBalance s2 = new SavingBalance(3000);
	s1.calculateMonthlyInterest();
	s2.calculateMonthlyInterest(); 
	s1.modifyInterestRate(4);
	s1.calculateMonthlyInterest();
	s2.calculateMonthlyInterest(); 
	s1.modifyInterestRate(5);
    s1.calculateMonthlyInterest();
	s2.calculateMonthlyInterest();
	}
}
