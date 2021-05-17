
public class Sparrow extends Birds implements Flyable {

	public Sparrow(int age, char gender, String kind) {
		super(age, gender, kind);
		
	}

	@Override
	public void fly() {
		System.out.println("Fly High....");
		
	}

}
