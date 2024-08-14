package assignment2.newpackage;
public class Member {
String  Name;
int Age;
String Phonenumber;
String Address;
String Salary;
void print(){
    System.out.println("name is :"+Name);
    System.out.println("Age is: "+Age);
    System.out.println("Phonenumber is: "+Phonenumber);
    System.out.println("Address is :"+Address);
     System.out.println("Salary is :"+Salary);
}
    void printSalary(){
    System.out.println("Salary is :"+Salary);

    
}
}
class Employee extends Member{
    String specialization ;
    void display1(){
        print();
        System.out.println("specialization is:"+specialization);
        printSalary ();     
    }  
}
class Manager extends Member{
    String department;
    void display2(){
           print();
        System.out.println("department is" +department);
         printSalary(); 
    }
}
