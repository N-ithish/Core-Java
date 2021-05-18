import java.util.ArrayList;

public class Collections1 {

	public static void main(String[] args) {
		
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("Lion");
		animals.add("Tiger");
		animals.add("Dog");
		
//		for(int i =0 ;i< animals.size();i++) {
//			System.out.println(animals.get(i));
//			
//		}
//		
//		for(String j : animals) {
//			System.out.println(j);
//		}


		ArrayList<Vehicle> veh = new ArrayList<Vehicle>();
		veh.add(new Vehicle("Honda","City",300000,false));
		Vehicle vehicle2 = new Vehicle("Toyota","Camery",400000,false);
		veh.add(vehicle2);
		veh.add(new Vehicle("Jeep","Wrangler",250000,true));
		
		for(Vehicle car : veh) {
			System.out.println(car);
			
		}
		
	
	}

}
