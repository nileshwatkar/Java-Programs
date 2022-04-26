/*31. Write a program in C++ to input a single digit number and print a rectangular
form of 4 columns and 6 rows.
Sample Output:
Make a rectangular shape by a single digit number :
--------------------------------------------------------
Input the number : 5
5555
5 5
5 5
5 5
5 5
5555*/


import java.util.*;

public class assi1q31
{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			
				int a;
			
              System.out.println(" Make a rectangular shape by a single digit number");
              System.out.println("--------------------------------------------------------");

                  System.out.println("Input the number : ");
					a=sc.nextInt();
				
          System.out.println(""+a+""+a+""+a+""+a+""+a+"");

          System.out.println(+a+" "+" "+a);

          System.out.println(+a+" "+" "+a);

          System.out.println(+a+" "+" "+a);

          System.out.println(+a+" "+" "+a);

          System.out.println(""+a+""+a+""+a+""+a+""+a+"");
		}

}

/*
F:\java>javac assi1q31.java

F:\java>java assi1q31
 Make a rectangular shape by a single digit number
--------------------------------------------------------
Input the number :
5
55555
5  5
5  5
5  5
5  5
55555

F:\java>*/