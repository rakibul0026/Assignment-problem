package assignment3;

abstract class Animal {
	abstract void eat();
	abstract void sleep();
	
}
class Lion extends Animal 
{
	void eat() {
		System.out.println(" Lion eats meat");
	}
		void sleep() {
			System.out.println("Lion sleeps in the jungle"+"\n");
      }
}
class Tiger extends Animal 
{
	void eat() {
		System.out.println("Tiger eats meat");
	}
		void sleep() {
			System.out.println("Tiger sleeps in the jungle"+"\n");
      }
	
}
class Deer extends Animal 
{
	void eat() {
		System.out.println("Deer eats meat");
	}
		void sleep() {
			System.out.println("Deer sleeps in the deep jungle"+"\n");
      }
	
	
}

