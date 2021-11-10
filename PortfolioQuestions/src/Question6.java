
public class Question6 {

	

    static boolean isEven(int n)
    {
        boolean isEven = true;
         
        for (int i = 1; i <= n; i++)
            isEven = !isEven;
             
        return isEven;
    }
     
    
    public static void CheckIt() {
    	
    	int n = 50;
        if(isEven(n))
            System.out.println("Even");
        else
            System.out.println("Odd");
    	
    }
	
	
}
