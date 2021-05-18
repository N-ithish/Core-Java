import java.util.ArrayList;
import java.util.LinkedList;

public class Collection {

	public static void main(String[] args) {
		//Array list i.e. Array replaceable.
		
		ArrayList words = new ArrayList();
		words.add("Hello");
		words.add("Mr.Stark");
		words.add("Morning");
		words.add(32);
		words.add(100);
		words.add(42.00);
		
		
		words.remove(2);
		
		String item1= (String) words.get(0);
		Object item2 =  words.get(3);
		Object item3 = words.get(2);
	//	System.out.println(item3 + item2);
		int i2 = (int) words.get(2);
		int i3 = (int) words.get(3);
		System.out.println(i3+i2);
		
		
		//to avoid we must specify type
		
		ArrayList<String> w = new ArrayList<String>();
		w.add("Hello");
		w.add("Mr.stark");
//		w.add(234);  // does not accept int
		
	//	LinkedList<int> numbers = new LinkedList<int>(); // premitive data types cannot be used
		
		LinkedList<Integer> num = new LinkedList<Integer>();
		num.add(100);
		num.add(200);
		num.add(300);
		
		for(int n : num) {
			System.out.println(n);
		}
		
		
		
	}

}
