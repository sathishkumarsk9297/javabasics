package com.basic;

public class Perfect {
	public  static void main(String[] agrs)
	{
    Perfect p=new Perfect();
	System.out.println(p.isperfect(6));	
	}
	int number;
	public boolean isperfect (int number) {
	
		int count=0;
		for(int i=1 ; i<=number/2 ;i++)
		{
			if(number % i==0)
		count=count+i;		
		}
		if(number == count)
			return true;
		else
			return false;
	}
	
}
