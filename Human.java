
public class Human {

	String name;
	int age;
	int height;
	String eyecolor;
	
	
	
	
	public Human(String name, int age, int height, String eyecolor) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.eyecolor = eyecolor;
	}
	public  void speak() {
		System.out.println("Hii.."+name);
		System.out.println("Height..."+height);
		System.out.println("Age...."+age);
		System.out.println("Eye Color...."+eyecolor);
		
	}
	public void eat() {
		System.out.println("What you wish to eat?");
	}
	public void walk() {
		System.out.println("Able to walk");
	}
	public void work() {
		System.out.println("Work you do...");
	}
}
