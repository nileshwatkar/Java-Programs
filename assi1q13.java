/*13. Write a program in C++ to swap two numbers. 
Sample Output:
Swap two numbers :
-----------------------
Input 1st number : 25
Input 2nd number : 39
After swapping the 1st number is : 39
After swapping the 2nd number is : 25*/

public class assi1q13
{
	public static void main(String[] args)
	{
		int firstNumber=25,secondNumber=39,temp;
		
		temp=firstNumber;
		firstNumber=secondNumber;
		secondNumber=temp;
		
		System.out.println("After swapping the 1st number is :"+firstNumber);
		System.out.println("After swapping the 2st number is :"+secondNumber);
	}
}

/*
F:\java>javac assi1q13.java

F:\java>java assi1q13
After swapping the 1st number is :39
After swapping the 2st number is :25

F:\java>
*/