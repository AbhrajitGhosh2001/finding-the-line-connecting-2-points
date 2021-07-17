import java.util.Scanner;

public class HW1
{
	   public static void main (String [] args)
	   {
		   Scanner keyboard = new Scanner(System.in);
		   
		   double x1;
		   double y1;
		   double x2;
		   double y2;
		   double m;
		   double b;
		   
		   System.out.println("What is your first x value?");
		   x1= keyboard.nextDouble();
		   System.out.println("What is your first y value?");
		   y1= keyboard.nextDouble();
		   System.out.println("What is your next x value?");
		   x2= keyboard.nextDouble();
		   System.out.println("What is your next y value?");
		   y2= keyboard.nextDouble();
		   
		   m= (y1-y2)/(x1-x2);
		   b= y1/(m*x1);
		   
		   System.out.println("y="+ m +"x+"+ b);
		   
		   keyboard.close();
	   }
}