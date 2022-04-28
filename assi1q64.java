/*64. Write a C++ program to compute the sum of the two given integers and count
the number of digits of the sum value.*/

import java.util.*;

public class assi1q64
{
		public static void main(String[] args) 
    {
        
        Scanner s = new Scanner(System.in);
		

			int x, y;
            while(cin>>x>>y)
                {

            stringstream str1;

                str1<<x+y;

                cout<<str1.str().size();
                }

}

}
