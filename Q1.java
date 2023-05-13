import java.util.*;
/*
 Program: Write a java program that reads a Fahrenheit in a double value from the console,
 		  then converts it to Celsius and displays the result. The formula for the conversion
 		  is as follows: 
 		  Celsius= (Fahrenheit-32)*(5/9)
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
*/
public class Q1 
{
	public static void main(String args[])
	{
		Scanner k=new Scanner(System.in);
		System.out.print("Enter a degree in Fahrenheit: ");
		float f=k.nextFloat();
		float c=(float) ((f-32)*(5.0/9));
		System.out.print(f+" Fahrenheit is "+c+" Celsius");
		k.close();
	}
}
