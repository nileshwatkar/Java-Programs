/*. Write a program in C++ to find the area of any triangle using Heron's
Formula.
Sample Output:
Find the area of any triangle using Heron's Formula :
----------------------------------------------------------
Input the length of 1st side of the triangle : 5
Input the length of 2nd side of the triangle : 5
Input the length of 3rd side of the triangle : 5
The area of the triangle is : 10.8253*/


import java.util.*;


public class assi1q18
{
	public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);

			float sidea,sideb,sidec,area,herons;

				System.out.println("\n\n Find the area of any triangle using Hero's Formula");
				System.out.println("----------------------------------------------------");


                System.out.println("\n\nInput the Length of 1st side of the triangle:");
                sidea=sc.nextInt();

                System.out.println("\nInput the Length of 2st side of the triangle:");
                sideb=sc.nextInt();

                System.out.println("\nInput the Length of 3st side of the triangle:");//
                sidec=sc.nextInt();

                herons=(sidea+sideb+sidec)/2;
                area=Math.sqrt(herons*(herons-sidea)*(herons-sideb)*(herons-sidec));//herons formula for triangle

               System.out.println("\n The area of the triangle is:"+area);
		
		}
		
		


}
