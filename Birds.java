
public class Birds extends Animal {

	
	

	public Birds(int age, char gender, String kind) {
		super(age, gender, kind);
		
	}

	@Override
	public void move() {
		System.out.println("Flapping Wings.....");
		
	}

	//public void fly() {
	//	System.out.println("Ability to Fly...");
		
	//}
}
