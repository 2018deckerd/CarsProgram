/*
 * New car Class that is derived from the car superclass
 */
public class NewCar extends Car {

	private String color;
	
	public NewCar(double cost, String color) {
		super(cost);
		this.color = color;
	}

	/*
	 * Tests whether the objects are equal to each other
	 */
	public boolean equals(NewCar car2) {
		boolean isEqual;
		boolean condition1 = this.getPrice() == (car2.getPrice());
		boolean condition2 = (this.color.equals(color));
		if (condition1 && condition2) {
			isEqual = true;
		} else {
			isEqual = false;
		}
		return isEqual;
}
	
	/*
	 * Display method for instance variable
	 */
	public void display() {
		System.out.print("price = $" + getPrice() + ", color = " + color);
		System.out.println();
	}
}
	
