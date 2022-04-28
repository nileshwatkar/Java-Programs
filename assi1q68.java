/*68. Write a C++ program to read seven numbers and sorts them in descending
order.*/

import java.util.*;

public class assi1q68
{  
        public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
        int n, temp;
        
        System.out.print("Enter no. of elements you want in array:");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] < a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Descending Order:");
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[n - 1]);
    }
}
/*
F:\java>java assi1q68
Enter no. of elements you want in array:5
Enter all the elements:
1
2
3
4
5
Descending Order:5,4,3,2,1
F:\java>
*/