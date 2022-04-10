package edu.zoho.sectionA;

import java.util.Scanner;

public class Question3 
{


	public static String sort1(char[] ch)
	{

		for (int i = 0; i < ch.length; i++) 
		{

			for (int j = i+1; j < ch.length; j++) 
			{
				if (ch[i]<ch[j])
				{
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}	

			}


		}

       String  str=new  String(ch);
		return str;

	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Number of String");
	    int n=sc.nextInt();

		String[] str=new String[n];

		for (int i =0; i <n; i++) 
		{
			System.out.println("Enter the String"+(i+1)+" "+" ");
			str[i]=sc.next();

		}


		for (int i = 0; i < str.length; i++) 
		{
			
			str[i]=sort1(str[i].toCharArray());
		}


		for (int i =0; i <str.length; i++) 
		{
			System.out.println("string"+(i+1)+" = "+str[i]);
		}

	}
}
