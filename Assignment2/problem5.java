/*5) A class has an integer data member 'i' and a method named 'printNum' to print the
value of 'i'. Its subclass also has an integer data member 'j' and a method named
'printNum' to print the value of 'j'. Make an object of the subclass and use it to
assign a value to 'i' and to 'j'. Now call the method 'printNum' by this object.*/

package assignment2br;
public class A {
    int i;
    void printNum(){
        System.out.println("i:"+i);
    }
    
}
class B extends  A{
    int j;
    void printNum(){
        System.out.println("j:"+j);
    }
}
//Main class

package assignment2br;

public class test {
    public static void main(String[] args) {
        B ob= new B();
        ob.j=3;
        ob.i=10;
        ob.printNum();
    }
}

