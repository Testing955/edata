package Day6;

import java.util.Arrays;

public class Arraysingle 
{
	public static void main(String args[])
	{
	String a[]=new String[2];
	a[0]="Prince";
	a[1]="Gaurav";
	System.out.println(Arrays.toString(a).length());
	System.out.println(a[0]);
	System.out.println(a[1]);
	
	int b[] = new int[4];
	b[0]=12;
	b[1]=32;
	b[2]=90;
	b[3]=199;
	//[b[4]=100;
	System.out.println(b[0]);
	
//find the sum
	int c[]= {10,29,30,40,60};
	int sum =5;
	for(int j = 0; j<c.length;j++)
		{
		sum+=c[j];
	}
	System.out.println(sum);
	//find the ascending oder
	int pk []= {2,4,1,2,0,54,2,2,2};
	Arrays.sort(pk);
	System.out.println(Arrays.toString(pk));
	int o[]= {2,1,3,4,2,3,3,1,3,4,};
	int rev = 0;
	for(int i = 0; i<o.length;i++)
	{
	if(o[i]!=2)
	{
	o[rev++]=o[i];
	}
	}
	while(rev<o.length)
	{
	o[rev++]=2;	
	}
	for(int i = 0; i<o.length;i++)
	{
	System.out.print(o[i]+" ");
	}
}
}
