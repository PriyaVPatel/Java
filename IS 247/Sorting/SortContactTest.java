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

import java.util.*;

@SuppressWarnings("unchecked") //Object type

public class SortContactTest { 
   
   public static < E > void generateUNSortedArray( Contact[] inputArray ) {
   
      //Easily inputs unsorted data into each new array 
      inputArray[0] = new Contact ("Chulbul", "Pandey", "467-596-3486");
      inputArray[1] = new Contact ("Sanjay", "Singhania", "424-450-3856");
      inputArray[2] = new Contact ("Pooja", "Sharma", "768-498-4859");
      inputArray[3] = new Contact ("Anjali", "Sharma", "356-394-5783");
      inputArray[4] = new Contact ("Ram", "Persad", "787-874-3858");
      inputArray[5] = new Contact ("Devdas", "Mukherjee", "785-395-3857");
      inputArray[6] = new Contact ("Sanjana", "Bakshi", "456-349-5997");
      inputArray[7] = new Contact ("Lucky", "Sharma", "567-324-9774");
      inputArray[8] = new Contact ("Raghvan", "Datta", "234-854-7935");
      inputArray[9] = new Contact ("Rajjo", "Pandey", "456-945-3457"); }
    
public static void main( String args[] ) {

      System.out.println();
      System.out.println("-------------------------------------------------");
      System.out.println("SELECTION SORT");
      System.out.println("-------------------------------------------------");
    
      //Creates generic contact array and inputs unsorted data
      Contact[] one = new Contact[10];
      generateUNSortedArray(one);
      
      //print unsorted array
      System.out.println();
      System.out.println("UNSORTED: ");
      Sorting.printArray(one);
      System.out.println();
      
      //Calls selection sort method 
      Sorting.selectionSort(one);
      
      //print sorted array
      System.out.println();
      System.out.println("SORTED: ");
      Sorting.printArray(one);
      
      System.out.println();
      System.out.println("-------------------------------------------------");
      System.out.println();
      System.out.println("-------------------------------------------------");
      
      System.out.println();
      System.out.println("-------------------------------------------------");
      System.out.println("INSERTION SORT");
      System.out.println("-------------------------------------------------");
      
      //Creates generic contact array and inputs unsorted data
      Contact[] two = new Contact[10];
      generateUNSortedArray(two);
      
      //print unsorted array
      System.out.println();
      System.out.println("UNSORTED: ");
      Sorting.printArray(two);
      System.out.println();
      
      //Calls bubble sort methods
      Sorting.insertionSort(two);
      
      //print sorted array
      System.out.println();
      System.out.println("SORTED: ");
      Sorting.printArray(two);
      
      System.out.println();
      System.out.println("-------------------------------------------------");
      System.out.println();
      System.out.println("-------------------------------------------------");
      
      System.out.println();
      System.out.println("-------------------------------------------------");
      System.out.println("BUBBLE SORT");
      System.out.println("-------------------------------------------------");
      
      //Creates generic contact array and inputs unsorted data
      Contact[] three = new Contact[10];
      generateUNSortedArray(three);
      
      
      //print unsorted array
      System.out.println();
      System.out.println("UNSORTED: ");
      Sorting.printArray(three);
      System.out.println();
       
      //Calls insertion sort method
      Sorting.bubbleSort(three); 
      
      //print sorted array
      System.out.println();
      System.out.println("SORTED: ");
      Sorting.printArray(three);
      
      System.out.println();
      System.out.println("-------------------------------------------------");
      System.out.println();
      System.out.println("-------------------------------------------------");
      
      System.out.println();
      System.out.println("-------------------------------------------------");
      System.out.println("QUICK SORT");
      System.out.println("-------------------------------------------------");
      
      //Creates generic contact array and inputs unsorted data
      Contact[] four = new Contact[10];
      generateUNSortedArray(four);
      
      //print unsorted array
      System.out.println();
      System.out.println("UNSORTED: ");
      Sorting.printArray(four);
      System.out.println();
      
      //Calls quick sort method
      Sorting.quickSort(four); 
      
      //print sorted array
      System.out.println();
      System.out.println("SORTED: ");
      Sorting.printArray(four);
      
      System.out.println();
      System.out.println("-------------------------------------------------");
      System.out.println();
      System.out.println("-------------------------------------------------");
      
      System.out.println();
      System.out.println("-------------------------------------------------");
      System.out.println("MERGE SORT");
      System.out.println("-------------------------------------------------");
      
      //Creates generic contact array and inputs unsorted data
      Contact[] five = new Contact[10];
      generateUNSortedArray(five);
      
      //print unsorted array
      System.out.println();
      System.out.println("UNSORTED: ");
      Sorting.printArray(five);
      System.out.println();
      
      //Calls merge sort method
      Sorting.mergeSort(five);

      //print sorted array
      System.out.println();
      System.out.println("SORTED: ");
      Sorting.printArray(five);
      
      System.out.println();
      System.out.println("-------------------------------------------------");
      System.out.println();
      System.out.println("-------------------------------------------------");

   }
}
