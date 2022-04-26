/*30. Write a program in C++ to compute the total and average of four numbers.
Sample Output:
Compute the total and average of four numbers :
----------------------------------------------------
Input 1st two numbers (separated by space) : 25 20
Input last two numbers (separated by space) : 15 25
The total of four numbers is : 85
The average of four numbers is : 21.25*/


import java.util.*;

public class assi1q30
{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
    	
			double number1,number2,number3,number4,total,average;

            System.out.println(" Compute the total and average of four numbers :");
            System.out.println("----------------------------------------------------");

            System.out.println("Input 1st two numbers (separated by space) : ");
            number1=sc.nextDouble();
			number2=sc.nextDouble();

            System.out.println("Input last two numbers (separated by space) : ");
            number3=sc.nextDouble();
			number4=sc.nextDouble();

                total=number1+number2+number3+number4;
                average=total/4;

                    System.out.println("The total of four numbers is : "+total);
                    System.out.println("The average of four numbers is : "+average);

        }
    }
/*
F:\java>javac assi1q30.java

F:\java>java assi1q30
 Compute the total and average of four numbers :
----------------------------------------------------
Input 1st two numbers (separated by space) :
25 20
Input last two numbers (separated by space) :
15 25
The total of four numbers is : 85.0
The average of four numbers is : 21.25

F:\java>


*/