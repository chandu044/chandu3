import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,cnt=0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		while(a>0)
		{
			cnt=cnt+1;
			a=a/10;
		}
		System.out.println(cnt);
	}
}
