/* 
Priya Patel 
IS 247 - 02 
Class Exercise: Creating a Class Q1 


This creates two classes, TestLotto and LottoNum
Within LottoNum is two constuctors, v & v1
The v constuctor takes in three inputs
   This will use lottonum with the three inputs and use the inputs initilized
The v1 constructor does not have any inputs 
   This will overload the constuctor and cause it to use the lottonum default, 
   
*/

class LottoNum {

 int t; 
 int t1; 
 int t2;
 
 //Default 
 LottoNum () { 
   
   this.t = 0; 
   this.t1 = 0;
   this. t2 = 0; }

 
 LottoNum (int t, int t1, int t2) { 
 
   this.t = t; 
   this.t1 = t1;
   this.t2 = t2; } 

}

public class TestLotto {
   
  public static void main(String[] args) {
   
   //Default
   LottoNum v1 = new LottoNum(); {
      System.out.println ("The default Lotto ticket is as follows: ");
      System.out.println ("| " +  v1.t + " " + v1.t1 + " " + v1.t2 + " |"); }   
  
   LottoNum v = new LottoNum(4, 5, 6); {
      System.out.println ("The overloaded constructor is as follows: ");
      System.out.println ("| "+ v.t + " " + v.t1 + " " + v.t2 + " |"); }

   }
}
