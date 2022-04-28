/*44. Write a language program to get the volume of a sphere with radius 6.
Sample Output:
Calculate the volume of a sphere :
---------------------------------------
Input the radius of a sphere : 5
The volume of a sphere is : 523.333*/


import java.util.*;

public class assi1q44
{
		public static void main(String args[])
		{
		Scanner sc=new Scanner(System.in);
    	
    	double volumeofsphere;

            System.out.println(" Calculate the volume of a sphere :");
            System.out.println("---------------------------------------");
			
			
                System.out.println("Input the radius of a sphere : ");
                int radius=sc.nextInt();

                    volumeofsphere=(4*3.14*radius*radius*radius)/3;

                        System.out.println("The volume of a sphere is : "+volumeofsphere);
		}			
	
}




/*F:\java>javac assi1q44.java

F:\java>java assi1q44
 Calculate the volume of a sphere :
---------------------------------------
Input the radius of a sphere :
5
The volume of a sphere is : 523.3333333333334

F:\java>*/
