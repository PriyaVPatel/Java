/* 
Priya Patel 
IS247-02 

i/o file 
reads scanner and saves as text file
*/

import java.io.*;
import java.util.Scanner;

public class readIOFile {
   public static void main(String[] args) throws FileNotFoundException {
   
   File file = new File("NameAndAge.txt");
   
   //print file
   Scanner printFile = new Scanner(file);
   String name = printFile.nextLine();
   int age = printFile.nextInt(); 
   
   System.out.println("Your name in file is "+ name + ".");
   System.out.println("Your age in file is "+ age + ".");
   printFile.close();
   
   }
}