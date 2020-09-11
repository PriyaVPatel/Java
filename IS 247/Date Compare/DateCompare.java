/* 
Priya Patel 
IS 247 - 02 
Class Exercise: Using java classes

This creates the datecompare classes
it takes 3 dates and compares them, 
if they match, it prints a mathing statement
if they do not match, it prints a statement indicating it does not match
Comparison return
0 = dates are same 
-1 date is before
1 date is after
   
*/
import java.util.*; 
public class DateCompare {
   
  public static void main(String[] args) {
   
   //Ccreating birthdate
   Date birthDate = new GregorianCalendar(1998, Calendar.DECEMBER, 15).getTime();; // year, month, date
      
   //Today 
   Date todaysDate = new Date (); 
   
   //Creating future birthdate 
   Date futureBirthDate = new GregorianCalendar(2020, Calendar.DECEMBER, 15).getTime();;   
   
   //Compare Dates
   System.out.println ("My birth date is " + birthDate); 
   System.out.println ("Todays date is " + todaysDate); 
   System.out.println ("My future birth date is " +futureBirthDate); 
   
   System.out.println (); 
   
   //Comare birthdate to todays date 
   int compare = todaysDate.compareTo(birthDate);
   System.out.println("Today compared to Birth Date: " + compare);
      //Print proper statement based on return value
      if (compare == -1) 
         System.out.println ("Todays date is before."); 
      else if (compare == 1) 
         System.out.println ("Todays date is after."); 
       else if (compare == 0) 
         System.out.println("Date is todays date."); 
            
   System.out.println ();

   //Comare todays date to todays date 
   int compare2day = todaysDate.compareTo(todaysDate);
   System.out.println("Today compared to Todays Date: " + compare2day);
      //Print proper statement based on return value
      if (compare2day == -1) 
         System.out.println ("Todays date is before."); 
      else if (compare2day == 1) 
         System.out.println ("Todays date is after.");
      else if (compare2day == 0) 
         System.out.println("Date is todays date."); 
      
   System.out.println ();
   
   //Comare birthdate to todays date 
   int compare2 = todaysDate.compareTo(futureBirthDate);
   System.out.println("Today compared to Future Birth Date: " + compare2);
      //Print proper statement based on return value
      if (compare2 == -1) 
         System.out.println ("Todays date is before."); 
      else if (compare2 == 1) 
         System.out.println ("Todays date is after."); 
      else if (compare2 == 0) 
         System.out.println("Date is todays date."); 
      
   }
}
