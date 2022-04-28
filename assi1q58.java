/*58. Write a program in C++ to print the area of a polygon.
Sample Output:
Print the area of a polygon:
---------------------------------
Input the number of sides of the polygon: 7
Input the length of each side of the polygon: 6
The area of the polygon is: 130.821*/



import java.util.*;

public class assi1q58
{
		public static void main(String args[])
		{
		Scanner sc=new Scanner(System.in);
		
        double areaofpolygon,sideofpolygon,numberofside;

                System.out.println(" Print the area of a polygon:");
                System.out.println("--------------------------------");

                     System.out.println("Input the number of sides of the polygon: ");
                   numberofside=sc.nextDouble();

                     System.out.println("Input the length of each side of the polygon: ");
                   sideofpolygon=sc.nextDouble();

                    areaofpolygon=(numberofside*(sideofpolygon*sideofpolygon))/(4.0*Math.tan((Math.PI/numberofside)));

                      System.out.println("The area of the ploygon is: "+areaofpolygon+" ");
		}
}
/*
F:\java>javac assi1q58.java

F:\java>java assi1q58
 Print the area of a polygon:
--------------------------------
Input the number of sides of the polygon:
7
Input the length of each side of the polygon:
6
The area of the ploygon is: 130.82084798405722

F:\java>*/


