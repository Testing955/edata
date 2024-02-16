package Day6;

import java.util.Arrays;



public class ArrayObject 
{
	public static void main(String args[])
	//Print triangle
	{
	/*int a = 5;
	for(int i =0; i<=a; i++)
	{
	for(int j=0; j<=i;j++)
	{
	System.out.print("*");
	}
	System.out.println();
	}*/
	
//Print pyramid
/*	int a = 5;
	for(int i =0; i<=a; i++)
	{
	for(int j=0; j<a-i-1;j++)
	{
	System.out.print(" ");
	}
	for(int k = 0; k<=i;k++)
	{
	System.out.print("* ");
	}
	System.out.println();
}*/
//Print from a to z
int k = 9;
char currentChar ='a';
for(int i =0; i<k;i++)
{
for(int j=0;j<k-i-1;j++)
{
System.out.print(" ");
}
for(int p =0; p<=i;p++)
{
	
	
	
	
	
if (currentChar<='z')
{
System.out.print(currentChar+"  ");
}
else
{
currentChar='a';
System.out.print(currentChar+"  ");
}
currentChar++;
}
System.out.println();
}
}
}
