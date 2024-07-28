/*Write a Java program to check whether a given integer is palindrome or not.*/  
package assignment;
import java.util.*;
public class palindrome {
      public static void main(String[] args) {
      int num,temp,r,sum=0;
      System.out.println("Enter any number: ");
      Scanner sc=new Scanner(System.in);
      num=sc.nextInt();
      temp=num;
      while(temp!=0)
      {
         r=temp%10;
         sum=sum*10+r;
         temp=temp/10;
      }
      if(num==sum)
         System.out.println("Palindrome number ");
      else
        System.out.println("not palindrome ");
   }
}
