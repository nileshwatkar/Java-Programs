/*8. Write a program in Java to check overflow/underflow during various 
arithmetical operation. 
Sample Output:
Check overflow/underflow during various arithmetical operation :
Range of int is [-2147483648, 2147483647]
---------------------------------------------------------------------
Overflow the integer range and set in minimum range : -2147483648
Increasing from its minimum range : -2147483647
Product is :1
Underflow the range and set in maximum range : 2147483647
Decreasing from its maximum range : 2147483646
Product is : 0*/

public class assi1q8
{
	public static void main(String[] args)
	{
			
			int n1=2147483647,n2=-2147483648;
			
			
			System.out.println("Overflow the integer range and set in minimum range :"+(n1+1));
			System.out.println("Increasing from its minimum range :"+(n1+2));
			System.out.println("Product is :"+(n1 * n1));
			
			System.out.println("Underflow the range and set in maximum range :"+(n2 - 1));
			System.out.println("Decreasing from its maximum range :"+(n2 - 2));
			System.out.println("Product is :"+(n2 * n2));
			
			
			
	}
}
	
/*
F:\java>javac assi1q8.java

F:\java>java assi1q8
Overflow the integer range and set in minimum range :-2147483648
Increasing from its minimum range :-2147483647
Product is :1
Underflow the range and set in maximum range :2147483647
Decreasing from its maximum range :2147483646
Product is :0

F:\java>
*/		
			
			
			
			
			
			
			
			
			
			
			
			/*int value = Integer.MAX_VALUE-1;
			for(int i = 0; i < 4; i++, value++) 
			{
			System.out.println(value);
			}*/