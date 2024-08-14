
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
