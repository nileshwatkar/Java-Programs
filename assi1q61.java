/*61. Write a C++ program to swap first and last digits of any number.
Sample Output:
Input any number: 12345
The number after swapping the first and last digits are: 52341*/


import java.util.*;

public class assi1q58
{
		public static void main(String args[])
		{
		Scanner sc=new Scanner(System.in);
		
		
		int number,first,last,sum,digits,number1,a,b;

             System.out.println("Find the number after swapping the first and last digits:");
             System.out.println("-------------------------------------------------------------");

                System.out.println("Input any number: ");
                number=sc.nextInt();

                    digits=(int)log10(number);
                    first=number/Math.pow(10,digits);
                    last=number%10;

                    a=first*(Math.pow(10,digits));
                    b=number%a;
                    number=b/10;

                    number1=last*(Math.pow(10, digits))+(number*10+first);

                         System.out.println("The number after swaping the first and last digits are:"+number1);
		}
}


