import java.util.*;
/*
 Program: Enter the basic salary of an employee of an organization through the keyboard. His dearness
 		  allowance (DA) is 40% of basic salary, and house rent allowance (HRA) is 20% of basic
 		  salary. Write a java program to calculate his gross salary. Print the DA, HRA and Gross salary.
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
public class Q3
{
	public static void main(String args[])
	{
		Scanner k=new Scanner(System.in);
		System.out.print("\nEnter basic salary: ");
		double basic=k.nextDouble();
		double da=0.4*basic;
		double hra=0.2*basic;
		double gross=basic+da+hra;
		System.out.print("\n\tDA is "+da+"\n\tHRA is "+hra+"\n\tGross salary is "+gross);
		k.close();
	}
}