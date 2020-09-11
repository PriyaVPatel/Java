//Priya Patel 
//IS 247 - 02
//Exceptions
//Catches exception and askes to reenter inout until true 

import java.util.*; 

public class Exceptions {
   public static void main (String [] args) {

Scanner input = new Scanner(System.in);
boolean correct = false; 

//While loop
while (!correct) {

   try{
      System.out.printf("Enter an integer: ");
      int integer = input.nextInt();
      correct = true; //if valid then go to finally and exit loop 
      }
      catch(InputMismatchException e){ // catches exception 
          System.out.println("Invalid input.");
          input.next();
      }
      finally {
          System.out.println("Bye now. ");
      }
}// end while loop 

 //Do not remove below 
   }
}