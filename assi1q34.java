/*34. Write a C++ program to display the current date and time.
Sample Output:
Display the Current Date and Time :
----------------------------------------
seconds = 57
minutes = 33
hours = 12
day of month = 6
month of year = 7
year = 2017
weekday = 4
day of year = 186
daylight savings = 0
Current Date: 6/7/2017
Current Time: 12:33:57*/



import java.util.*;

public class assi1q34
{
		public static void main(String[] args)
		{

 time_t t = time(NULL);
 tm* tPtr = localtime(t);
 
System.out.println("Display the Current Date and Time :");
System.out.println("----------------------------------------");
System.out.println(" seconds = "+(tPtr->tm_sec));
System.out.println("minutes = " +(tPtr->tm_min));
System.out.println(" hours = " << (tPtr->tm_hour));
System.out.println(" day of month = " << (tPtr->tm_mday));
System.out.println("month of year = " << (tPtr->tm_mon)+1);
System.out.println(" year = " << (tPtr->tm_year)+1900);
System.out.println(" weekday = " << (tPtr->tm_wday ));
System.out.println("day of year = " << (tPtr->tm_yday ));
System.out.println(" daylight savings = " <<(tPtr->tm_isdst ));
		
		System.out.println(" ");
        System.out.println(" ");
		


        System.out.println("  Current Date: "+(tPtr->tm_mday)+"/"+(tPtr->tm_mon)+1+"/"+(tPtr->tm_year)+1900);
        System.out.println(" Current Time: "+(tPtr->tm_hour)+":"+(tPtr->tm_min)+":"+(tPtr->tm_sec));
           System.out.println(" ");
   }
}


/**/
