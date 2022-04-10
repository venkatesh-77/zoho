package edu.zoho.sectionA;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Question7 
{
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string");
		String str=sc.nextLine().toLowerCase();
	    
		String[] strarr=str.split(" ");
	 
		Set<String> set=new LinkedHashSet<String>();
	     
		
		for (int i = 0; i < strarr.length; i++) 
		{
      		set.add(strarr[i]);
		}
		
	    String result = String.join(" ", set);

	    System.out.println(result);
	    
	}

}
