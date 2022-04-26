/*3. Write a program in Java to find Size of fundamental data types. 
Sample Output:
Find Size of fundamental data types :
------------------------------------------
The sizeof(char) is : 1 bytes
The sizeof(short) is : 2 bytes
The sizeof(int) is : 4 bytes
The sizeof(long) is : 8 bytes
The sizeof(long long) is : 8 bytes
The sizeof(float) is : 4 bytes
The sizeof(double) is : 8 bytes
The sizeof(long double) is : 16 bytes
The sizeof(bool) is : 1 bytes*/

import java.util.*;

public class assi1q3
{
	public static void main(String[] args)
	{
		System.out.println("The sizeof(char) is :"+Character.BYTES);
		System.out.println("The sizeof(short) is :"+ Short.BYTES);
		System.out.println("The sizeof(int) is :"+ Integer.BYTES);
		System.out.println("The sizeof(long) is :"+ Long.BYTES);
		System.out.println("The sizeof(double) is :"+ Double.BYTES);

	}
}

/*
F:\java>javac assi1q3.java

F:\java>java assi1q3
The sizeof(char) is :2
The sizeof(short) is :2
The sizeof(int) is :4
The sizeof(long) is :8
The sizeof(double) is :8

F:\java>
*/