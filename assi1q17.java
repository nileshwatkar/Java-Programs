/*17. Write a program in C++ to find the Area and Perimeter of a Rectangle.
Sample Output:
Find the Area and Perimeter of a Rectangle :
-------------------------------------------------
Input the length of the rectangle : 10
Input the width of the rectangle : 15
The area of the rectangle is : 150
The perimeter of the rectangle is : 50*/

import java.util.*;

public class assi1q17
{
		public static void main(String[] args)
		{
			Scanner sc=new Scannner(System.in);



				int length,width,perimeter,area;

					System.out.println("\n\n Find below the Area and Perimeter of a Rectangle");

					System.out.println("\n\n Input the length of the rectangle: ");
				
					length=sc.nextInt();//getting input for length

            cout<<"\n Input the Width of the rectangle: ";
            cin>>width;// getting input for Width

                area=(length*width); //formula for the area
                perimeter=2*(length+width);//formula for the perimeter

                    cout<<"\n The area of the rectangle is: "<<area;//output for The area of the rectangle
                    cout<<"\n The Perimeter of the rectangle is: "<<perimeter;