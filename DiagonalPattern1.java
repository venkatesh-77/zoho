package edu.zoho.sectionA;

import java.util.Scanner;

public class DiagonalPattern1
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str=sc.next();
		
		int flag=0;
		if (str.length()%2!=0) 
		{
			for (int i = 0; i < str.length()/2; i++) 
			{
				if (str.charAt(i)!=str.charAt(str.length()-1-i)) 
				{
					flag=1;
					break;
				}
			}
			if (flag==0) 
			{
			    int rows=str.length();
				int space=rows-1,index=str.length()/2;
				int stars=1;
				for (int i = 1; i <=rows; i++) 
				{
					for (int j = 1; j <=space; j++) 
					{
						System.out.print(" "+" ");
					}
					for (int k = 1; k <=stars; k++) 
					{
						if (k==1||k==stars) 
						{
							System.out.print(str.charAt(index)+" ");
						}
						else
						{
							System.out.print(" "+" ");
						}
						
					}
					System.out.println();

					if(i<=rows/2)
					{
						stars+=2;
						space--;
						index--;
					}
					else
					{
						stars-=2;
						space++;
						index++;
					}

				}
			}
			else
				System.out.println("Not Possible");
		}
		else
			System.out.println("Not Possible");

	}

}
