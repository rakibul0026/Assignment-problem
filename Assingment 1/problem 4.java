/*Write a Java program to print the area and perimeter of a triangle having sides of 3,4 and 5 units by creating
a class Triangle without any perimeter in its constructor.*/
package assignment;
public class Triangle {
double l,w,h;

 Triangle()
 {
  l=5;
  w=4;
  h=3;
 }
double area()
 {
 double a=0.5*w*h;
 return a;
 }
double perimeter()
 {
  double b=l+w+h;
  return b;
 }
 public static void main(String[] args)
  {
   Triangle ob1=new Triangle();
   double p=ob1.area();
   Triangle ob2=new Triangle();
   double n= ob2.perimeter();
   System.out.println("Area is : "+p);
   System.out.println("Perimeter is : " +n);
  }
}
