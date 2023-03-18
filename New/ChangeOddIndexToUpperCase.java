package week3.New;


public class ChangeOddIndexToUpperCase {
public static void main(String[] args) {
	String name ="changeme";
	String str="";
	char[] ch = name.toCharArray();
	
	for (int i = 0; i < ch.length; i++) {
		
		if (i%2==1) {
			ch[i] = Character.toUpperCase(ch[i]);
			str=str+ch[i];
		}
		else
		{
			
			str=str+ch[i];
			
		}
	}
	System.out.println(str);
		
	}
}
		
	


