/*3) Write a Java program to create an abstract class Vehicle with abstract methods
startEngine() and stopEngine(). Create subclasses Car and Motorcycle that extend
the Vehicle class and implement the respective methods to start and stop the
engines for each vehicle type.*/
package assignment3;

public  abstract class Vehicle {
	public  abstract void startEngine();
	public  abstract void stopEngine();
	

}
class Car extends Vehicle {
	public void startEngine()
	{
		System.out.println(" Engine start ");
	}
	public void stopEngine()
	{
		System.out.println(" Engine stop");
	}
	
}
class Motorcycle extends Vehicle  {
	
	public void startEngine()
	{
		System.out.println(" Engine start ");
	}
	public void stopEngine()
	{
		System.out.println(" Engine stop");
	}
}
//Main class
package assignment3;

public class Main {

	public static void main(String[] args) {
		Vehicle ob=new Car();
		ob.startEngine();
		ob.stopEngine();
		
		Vehicle ob1=new Motorcycle();
		ob1.startEngine();
		ob1.stopEngine();
		
		
	}

}

