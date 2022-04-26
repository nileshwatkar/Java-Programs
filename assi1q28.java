/*28. Write a program in C++ to find the area of Scalene Triangle.
Sample Output:
Find the area of Scalene Triangle :
----------------------------------------
Input the length of a side of the triangle : 5
Input the length of another side of the triangle : 6
Input the angle between these sides of the triangle : 6
The area of the Scalene Triangle is : 1.56793*/


import java.util.*;

public class assi1q28
{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			
				double area,sidea,sideb,angle;

            System.out.println(" Find the area of Scalene Triangle");
            System.out.println("----------------------------------------\n");

            System.out.println("Input the length of a side  of the triangle : ");
            sidea=sc.nextDouble();

            System.out.println("Input the length of another side  of the triangle : ");
            sideb=sc.nextDouble();

            System.out.println("Input the angle between these sides of the triangle : ");
            angle=sc.nextDouble();

            area=(sidea*sideb*Math.sin((3.14/180)*angle))/2;

                    System.out.println("The area of the Scalene Triangle is : "+area);
		}
}
/*
F:\java>javac assi1q28.java
assi1q28.java:33: error: cannot find symbol
            area=(sidea*sideb*sin((3.14/180)*angle))/2;
                              ^
  symbol:   method sin(double)
  location: class assi1q28
1 error

F:\java>javac assi1q28.java

F:\java>java assi1q28
 Find the area of Scalene Triangle
----------------------------------------

Input the length of a side  of the triangle :
5
Input the length of another side  of the triangle :
6
Input the angle between these sides of the triangle :
6
The area of the Scalene Triangle is : 1.5671349823722713

F:\java>*/