/*
 Program: Write a java program that displays the following table. Cast floating-point numbers into integers.
			a b pow(a, b)
			1 2 1
			2 3 8
			3 4 81
			4 5 1024
			5 6 15625
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
public class Q7 
{
	public static void main(String args[])
	{
		int a=1,b=1;
		System.out.print("a\tb\tpow(a,b)\n");
		System.out.print(a+"\t"+ ++b +"\t"+((int)(Math.pow(a,b)))+"\n");
		System.out.print(++a +"\t"+ ++b +"\t"+((int)(Math.pow(a,b)))+"\n");
		System.out.print(++a +"\t"+ ++b +"\t"+((int)(Math.pow(a,b)))+"\n");
		System.out.print(++a +"\t"+ ++b +"\t"+((int)(Math.pow(a,b)))+"\n");
		System.out.print(++a +"\t"+ ++b +"\t"+((int)(Math.pow(a,b)))+"\n");
		/*for ( ;a<=5;a++)
		{
			b++;
			System.out.print(a+"\t"+b+"\t"+((int)(Math.pow(a,b)))+"\n");
		}*/
	}
}
