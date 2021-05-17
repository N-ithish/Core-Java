
public abstract class Animal {

	 	int age;
	 	char gender;
	 	String kind;
		
	 	
	 	public Animal(int age, char gender, String kind) {
			super();
			this.age = age;
			this.gender = gender;
			this.kind = kind;
			}
		
		public void animal() {
			System.out.println("Ablity to walk and eat");
		}
		
		public void sleep() {
			System.out.println("Will Sleep...");
		}
	 	
		public abstract void move();
	 	

	
}
