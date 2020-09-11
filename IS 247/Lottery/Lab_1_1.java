/*
Priya Patel 
IS 247 - 02
Programming Assignment #1 / Lab #1

Generates a lottery ticket with a max of 4 plays 
Option of:
     - Range from 0-99 or 0-10
     - Numbers in each pay; Between 3 - 5
     - Can exit before 4 plays are complete

Program uses random number generator
Numbers are saved into a 2D array
After 4 plays, a lottery tickey is displayed

*/

import java.util.*;

public class Lab_1_1 {
   public static void main(String[] args) {

System.out.print("Welcome to Lucky Lotto! ");
System.out.print("This is a lottery numberber generator. ");
System.out.println();


// 4x5 array to store values
int set = 1; // Represents rows
int values[][] = new int[4][5]; 

// 1x4 array to sture user input for printing purpose
int userTrack = 0; 
int userNum[] = new int [4];

//while the colber of "plays" is less than or equal to 4
while (set <= 4) {


   // RANGE /////////////////////////////////////////////////////////////
   /////////////////////////////////////////////////////////////////////
      System.out.println("Enter your range: ");
      System.out.println("1 for 0 - 99 ");
      System.out.println("2 for 0 - 10 ");
      Scanner ranges = new Scanner(System.in);
      int range = ranges.nextInt();
      
         //Check for valid entry. Breaks out of loop if correct entry
         while (true) {
            if (range < 1 || range > 2) {
               System.out.println("Incorrect entry. Enter your range: ");
               System.out.println("1 for 0 - 99 ");
               System.out.println("2 for 0 - 10 ");
               range = ranges.nextInt();
               continue; } 
            break; } 

       //changes 1 / 2 to correct range 100 / 11 respectively
       if (range == 1) {
         range = 99; }
       else { 
         range = 10; } 
      
       //This is performed for the math.random()*n function, where n is exclusive
       range = range + 1;
   /////////////////////////////////////////////////////////////////////
   /////////////////////////////////////////////////////////////////////


   // NUMBER ///////////////////////////////////////////////////////////
   /////////////////////////////////////////////////////////////////////
      System.out.println("Enter how many numbers do you need in your row (3 - 5): ");
      Scanner nums = new Scanner(System.in);
      int printNum = nums.nextInt();
      
         //Check for valid entry. Breaks out of loop if correct entry
         while (true) {
            if (printNum < 3 || printNum > 5) {
               System.out.println("Incorrect entry. Enter how many numbers you need in your row (3 - 5): ");
               printNum = nums.nextInt();
               continue; } 
            break; } 
      
      //Stores number in 1D array for printing purposes
      userNum [userTrack] = printNum;

   /////////////////////////////////////////////////////////////////////
   /////////////////////////////////////////////////////////////////////
  
  
   // ROW SO FAR ////////////////////////////////////////////////////
   /////////////////////////////////////////////////////////////////////
 
   //Print rows generated so far and assigns values
   System.out.println();
   System.out.println("Current Rows Generated: ");
   System.out.println();
      for (int j = 0; j < (userNum[userTrack]); j++) {
         values[userTrack][j] = (int)(Math.random()* range);
            if (values[userTrack][j] < 10)
               System.out.print("0" + values[userTrack][j] + " ");
            else 
               System.out.print(values[userTrack][j] + " "); }
   System.out.println(); 

   /////////////////////////////////////////////////////////////////////
   /////////////////////////////////////////////////////////////////////


   // GENERATE ANOTHER TICKET? /////////////////////////////////////////
   /////////////////////////////////////////////////////////////////////
   System.out.println(); 
   System.out.println("You have " + (set) + " set generated. ");
   System.out.println(); 
   System.out.println("Would you like to add another set? (Max 4)");
   System.out.println("1 = Yes, 1 more. ");
   System.out.println("2 = No, continue. ");
   Scanner repeats = new Scanner (System.in); 
   int repeat = repeats.nextInt();
   
      //Check for valid entry. Breaks out of loop if correct entry
      while (true) {
         if (repeat < 1 || repeat > 2) {
            System.out.println("Would you like to add another set? (Max 4)");
            repeat = repeats.nextInt();
            continue; } 
         break; }
   
   //Ensure that loop is not repeated more than 4 times & only if user wants to repeate
   if ((set <= 3) && (repeat == 1)) {
      set++; 
      userTrack++; 
      continue;}
   //IF user reaches 4 sets or terminates; print correct statements and print final ticket
   else {
      //print loop if max set was reached
      if (set == 4) {
         System.out.println();
         System.out.println("You have generated the maximum set of numbers. ");
         System.out.println();
         System.out.println("This is your final lottery ticket: ");
         System.out.println();
            //print ticket
            for (int i = 0; i < 4; i++) {
               for (int j = 0; j < (userNum[i]); j++) {
                  if (values[i][j] < 10)
                     System.out.print("0" + values[i][j] + " ");
                  else 
                     System.out.print(values[i][j] + " "); }
            System.out.println();}
         System.out.println();}
      else {
         //print loop if generator was terminated
         System.out.println();
         System.out.println("You have terminated the lottery number generator. ");
         System.out.println();
         System.out.println("This is your final lottery ticket: ");
         System.out.println();
            //print ticket
            for (int track = 0; track <= userTrack; track++) {      
               for (int j = 0; j < (userNum[track]); j++) {
                  if (values[track][j] < 10)
                     System.out.print("0" + values[track][j] + " ");
                  else 
                     System.out.print(values[track][j] + " "); }
            System.out.println(); }
 
      }
   break;
      }
   /////////////////////////////////////////////////////////////////////
   /////////////////////////////////////////////////////////////////////

} // While loop do not remove 
   
//Do not remove below   
   }
}   

