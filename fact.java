import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main(String args[])
	{   int i,fact=1;
		System.out.println("enter the number to find factorial");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(i=1;i<n;i++)
		{
		  fact=fact*i;	
		}
		System.out.println("factorial of"+n+fact);
	}
}
