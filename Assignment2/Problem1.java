/* Create a class with a method that prints "This is parent class" and its subclass
with another method that prints "This is child class". Now, create an object for
each of the classes and call
1 - method of parent class by an object of the parent class
2 - method of child class by object of child class
3 - method of parent class by object of child class */

package assignment2;
public class parent {
    void display()
    {
        System.out.println("This is parent class");
    }
}
class  child extends parent{
    void print(){
        System.out.println("This is child class");
    }
}
//Main class

package assignment2;
public class Main {
    public static void main(String[] args) {
        parent ob=new parent();
        ob.display();
        //ob.print();
        
        child ob2= new  child();
        ob2.print();
        //ob2.display();
    }
    
}

