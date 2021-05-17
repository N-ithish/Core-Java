
public class Fish extends Animal{

	
	public Fish(int age, char gender, String kind) {
		super(age, gender, kind);
		
	}

	public void swim() {
		System.out.println("Ability to swim...");
	}
	
	public void sleep() {
		System.out.println("Will not sleep...");
	}

	@Override
	public void move() {
		System.out.println("Swimming....");
		
	}
}
