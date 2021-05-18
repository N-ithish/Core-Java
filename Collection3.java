import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Collection3 {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(25);
		list1.add(35);
		list1.add(24);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(70);
		list2.add(26);
		list2.add(10);
		
		
		list1.addAll(list2);  // Merge
		list1.removeAll(list2); // removes the values containing data
		// list2.clear() // Clears the list
		boolean t =list1.contains(35); 
	//	list1.retainAll(list2);  // retains only the values in list 2 
		
		Collections.sort(list1);
		System.out.println(list1);
		
		HashSet<Employee_c> hashset = new HashSet<Employee_c>();
		hashset.add(new Employee_c("Thor",20000,400));
		hashset.add(new Employee_c("Tony",200000000,8));
		hashset.add(new Employee_c("Captain America",50000,70));
		hashset.add(new Employee_c("Bruce",120000,7));
		hashset.add(new Employee_c("Ant Man",12000,3));
		
		ArrayList<Employee_c> emp = new ArrayList<Employee_c>(hashset);
		
		Collections.sort(emp);
		
		System.out.println(emp);
		
	}

}
