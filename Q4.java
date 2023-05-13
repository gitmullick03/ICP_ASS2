import java.util.*;
/*
 Program: Write a java program that reads an integer between 0 and 1000 and adds all the digits in the
		  integer. For example, if an integer is 749, the sum of all its digits is 20.
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
public class Q4
{
	public static void main(String args[])
	{
		Scanner r=new Scanner(System.in);
		System.out.print("\nEnter a number between 0 and 1000: ");
		int Int=r.nextInt(),sum=0,l=0;
		l=Int%10; sum+=l; Int/=10;
		l=Int%10; sum+=l; Int/=10;
		l=Int%10; sum+=l; Int/=10;
		r.close();
		/*for (;Int>0;Int/=10)
		{
			l=Int%10;
			sum+=l;
		}*/
		System.out.print("\n\tThe sum of the digits is "+sum);
		}
}