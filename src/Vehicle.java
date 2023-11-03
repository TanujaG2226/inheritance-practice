public class Vehicle {
	protected int year;
	protected String make;
	protected String model;
	protected int miles;
	
	public Vehicle(int year, String make, String model) {
		this.year = year;
		this.make = make;
		this.model = model;
		this.miles = 0;
	}
	
	public void drive(int milesDriven) {
		this.miles += milesDriven;
	}

	public int getYear() {
		return year;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getMiles() {
		return miles;
	}
	public String getInfo() {
		return "This vehicle is a car named "  +". It was made in "+ year;
	}
}


