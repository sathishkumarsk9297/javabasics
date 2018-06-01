package com.basic;

public class Array {
	public static void main(String[] args)
	{
		int a= 1234;
		int n;
		int[] square = new int[10];
	 System.out.print("[");   
		for (int i=0;i<square.length;i++)
    {
    	n=a%10;
    	square[i]=n;
    	a=a/10;   		
    	System.out.print(square[i]);
    	if(i<square.length-1)
    	 System.out.print(",");
    }
    System.out.println("]");
	}
}
