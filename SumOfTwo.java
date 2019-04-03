import java.util.ArrayList;
import java.util.Collections;

public class SumOfTwo {

	public static void main(String[]args) {
		boolean valid = false;
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(5);
		a.add(8);
		//a.add(22);
		//a.add(11);
		//a.add(111);
		Collections.sort(a);
	    int b = 8;
		for (int x = 0, y = a.size()-1; x < y;){
	        int sum = a.get(x) + a.get(y);
	        if (sum < b)
	            x++;
	        else if (sum > b)
	            y--;
	        else {
	            valid=true;
	        	break;}
	    }
	    System.out.println(valid);
	}
}
