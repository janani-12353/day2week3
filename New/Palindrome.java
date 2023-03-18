package week3.New;

public class Palindrome {
	public static void main(String[] args) {
		//declare string value 
		String str="madam";
		String rev="";
		//iterate over string reverse
		for (int i = str.length()-1; i >=0; i--) {
			//add the char into rev
			char ch = str.charAt(i);
			rev=rev+ch;
		}
			//compare the orginal string into reverse string
			
			if (str.equals(rev)) {
				System.out.println("this is palindrome");
				
			} else
				System.out.println("this is not palindrome");
			{

			}
		}
}
