import java.util.ArrayList;
public class Arrays {
  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<Integer>();
    ArrayList<Integer> arr2 = new ArrayList<Integer>();
    for(int i=0; i<4;i++){
      arr.add((int)(Math.random() * ((50 - 1) + 1)));
    }
    System.out.println(arr.toString());
    int val = 1;
    for(Integer x: arr){
        for(Integer y: arr) {
        val *=y;
        }
        val /=x;
      arr2.add(val);
      val = 1;
    }
    System.out.println(arr2.toString());
  }
}