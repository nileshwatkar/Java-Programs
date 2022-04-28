/*63. Write a C++ program which prints three highest numbers from a list of
numbers in descending order.*/

import java.util.*;

public class assi1q63
{
		public static void main(String[] args) 
    {
        
        Scanner s = new Scanner(System.in);
		
		int n;
		int a[3];
		
        System.out.print("Enter the first number:");
		n = s.nextInt();
        
		System.out.print("Enter the second number:");
        n= s.nextInt();
        
		System.out.print("Enter the third number:");
        n= s.nextInt();
        
		if(n>0)
        {
            System.out.println("Largest number is:"+n);
        }
        else if(0<n)
        {
            System.out.println("Largest number is:"+n);
        }
        else
        {
            System.out.println("Largest number is:"+n);
        }
			
			System.out.print("Ascending Order:");
        for (int i = 0; i < n - 1; i++) 
        {
			//int a[];
            System.out.print(a[i]);
        }
        System.out.print(a[n - 1]);
	}
}
