/*48. Write a program in C++ which swap the values of two variables not using
third variable.
Sample Output:
Swap two numbers without using third variable:
---------------------------------------------------
Input 1st number : 25
Input 2nd number : 20
After swapping the 1st number is : 20
After swapping the 2nd number is : 25*/



import java.util.*;

public class assi1q48
{
		public static void main(String args[])
		{
		Scanner sc=new Scanner(System.in);

        int number1,number2, temp;

            System.out.println("  Swap two numbers without using third variable:");
            System.out.println(" ---------------------------------------------------");

                System.out.println(" Input 1st number : ");
                number1=sc.nextInt();

                System.out.println(" Input 2nd number : ");
               number2=sc.nextInt();

                    number2=number2+number1;
                    number1=number2-number1;
                    number2=number2-number1;

                           System.out.println(" After swapping the 1st number is : "+number1);
                            System.out.println(" After swapping the 2nd number is : "+number2);
		}
}

/*
F:\java>javac assi1q48.java

F:\java>java assi1q48
  Swap two numbers without using third variable:
 ---------------------------------------------------
 Input 1st number :
20
 Input 2nd number :
25
 After swapping the 1st number is : 25
 After swapping the 2nd number is : 20

F:\java>*/
