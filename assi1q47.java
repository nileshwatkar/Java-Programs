/*47. Write a program in C++ to find the area of any triangle using Heron's
Formula.
Sample Output:
Find the area of any triangle using Heron's Formula :
----------------------------------------------------------
Input the length of 1st side of the triangle : 5
Input the length of 2nd side of the triangle : 6
Input the length of 3rd side of the triangle : 7
The area of the triangle is : 14.6969*/



import java.util.*;

public class assi1q47
{
		public static void main(String args[])
		{
		Scanner sc=new Scanner(System.in);

    double sidea, sideb, sidec, area, sd;
	
		System.out.println(" Find the area of any triangle using Heron's Formula :");
		System.out.println("----------------------------------------------------------");

            System.out.println("Input the length of 1st side  of the triangle : ");
            sidea=sc.nextDouble();

            System.out.println("Input the length of 2nd side  of the triangle : ");
            sideb=sc.nextDouble();

            System.out.println("Input the length of 3rd side  of the triangle : ");
            sidec=sc.nextDouble();

            sd= (sidea+sideb+sidec)/2;
            area = Math.sqrt(sd*(sd-sidea)*(sd-sideb)*(sd-sidec));

                System.out.println("The area of the triangle is : "+area);
                System.out.println("");
        }
}

/*

F:\java>javac assi1q47.java

F:\java>java assi1q47
 Find the area of any triangle using Heron's Formula :
----------------------------------------------------------
Input the length of 1st side  of the triangle :
5
Input the length of 2nd side  of the triangle :
6
Input the length of 3rd side  of the triangle :
7
The area of the triangle is : 14.696938456699069


F:\java>
*/
