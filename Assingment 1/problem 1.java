
//Write a Java program to print out all Armstrong numbers between 1 and 10000.

package assignment;
public class armstrong {
public static void main(String[] args) {
int i,r,m,n,s=0,c=0;
System.out.println("Armstrong numbers between 1
and 10000 :");
for(i=1;i<=1000;i++)
{
n=i;
while(n>0)
{
n=n/10;
c++;
}
m=i;
while(m>0)
{
r=m%10;
s= (int)(s+(Math.pow(r, c)));
}
if(s==i)
{
System.out.println(s+ " ");
}
s=0;
c=0;
}
System.out.println(" \n \n");

}
}
