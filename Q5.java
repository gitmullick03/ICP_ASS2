import java.util.*;
/*
 Program: Write a java program that reads the radius of a hemisphere and computes the surface area
 		  and volume using the following formulas:
 		  Surface Area of Hemisphere = 3 π r 2 . Volume of a hemisphere = (2/3)πr 3
 		  Where π is a constant whose value is equal to 3.14 approximately. “r” is the radius of the hemisphere. 
 		  Hint: Use Math.PI.
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
public class Q5
{
	public static void main(String args[])
	{
		Scanner p=new Scanner(System.in);
		System.out.print("\nEnter the radius of the hemisphere: ");
		double hemr=p.nextDouble();
		double surf=3*(Math.PI)*(Math.pow(hemr, 2));
		double vol=(2.0/3)*(Math.PI)*(Math.pow(hemr,3));
		System.out.print("The surface area of the hemisphere is "+surf+" square unit\nThe volume of the hemisphere is "+vol+" cube unit");
		p.close();
	}
}