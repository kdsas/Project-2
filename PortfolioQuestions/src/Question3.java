
public class Question3 {

	
public static String reversingString(char []str,
	                               int start,
	                               int end)
	{
	    // Iterate loop up to start not equal to end
	    while (start < end)
	    {
	       
	        str[start] ^= str[end];
	        str[end] ^= str[start];
	        str[start] ^= str[end];
	 
	        ++start;
	        --end;
	    }
	    return String.valueOf(str);
	}
	 
	public static void ReverseIt() {
		
		 String s = "HelloWorld";
		    System.out.println(reversingString
		   (s.toCharArray(), 0, 9));
		
		
		
	}
	
	
}
