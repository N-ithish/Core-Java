
public class Chicken extends Birds implements Flyable{

	public Chicken(int age, char gender, String kind) {
		super(age, gender, kind);
		
	}

	@Override
	public void fly() {
		System.out.println("Not flyable....");
		
	}
	
//	public void fly() {
//		System.out.println("Will Not be able to....");
//	}

}
