package fundamentals.patterns;

import java.util.*;

class Butterfly
{

	public static void main(String args [])
	{
 		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of lines");
		System.out.println("Don't enyer more than 5 ");
		int n = sc.nextInt();
		
		for (int i = 1 ; i <= n ; i++)
		{

			for (int j = 1 ; j <= i ; j++)
			{
				System.out.print("*");

			}
			for (int k = 1 ; k <= 2 * (5 - i) ; k++)
			{
				System.out.print(" ");
			}
			for (int l = 1 ; l <= i ; l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 5 ; i >= 1 ; i--)
		{

			for (int j = 1 ; j <= i ; j++)
			{
				System.out.print("*");

			}
			for (int k = 1 ; k <= 2 * (5 - i) ; k++)
			{
				System.out.print(" ");
			}
			for (int l = 1 ; l <= i ; l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
        sc.close();
	}
}

