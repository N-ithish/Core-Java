import java.util.HashSet;
import java.util.LinkedHashSet;

public class Collection2 {

	public static void main(String[] args) {
		HashSet<Integer> values = new HashSet<Integer>();
		values.add(100);
		values.add(200);
		values.add(33);
		values.add(300);
		values.add(200);       //cannot be repeated
		
		for(Integer value: values) {
			System.out.println(value);
		}
		
		LinkedHashSet<String> zoo = new LinkedHashSet<String>();
		zoo.add("Lion");
		zoo.add("Tiger");
		zoo.add("panda");
		zoo.add("Monkey");
		zoo.add("Parrot");
		zoo.add("Monkey");
		zoo.add("deer");
		
		for(String animals : zoo) {
			System.out.println(animals);
		}
	
		HashSet<Animals_collection> animals = new HashSet<Animals_collection>();
		
		animals.add(new Animals_collection("Lion",12));
		animals.add(new Animals_collection("Tiger",13));
		animals.add(new Animals_collection("panda",14));
		animals.add(new Animals_collection("Monkey",21));
		animals.add(new Animals_collection("Parrot",3));
		animals.add(new Animals_collection("Monkey",10));
		animals.add(new Animals_collection("deer",5));
		animals.add(new Animals_collection("deer",10));
		
	 for( Animals_collection z : animals) {
		 System.out.println(z);
	 }
				

	}

}

