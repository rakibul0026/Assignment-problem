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
