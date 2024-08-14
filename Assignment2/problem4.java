/*4) Create a class named 'Shape' with a method to print "This is a shape". Then, create
two other classes named 'Rectangle' and 'Circle', inheriting the Shape class, both
having a method to print "This is a rectangular shape" and "This is a circular
shape," respectively. Create a subclass 'Square' of 'Rectangle' having a method to
print "Square is a rectangle". Now call the method of the 'Shape' and 'Rectangle'
class by the object of the 'Square' class.*/
package assignment2.newpackage1;

public class Shape {
    void print(){
        System.out.println("This is a shape");
    }
}

class  Rectangle extends Shape {

void display1(){
    System.out.println("This is a rectangular shape");
}

}
class Square extends Rectangle 
{
void display3()
{
    System.out.println("Square is a rectangle"); 
}


}

class  Circle extends Shape {
void display2()
{
    System.out.println("This is a circular shape"); 
}


}
//Main class

package assignment2.newpackage1;

public class Main {
    public static void main(String[] args) {
        Square ob=new Square();
    ob.display3();
    ob.display1();
    }
    
}
