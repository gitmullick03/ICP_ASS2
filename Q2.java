import java.util.*;
/*
 Program: The distance between two cities (in km.) is input through the keyboard. Write a java program
		  to convert and print this distance in meters, feet, inches and centimetres.
		  Hint:
		  1km= 1000 metre
		  1km= 3280.8399 feet
		  1km= 39370.0787 inch
		  1km= 100000 centimetre
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
public class Q2
{
	public static void main(String args[])
	{
		Scanner dis=new Scanner(System.in);
		System.out.print("Enter the distance in km: ");
		double km=dis.nextDouble();
		double mt=km*1000,ft=km*3280.8399,in=km*39370.0787,ct=km*100000;
		System.out.print("\n\t"+km+" km is "+mt+" metres"+"\n\t"+km+" km is "+ft+" feet"+"\n\t"+km+" km is "+in+" inches"+"\n\t"+km+" km is "
		+ct+" centimetres");
		dis.close();
	}
}