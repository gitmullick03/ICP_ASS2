import java.util.*;
/*
 Program: When a brick is dropped from a tower, it falls faster and faster until it hits the earth. The
          distance it travels is given by d = (1/2) gt 2
          Here d is in feet, t is the time in seconds, and g is 32.174.
          Write a program that asks the user for the number of seconds and then prints out the distance travelled.
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
public class Q6
{
	public static void main(String args[])
	{
		Scanner l=new Scanner(System.in);
		System.out.print("Enter the number of seconds: ");
		double t=l.nextDouble();
		double dis=(1.0/2)*32.174*(Math.pow(t,2));
		System.out.print("\nDistance travelled: "+dis);
		l.close();
	}
}