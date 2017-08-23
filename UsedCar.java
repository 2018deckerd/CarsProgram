/*
 * Used car Class that is derived from the car superclass
 */
public class UsedCar extends Car {

	private int mileage;
	
	public UsedCar(double cost, int mileage) {
		super(cost);
		this.mileage = mileage;
	}
		/*
		 * Tests whether the objects are equal to each other
		 */
		public boolean equals(UsedCar car2) {
			boolean isEqual;
			boolean condition1 = this.getPrice() == (car2.getPrice());
			boolean condition2 = (this.mileage == (mileage));
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
			System.out.println("price = $" + getPrice() + ", mileage = " + mileage);
			System.out.println();
		}
}