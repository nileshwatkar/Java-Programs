/*65. Write a C++ program to check whether given length of three side form a right
triangle.*/

import java.util.*;

public class assi1q65
{
		public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);

		int a,b,c;

       System.out.print("Enter length of largest side: ");

       a=sc.nextInt();

       System.out.print("Enter length of base: ");

       b=sc.nextInt();

       System.out.print("Enter length of height: ");

       c=sc.nextInt();

       sc.close();

       if(a * a == b * b + c * c)

           System.out.println("\nIt is a Right angled triangle.");

       else

           System.out.println("\nIt is not a right angled triangle.");

   }

}



/*Output:
F:\java>javac assi1q65.java

F:\java>java assi1q65
Enter length of largest side: 5
Enter length of base: 3
Enter length of height: 5

It is not a right angled triangle.

F:\java>java assi1q65
Enter length of largest side: 5
Enter length of base: 4
Enter length of height: 3

It is a Right angled triangle.

F:\java>*/
