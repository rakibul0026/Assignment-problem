/*1) Design a class named Student that has two private data – student ID and score. The
class should contain a parameterized constructor to initialize its data member and
one method to display the information. Now write a Java program that will use an
array of Student objects to represent information about 3 students. Your program
should take input from the keyboard and display the information of the 3 students.*/
package assignment3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] ob = new Student[3];
        

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter Student ID: ");
            int Id = sc.nextInt();

            System.out.print("Enter Score: ");
            int score = sc.nextInt();

            ob[i] = new Student(Id, score);
        }

        for (int i = 0; i < 3; i++) {
            ob[i].display();
        }

        
    }
}
//Main Class
package assignment3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] ob = new Student[3];
        

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter Student ID: ");
            int Id = sc.nextInt();

            System.out.print("Enter Score: ");
            int score = sc.nextInt();

            ob[i] = new Student(Id, score);
        }

        for (int i = 0; i < 3; i++) {
            ob[i].display();
        }

        
    }
}
