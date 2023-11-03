public class cars extends Vehicle{
	private String name;
	
	public cars(String name, int year, String make, String model) {
		super(year, make, model);
		this.name = name;
	}
	
	public String getInfo() {
		return "This vehicle is a car named " + name +". It was made in "+ year;
	}
	
	public static void main (String[] args) {
		Vehicle vrum = new cars("Lucy", 1989, "Lambo", "Q5"); 
		System.out.println(vrum.getInfo()); 
	}
	
}
//because the variable is initialized as vehicle 
//and not as a car, the methods in car need to be added into the Vehicle class to be used. If the variable 
//was initialized as a car, them the method could be used without having to add it to the Vehicle class.

//could do Honda extends cars (and then cars extends Vechles in the cars calss)
//

