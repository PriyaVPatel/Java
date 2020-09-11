import java.io.*;
import java.lang.*;
import java.util.*;

import java.io.File; 
import java.io.FileWriter; 
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random; 


public class WriteToInput {
   // Implementation of Exception # 3
   // Use of a Throw statement - file not found
   public static void main(String[] args) throws FileNotFoundException {
      
      try {
         //Create text file for input
         FileWriter file = new FileWriter("input.txt");
         
         // Difficulty INCORRECT input
         file.write("A");
         file.write("\r\n");   // write new line
      
         // Difficulty CORRECT input
         file.write("3");
         file.write("\r\n");   // write new line

      
         //Character name
         file.write("priya");
         file.write("\r\n");   // write new line
      
         //Room 1
         file.write("1");
         file.write("\r\n");   // write new line
         //Room 2
         file.write("2");
         file.write("\r\n");   // write new line
         //Room 3
         file.write("3");
         file.write("\r\n");   // write new line
         //Room 4
         file.write("4");
         file.write("\r\n");   // write new line
      
         //Random Weapon
         Random random = new Random ();
         file.write(random.nextInt(2) + " ");
         file.write("\r\n");   // write new line
         file.write(random.nextInt(2) + " ");
         file.write("\r\n");   // write new line
         file.write(random.nextInt(2) + " ");
         file.write("\r\n");   // write new line
         file.write(random.nextInt(2) + " ");
         file.write("\r\n");   // write new line
         file.write(random.nextInt(2) + " ");
         file.write("\r\n");   // write new line
         file.write(random.nextInt(2) + " ");
         file.write("\r\n");   // write new line
         file.write(random.nextInt(2) + " ");
         file.write("\r\n");   // write new line
         file.write(random.nextInt(2) + " ");
         file.write("\r\n");   // write new line
         file.write(random.nextInt(2) + " ");
         file.write("\r\n");   // write new line
         file.write(random.nextInt(2) + " ");
         file.write("\r\n");   // write new line
         file.write(random.nextInt(2) + " ");
         file.write("\r\n");   // write new line
         file.write(random.nextInt(2) + " ");
         file.write("\r\n");   // write new line      
         file.write(random.nextInt(2) + " ");
         file.write("\r\n");   // write new line
         file.write(random.nextInt(2) + " ");
         file.write("\r\n");   // write new line
         file.write(random.nextInt(2) + " ");
         file.write("\r\n");   // write new line
         file.write(random.nextInt(2) + " ");
         file.write("\r\n");   // write new line
         file.write(random.nextInt(2) + " ");
         file.write("\r\n");   // write new line
         file.write(random.nextInt(2) + " ");
         file.write("\r\n");   // write new line
         file.write(random.nextInt(2) + " ");
         file.write("\r\n");   // write new line
         file.write(random.nextInt(2) + " ");
         file.write("\r\n");   // write new line
         file.write(random.nextInt(2) + " ");
         file.write("\r\n");   // write new line
         file.write(random.nextInt(2) + " ");
         file.write("\r\n");   // write new line
         file.write(random.nextInt(2) + " ");
         file.write("\r\n");   // write new line
         file.write(random.nextInt(2) + " ");
         file.write("\r\n");   // write new line
      
         System.out.println();
         //Confirmation message that file was correct and saved
         System.out.println("input.txt file has been successfully written."); 
         file.close(); //Close file 
         } 
         
      //Something went wrong and file was not saved properly 
      //Failure reading / writing propoerly      
      catch (IOException e) {
         System.out.println("An error occurred.");
          }
  }
}

