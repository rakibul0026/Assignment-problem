/*Suppose a class 'A' has a static method to print "Parent". Its subclass 'B' also
has a static method with the same name to print "Child". Now, call this method by the
objects of the two classes. Also, call this method by an object of the parent class
referring to the child class i.e. A obj = new B().*/
package assignment2.newpackage2;
public class A {
    static void display(){
        System.out.println("Parent");
    }
}
class B extends A{
    static void display2(){
        System.out.println("Child");
    }
}
//Main class


package assignment2.newpackage2;

public class main {
    public static void main(String[] args) {
        A.display();
        B.display2();
        
        A ob= new B();
        ob.display();
        
    }
 
}
