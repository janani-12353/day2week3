package week3.New;



public class RemoveDuplicates {
	public static void main(String[] args) {
		String text="we learn java basics as part of java sessions in java week1";
		String[] split2 = text.split(" ");
		//error got: split can not resolved for int type
		int count=0;
		for (int i = 0; i < split2.length; i++) {
			for (int j = i+1; j < split2.length; j++) {
				if (split2[i].equalsIgnoreCase(split2[j]))
					split2[j]="";
					count++;
					
				}
				
			}
			if (count>1) {
				for (int k = 0; k < split2.length; k++) {
		
					System.out.println(split2[k]+=" ");
					
				}
				
			}
				
			}
		
			
				
				
}



			
