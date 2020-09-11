//Priya Patel 
//IS 247 - 02
//Programming Assignment # 4

//This modifies code provided by the instrctor to 
//be able to print three array types (int, char, double) 
// with a valid user input with exception handeling 


import java.util.*; 


// Using generic methods to print array of different types.
public class GenericMethodTest 
{
  // generic method printArray
  public static < E > void printArray( E[] inputArray )
  {
   // display array elements
   for ( E element : inputArray )
     System.out.printf( "%s ",element );

   System.out.println();
  } // end method printArray


////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////

   // 1st overload of the generic method of PrintArray using high user inout to print arrays
   // checks for valid range and throws proper exception
   // Prints the array with the range limit
   
   public static < E > int printArray(E[] inputArr, int start, int high) throws InvalidSubscriptException {
		
      // Ckecking for proper range 
      if (high >= inputArr.length) { 
         throw new InvalidSubscriptException(); }
      
      else if (high < 0) { 
         throw new InvalidSubscriptException(); }

		// Prints array with the proper range limits
		for( int i = start; i <= high; i++)
			System.out.print( inputArr[i] + " " );
		
      System.out.println();
      
      return high; 
      }
  
	// 2nd second overloaded of the generic method of PrintArray 
   // non generic version of the method which prints animals in a zoo 
   // Printing accounts for a neat tabular format
   
	public static void printArray(String indexs[]) {
   
		System.out.println("The following names are in the array: ");
		System.out.println();
      
		int place = 0;
      
		while( place < indexs.length ) {
			int numVal = 0;
			
         while( (place < indexs.length) && (numVal < 4) ) {
				
            // Even spacing in between each row of 4 max
				System.out.printf( "%-7s ", indexs[place] );
				
            place++;
				numVal++; }
            
			System.out.println();
         
		}
	}

////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////

  public static void main( String args[] ) {
   // create arrays of Integer, Double and Character
   Integer[] integerArray = { 1, 2, 3, 4, 5, 6 , 7, 8, 9, 10};
   Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 , 8.8, 9.9, 10.1};
   Character[] characterArray = { 'I', 'S', '2', '4', '7' ,' ' , 'i', 's', ' ' , 'f', 'u', 'n'};

   System.out.println( "Array integers:" );
   printArray( integerArray ); // pass an Integer array 
   System.out.println( "\nArray doubles:" );
   printArray( doubleArray ); // pass a Double array
   System.out.println( "\nArray characters:" );
   printArray( characterArray ); // pass a Character array
 

////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////
 		
      // Range
      
      // Will be used as the initial index (always 0)
		int start = 0;
      // Will be used for loops until valid bounds are found
      int count = 0; 
      // Will be used as user inout for array 
		int high;
      
      ///////////// GENERIC Interger Array /////////////
      System.out.println();
      System.out.println("-------------------------------------------------");
      System.out.println("PRINT ARRAYS");
      System.out.println("-------------------------------------------------");
      
      Scanner input1 = new Scanner(System.in);
         
         // Loop until a array is printed without throwing an exception
         while (count == 0) {
            System.out.println();
            System.out.println("Enter a value for high: ");
            System.out.println();
            high = input1.nextInt();
            high = high - 1; 
            System.out.println();
                  // Print array, custom excetion
                  try {
                     System.out.println("Array Integers: ");
			            printArray(integerArray, start, high);
                     System.out.println();
                     System.out.println("Array Doubles: ");
                     printArray(doubleArray, start, high);
                     System.out.println();
                     System.out.println("Array Characters: ");
                     printArray(characterArray, start, high); 
                     // Break out of loop after sucessful printing of array 
                     break;}
		            catch(InvalidSubscriptException e) {
			            System.out.println(e.getMessage()); }

            }
		System.out.println();
      System.out.println("-------------------------------------------------");
      System.out.println();
      System.out.println("-------------------------------------------------");
		
      
      ///////////// NON - Generic Array /////////////
      
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println("-------------------------------------------------");
      System.out.println("ANIMAL ARRAY");
      System.out.println("-------------------------------------------------");
		System.out.println();
      
		// Animals string array
		String animals[] = {"Elephant","Panda","Giraffe","Bear",
								"Penguin", "Ostrich","Tiger","Lion"};
		
      // Print array overload - non generic version
		printArray(animals);
      
      System.out.println();
      System.out.println("-------------------------------------------------");
      System.out.println();
      System.out.println("-------------------------------------------------");
		
 
////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////
 
  } // end main
} // end class GenericMethodTest