import java.util.Arrays;
import java.util.Random;

/*Given an array of integers, find the first missing positive integer in linear time and constant space. 
*In other words, find the lowest positive integer that does not exist in the array. 
*The array can contain duplicates and negative numbers as well.*/

public class LowestPositive {

	public static void main(String[]args) {
		Random r = new Random();
		int[] arr = new int[5];
		int min = 1;
		for (int i = 0; i < arr.length; i++) {
	         arr[i] = r.nextInt(10); 
		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if(min == arr[i]) {
				min++;
			}
		}
		
		System.out.println(Arrays.toString(arr)+ "\n" +min);
		}

}
