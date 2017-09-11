package QBRating;

import java.util.Scanner;

public class QBRating {

public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner input = new Scanner (System.in);
	int td = 0;
	int yd = 0;
	int intercept = 0;
	int complete = 0;
	int attempted = 0;
	

/* Ask the user to input the # of touch downs. */
 do {
	 System.out.print("Enter the number of touch downs:  ");
	    while (!input.hasNextInt()) {
	        System.out.println("You did not enter a number.  Please try again.\n");
	        System.out.print("Enter the number of touch downs:  ");
	        input.next(); 
	    }
	    td = input.nextInt();
	    if (td<0) {
	    	System.out.println("You cannot enter a negative number.  Please try again.\n");
	    }
 }
 while (td < 0);

/* Ask the user to input the # of yards. */	 
		System.out.print("Enter the total yards:  ");
	    while (!input.hasNextInt()) {
	        System.out.println("You did not enter a number.  Please try again.\n");
	        System.out.print("Enter the number of yards:  ");
	        input.next(); 
	    }
	    yd = input.nextInt();

 
/* Ask the user to input the # of interceptions. */
 do {
		System.out.print("Enter the total interceptions:  ");
	    while (!input.hasNextInt()) {
	        System.out.println("You did not enter a number.  Please try again.\n");
	        System.out.print("Enter the number of interceptions:  ");
	        input.next(); 
	    }
	    intercept = input.nextInt();
	    if (intercept<0) {
	    	System.out.println("You cannot enter a negative number.  Please try again.\n");
	    }
 }
 while (intercept < 0);

/* Ask the user to input the # of completions. */
 do {
		System.out.print("Enter the total number of completions:  ");
	    while (!input.hasNextInt()) {
	        System.out.println("You did not enter a number.  Please try again.\n");
	        System.out.print("Enter the number of completions:  ");
	        input.next(); // this is important!
	    }
	    complete = input.nextInt();
	    if (complete<0) {
	    	System.out.println("You cannot enter a negative number.  Please try again.\n");
	    }
 }
 while (complete < 0);

/* Ask the user to input the # of passes attempted. */
 do {
		System.out.print("Enter the total number of passes attempted:  ");
	    while (!input.hasNextInt()) {
	        System.out.println("You did not enter a number.  Please try again.\n");
	        System.out.print("Enter the number of passes attempted:  ");
	        input.next(); // this is important!
	    }
	    attempted = input.nextInt();
	    if (attempted<=0) {
	    	System.out.println("You must enter a value that is greater than 0.  Please try again.\n");
	    }
 }
 while (attempted <= 0);

double a = ((complete / attempted) -.3) *5;
if (a > 2.375) {
	a = 2.375;
}
else if (a < 0 )
{
	a = 0;
}
System.out.println("\nPercentage of passes completed is " + a);
	
double b = ((yd / attempted)-3)*.25;
if (b > 2.375) {
	b = 2.375;
}
else if (b < 0 )
{
	b = 0;
}
System.out.println("Yards gained per pass attempt is " + b);

double c = (td / attempted)*20;
if (c > 2.375) {
	c = 2.375;
}
else if (c < 0 )
{
	c = 0;
}
System.out.println("Percentage of touchdowns thrown when attempting to pass is " + c);

double d = 2.375 - (intercept / attempted *25);
if (d > 2.375) {
	d = 2.375;
}
else if (d < 0 )
{
	d = 0;
}
System.out.println("Percentage of times intercepted when attempting to pass is " + d);

double QBRating = ((a+b+c+d)/6) * 100;

System.out.printf("\nThe QB rating is %.2f", QBRating);



}

}