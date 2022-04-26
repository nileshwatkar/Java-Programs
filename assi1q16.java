/*16. Write a program in C++ to calculate the volume of a cylinder. 
Sample Output:
Calculate the volume of a cylinder :
-----------------------------------------
Input the radius of the cylinder : 6
Input the height of the cylinder : 8
The volume of a cylinder is : 904.32*/

import java.util.*;
public class assi1q16
{
		public static void main(String[] args)
		{
			
		
			Scanner sc=new Scanner(System.in);
			
			double radius,volumeofCylinder,height;
			
			System.out.println("calculate the volume of cylinder");
		

				System.out.println("Input the radius of the cylinder:");
			
				radius=sc.nextDouble(); //input for thr radius of the cylinder

            
					System.out.println(" Input of the height of the cylinder:");
			
					 height=sc.nextDouble();//input for the height of the Cylinder


					
						volumeofCylinder=3.14*radius*radius*height; //formula for the volume of the cylinder
				
				System.out.println(" The Volume of a Cylinder is:"+volumeofCylinder);//output of the volum
		}
		

}	

/*C:\Users\Pcc>F:

F:\>cd java

F:\java>javac assi1q16.java

F:\java>java assi1q16
calculate the volume of cylinder
Input the radius of the cylinder:
6
 Input of the height of the cylinder:
8
 The Volume of a Cylinder is:904.3199999999999

F:\java>
*/	