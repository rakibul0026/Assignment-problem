

package classct;

public class Test 
{ 
 private int data = 5; 
 public int getData() 
 { 
 return this.data; 
 } 
 public int getData(int value) 
 { 
 return (data+1); 
 } 
 public int getData(int... value) 
 { 
 return (data+2); 
 } 
 public static void main(String[] args) 
 { 
 Test temp = new Test(); 
 System.out.println(temp.getData(7, 8, 12)); 
 } 
}

