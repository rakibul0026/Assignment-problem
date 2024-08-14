/*2) Write a Java program to create an abstract class Animal with abstract methods
eat() and sleep(). Create subclasses Lion, Tiger, and Deer that extend the Animal
class and implement the eat() and sleep() methods differently based on their
specific behavior.*/
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
//Main class
package assignment3;

public class Test {

	public static void main(String[] args) {
		 Animal ob=new  Lion();
		 ob.eat();
		 ob.sleep();
		 
		 Animal ob1=new  Tiger();
		 ob1.eat();
		 ob1.sleep();
		 
		 Animal ob2=new Deer();
		 ob2.eat();
		 ob2.sleep();
	}

}


