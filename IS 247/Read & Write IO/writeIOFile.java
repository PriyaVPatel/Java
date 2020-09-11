/* 
Priya Patel 
IS247-02 

i/o file 
reads scanner and saves as text file
*/

import java.io.*;
import java.util.Scanner;

public class writeIOFile {
   public static void main(String[] args) throws FileNotFoundException {

   //Scanner input for name
   Scanner inputName = new Scanner(System.in);
   System.out.println("Enter your name: ");
   String name = inputName.nextLine();

   //Scanner input for age
   Scanner inputAge = new Scanner(System.in);
   System.out.println("Enter your age: ");
   int age = inputAge.nextInt();
   
   //Create file
   File file = new File("NameAndAge.txt");
   PrintWriter print = new PrintWriter(file);
   print.println(name);
   print.println(age);
   print.close();

    }

}
   
