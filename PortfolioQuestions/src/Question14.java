import java.sql.Date;
import java.util.Calendar;
import java.util.Scanner;

public class Question14 {

	
	public static void Switchit() {
		int math = 0;
		int date = 1;
		int split = 2;
		switch (math) {
        case 1:Double num;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextDouble();
        Double square = Math.pow(num, 2);
        System.out.println("Square of "+ num + " is: "+ square);
        
        
    	switch (date) {
        case 2:java.util.Date dated=Calendar.getInstance().getTime();
        System.out.println(dated);

        
        
        switch (split) {
        case 3:String s1= "[I am learning Core Java”]";

        String[]  array = s1.split(",");
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
        break; 
        
        }
          
	
	
}

        
		}      
        
		  
	}
}
        
      
		
        	
    	
	
      
		
		
		
		
	
		
		
		
	


