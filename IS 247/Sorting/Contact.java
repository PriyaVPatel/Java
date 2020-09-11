//Priya Patel 
//IS - 247-02 
//Programming Assignment 5
// 
// Creates Contact array and called sorting.java's various sortings mthods 
// Contact class also has compareTo which also accounts for same last names 
// If same last name, then use frist name
// 
// Sorting.java is modified with a overloaded print array for the generic
// array to be easily called and printed. Print statements were added in
// Sorting.java to print each step of sorting 
//
// Prints intial and final array 

import java.lang.Comparable; 

public class Contact implements Comparable {
    
    //3 strings
    String firstName;
    String lastName;
    String phoneNumber; 
    
    //Overloaded for three string inputs 
    public Contact(String firstName, String lastName, String phoneNumber) { 
    
      this.firstName = firstName; 
      this.lastName = lastName; 
      this.phoneNumber = phoneNumber; }
      
    //Returns string statements 
    public String fName() {
      return firstName; }
    
    //Returns string statements 
    public String lName() {
      return lastName; }
     
    //Returns string statements  
    public String pNum() {
      return phoneNumber; }
    
    //Compares some object info to last name and uses first name is both match
    public int compareTo(Object info) {

      String compareName = ((Contact)info).lName();
      String compareFName = ((Contact)info).fName();
      
      int last = lName().compareTo( compareName ); 
      int first = fName().compareTo( compareFName );      
      
      //If the compare to is 0, then the strings are equal; so then use the first name 
      if (last == 0) {
         return first; }
      
      //IF the strings are not equal, then use the last name 
      else {
         return last; }
       }
    
    //Format string return
    public String toString() { 
      String one = firstName; 
      String two = lastName; 
      String three = phoneNumber;
      
      // Formats string to be evenly spaced so when printed in SortContactTest,
      // it is printed with decent formatting
      String ret = String.format( "%-11s" + "%-11s" + "%-11s", one, two, three);
      //Returns string of array
      return ret; }    
}

   