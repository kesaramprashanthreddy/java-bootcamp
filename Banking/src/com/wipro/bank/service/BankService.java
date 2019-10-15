package com.wipro.bank.service;

import com.wipro.bank.acc.RDAccount;
import com.wipro.bank.exception.BankValidationException;

public class BankService {
	public boolean validateData(float principal,int tenure,int age,String gender)
	{
		try 
		{
			if(principal>=500&&(tenure==5||tenure==10)&&(age>=1&&age<=100)&&(gender.equalsIgnoreCase("Male")||gender.equalsIgnoreCase("Female")))
			{
				return true;
			}
			else
			{
				throw new BankValidationException("prashanth");
			}
		}
		catch(BankValidationException e)
		{
			System.out.println(e);
			return false;
		}
		
	}
	public void calculate(float principal,int tenure, int age, String gender)
	{
		boolean check=validateData(principal,tenure,age,gender);
		if(check==true)
		{
			RDAccount r=new RDAccount(tenure,principal);
			r.setInterest(age, gender);
			System.out.println("TotalAmountDeposited: "+r.calculateAmountDeposited());
			System.out.println("Interest: "+r.calculateInterest());
			System.out.println("Maturity interest: "+(r.calculateAmountDeposited()+r.calculateInterest()));
		}
	}

}
