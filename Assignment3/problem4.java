/*4) Implement an abstract class player and two subclasses named batsman and bowler.
Each player has a name, contact address, telephone number and status (either
batsman or bowler). The batsman class maintains the total run obtained by a
batsman and the number of one day matches he participated. Similarly, the bowler
class maintains the total wickets taken by a player and the total number of matches.
The parent class contains an abstract method to calculate the average of each
player. Implement the above classes in Java. Provide constructors to initialize the
private data. Override the toString() method in each class to display the class name.
Write a program to create an object of type batsman and bowler and calculate the
average run/ wickets obtained by a player. Your program should also call the
toString() method to display the class name*/

// batsman Class

package assignment4;

class batsman extends player {
    int totalrun;
    int totalmatches;

 batsman(String name, String contactaddress, String telephonenumber, String status, int totalrun, int totalmatches) {
        super(name, contactaddress, telephonenumber, status);
        this.totalrun = totalrun;
        this.totalmatches = totalmatches;
    }
  void average() {
        int av1 = totalrun / totalmatches;
        System.out.println("Total run is :" +totalrun);
        System.out.println("totalmatches is :"+totalmatches);
        System.out.println("average run  is:" +av1);
     
    }
    public String toString() {
        return "Batsman: " + name;
        
    }
}

//bowler class

package assignment4;

class bowler extends player {
    int  totalwickets;
    int totalmatches;

 bowler(String name, String contactaddress, String telephonenumber, String status, int totalwickets, int totalmatches) {
        super(name, contactaddress, telephonenumber, status);
        this.totalwickets = totalwickets;
        this.totalmatches = totalmatches;
    }

 void average() {
        float av2 = totalwickets / totalmatches;
        System.out.println("totalwickets is :"+totalwickets);
        System.out.println("totalmatches is :"+totalmatches);
        System.out.println("average wickets  is:" +av2);
     
    }
 public String toString() {
        return "Bowler: " + name;
        
    }
}

//Player class

package assignment4;

public abstract class player {
    String name;
    String contactaddress;
    String telephonenumber;
    String status;

    player(String name, String contactaddress, String telephonenumber, String status) {
        this.name = name;
        this.contactaddress = contactaddress;
        this.telephonenumber = telephonenumber;
        this.status = status;
    }

     abstract void average() ;
        
   void display() {
        System.out.println("name is :" + name);
        System.out.println("contactaddress is :" + contactaddress);
        System.out.println("telephonenumber is :" + telephonenumber);
        System.out.println("status is :" + status);
       
    }
}

//Main class

package assignment4;

public class Main {

	public static void main(String[] args) {

bowler ob = new bowler("masrafee" , "Narail " ,"019*****","bowler",250,150);
System.out.println("The class name is : "+ob.toString());
ob.display();
ob.average();


batsman ob1 = new batsman("tamim" , "chattogram " ,"017*****","batsman",10000,200);
System.out.println("The class name is : "+ob1.toString());
ob1.display();
ob1.average();
ob1.toString();

	}

}



