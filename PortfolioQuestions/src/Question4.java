import java.util.Scanner;

public class Question4 {

	
	
  public static int factorial(int n)
    {
        if (n == 0)
            return 1;
 
        return n * factorial(n - 1);
    }
	
  
  public static void Factorial() {
	  
	  int num = 3;
      System.out.println("Factorial of " + num
         + " is " + factorial(3));
	  
	  
	  
  }
  
  
public static void AddNum() {
	  
	 int x, y, sum;
	    Scanner myObj = new Scanner(System.in); 
	    System.out.println("Type a number:");
	    x = myObj.nextInt(); 

	    System.out.println("Type another number:");
	    y = myObj.nextInt();

	    sum = x + y; 
	    System.out.println("Sum is: " + sum); 
	  
  }
}
