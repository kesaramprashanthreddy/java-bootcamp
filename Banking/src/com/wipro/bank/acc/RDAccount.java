package com.wipro.bank.acc;

public class RDAccount extends Account
{

	@Override
	public float calculateInterest() {
		// TODO Auto-generated method stub
		int tn=tenure*12;
		int n=4;
		float r=rateOfInterest/100;
		float interest=0.0f;
		for(int i=0;i<=60;i++)
		{
			interest=interest+principal*(float)(Math.pow(1+(r/n),n*((tn-i)/12.0))-1);
		}
		return interest;
	}

	@Override
	public float calculateAmountDeposited() {
		// TODO Auto-generated method stub
		return principal*tenure*12;
	}
	public RDAccount(int tenure, float principal)
	{
		this.tenure=tenure;
		this.principal=principal;
	}

}
