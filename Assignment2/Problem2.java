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
//Main class

package assignment2.newpackage;

public class Main {
    public static void main(String[] args) {
        Employee ob = new Employee();
          ob.Name="rakibul";
          ob.Age=23;
          ob.Phonenumber="019******";
          ob.Address="cumilla";
          ob.Salary="25000";
          ob.specialization="web development\n\n";
          ob.display1();
           
          Manager ob1= new Manager();
          ob1.Name="borsha ";
          ob1.Age=21;
          ob1.Phonenumber="019******";
          ob1.Address="dhaka";
          ob1.Salary="25000";
          ob1.department="CSE";
          ob1.print();
               
    }
    
}

