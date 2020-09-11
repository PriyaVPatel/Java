//Priya Patel 
//IS 247 - 02 
//Recursion: finds the max value and uses recursion to 
//Return the largest value from a random array 

import java.util.*;

class recursion
{

   //Create recursion function 
   //Selects the value
   static int maximum(int[] arr,int len) {
      if (len == 1)
         return arr[0];
      return max(maximum(arr,len - 1),arr[len - 1]); }
   //Compares and finds the largest value
   private static int max(int x1,int x2) {
      return x1>x2 ? x1:x2;}	
   
   

  public static void main(String [] args) {
  
   //Declare and initialize array with 10 numbers
   int[] arr = new int[10];
    
   //Fill array iwth 10 random numbers from 1 - 50
   for (int i = 0; i < arr.length; i++) {
      arr[i] = (int)(Math.random()*50+1); } 
      
   // Display Random Array
   System.out.println("Array: " + Arrays.toString(arr));
   
   //Call recursion find maximum value function  
   int maxNum = maximum(arr,arr.length);
   System.out.println("The largerst number from the array is: " +maxNum);
   }
}
 