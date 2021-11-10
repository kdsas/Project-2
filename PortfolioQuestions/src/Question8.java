import java.util.ArrayList;

public class Question8 {

	public boolean isPalindrome(String s) {
		
		for (int i=0; i<s.length()/2;++i) {
		
			if(s.charAt(i)!=s.charAt(s.length()-1-i))
				return false;
			
			
		}
		return true;
	}
	
	
	public void Palindrome() {
		

		ArrayList palindromeCandidates= new ArrayList();
		palindromeCandidates.add("karan");
		palindromeCandidates.add("madam");
		palindromeCandidates.add("tom");
		palindromeCandidates.add("civic");
		palindromeCandidates.add("radar");
		palindromeCandidates.add("jimmy");
		palindromeCandidates.add("kayak");
		palindromeCandidates.add("john");
		palindromeCandidates.add("refer");
		palindromeCandidates.add("billy");
		palindromeCandidates.add("did");
		ArrayList<String> palindrome= new ArrayList<String>();
		palindrome.add("karan");
		palindrome.add("madam");
		palindrome.add("tom");
		palindrome.add("civic");
		palindrome.add("radar");
		palindrome.add("jimmy");
		palindrome.add("kayak");
		palindrome.add("john");
		palindrome.add("refer");
		palindrome.add("billy");
		palindrome.add("did");
		

		for (String i : palindrome) {
		      System.out.println(i);
		    }
		
	}
	
}
