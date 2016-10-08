import java.io.*;
import java.util.*;
class reverse
{
public static void main(String args[])
{
  System.out.println("enter the string to be reversed");
  Scanner s=new Scanner(System.in);
  String str=s.next();
  for(int i=str.length-1;i>=0;i--)
  {
  System.out.println(str.charAt(i));
  }
  }
  }
