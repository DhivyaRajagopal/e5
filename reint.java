
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) 
	{
		System.out.println("enter the digit to be reversed");
		Scanner s=new Scanner(System.in);
		String n=s.next();
		for(int i=n.length()-1;i>=0;i--)
		{
			System.out.print(n.charAt(i));
		}
	}
}
