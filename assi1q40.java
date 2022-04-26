/*40. Write a program in C++ to print the area and perimeter of a rectangle.
Sample Output:
Print the area and perimeter of a rectangle:
----------------------------------------------
Input the width of the rectangle: 8.5
Input the height of the rectangle: 5.6
The area of the rectangle is: 47.6
The perimeter of the rectangle is: 28.2*/


import java.util.*;

public class assi1q40
{
		public static void main(String[] args)
		{
				Scanner sc=new Scanner(System.in);
           
				double area,perimeter,width,height=0;

                System.out.println("Print the area and perimeter of a rectangle:");
                System.out.println("----------------------------------------------");

                    System.out.println("Input the width of the rectangle: ");
                    width=sc.nextDouble();

                        System.out.println("Input the height of the rectangle: ");
                        height=sc.nextDouble();


                perimeter=2 * (width+height);
                area= height * width;

                    System.out.println("The area of the rectangle is: "+area);
                    System.out.println("The perimeter of the rectangle is: "+perimeter);
		}
}
/*
F:\java>javac assi1q40.java

F:\java>java assi1q40
Print the area and perimeter of a rectangle:
----------------------------------------------
Input the width of the rectangle:
8.5
Input the height of the rectangle:
5.6
The area of the rectangle is: 47.599999999999994
The perimeter of the rectangle is: 28.2

F:\java>*/