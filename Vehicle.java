
public class Vehicle {
	
	String make;
	String model;
	int price;
	boolean fdrive;
	
	
	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", price=" + price + ", fdrive=" + fdrive + "]";
	}
	public Vehicle(String make, String model, int price, boolean fdrive) {
		super();
		this.make = make;
		this.model = model;
		this.price = price;
		this.fdrive = fdrive;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isFdrive() {
		return fdrive;
	}
	public void setFdrive(boolean fdrive) {
		this.fdrive = fdrive;
	}

}
