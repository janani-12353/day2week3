package week3.New;


import java.util.Arrays;

public class SecondLargestNumber {
	public static void main(String[] args) {
		int[] data= {3,2,11,4,6,7};
		//arrange the array using
		Arrays.sort(data);//2,3,4,6,7,11
		int length = data.length;
		System.out.println(data[length-2]);
	}

}
