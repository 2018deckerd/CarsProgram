/*
 * This is an ABSTRACT class because there are no instances (objects) of this class
 * that are being created. This is the superclass.
 */
public abstract class Car {
	
		private double price;
		/*
		 * constructor for the Car class
		 * 
		 * Takes in a cost as a parameter
		 */
		public Car(double cost) {
			price = cost * 2;
		}
		
		/*
		 * Simple getter method
		 */
		public double getPrice() {
			return price;
		}
		
		
	
}