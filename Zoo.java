
public class Zoo {

	public static void main(String[] args) {
		
	//	Animal tiger = new Animal(12,'M',"Tiger");
	//  Brids kf = new Birds();
	//  Fish aquaman = new Fish();
		Birds kf = new Birds(2,'M',"KingFisher");
		Fish aquaman = new Fish(26,'M',"Aquaman");
		
		Animal k = new Sparrow(1,'M',"kuruvi");
		
		Chicken nk = new Chicken(2,'F',"NattuKozhi");
		Sparrow ck = new Sparrow(1,'F',"ChituKuruvi");
		
		
	//	kf.fly();
		aquaman.swim();
	//	tiger.animal(); 
		
	//	nk.fly();
		
		kf.sleep();
		aquaman.sleep();
		
		ck.fly();
		
		//k.move();
		moveAnimal(k);
		
	}
	
	public static void moveAnimal(Animal animal) {
		animal.move();
	}

}
