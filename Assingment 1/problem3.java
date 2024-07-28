/*Write a Java program to display the numbers divisible by 4 or 7 from a 2D array of integers and find the sum
of those numbers as well*/
package assignment;
import java.util.*;
public class Arraydivisible{
       public static void main(String[] args) {
           Scanner ab=new Scanner(System.in);
           System.out.print("Enter the row & column : ");
           int r=ab.nextInt();
           int c=ab.nextInt();
           int i,j,sum=0;
           int [][] arr=new int[r][c];
           System.out.print("Enter the array elements :");
           for(i=0;i<r;i++)
             {
               for(j=0;j<c;j++)
                {
                 arr[i][j]=ab.nextInt();
                }
}
          System.out.print("The number which is divisibleby 4 or 7 are : ");
          for(i=0;i<r;i++)
          {
           for(j=0;j<c;j++)
           {
            if(arr[i][j]%4==0 || arr[i][j]%7==0)
            {
             sum=sum+arr[i][j];
             System.out.print(arr[i][j] +" ");
            }
        }
      }
        System.out.println("\nThe sum is : " +sum);
  }
}
