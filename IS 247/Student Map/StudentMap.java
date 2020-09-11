//Priya Patel

//IS - 247 - 02 

// This program greates a map creates ID key for each ement (Strudent) 
// And displays this information when run 

import java.util.HashMap;

public class StudentMap {

	public static void main(String[] args) {
		
		// Initialization of student map
		HashMap <String, String> studentMap = new HashMap <String, String> ();
		
		// Adding student 1
		studentMap.put("Ben","BE29494");
      
      // Adding student 2
		studentMap.put("Can","CA29394");
		
		
      // Adding student 3
		studentMap.put("Kan","KA20894");
		
      
      // Adding student 4
		studentMap.put("Sam","SA30598");
       
      // Printing each keyset and corresponding value 
      for (String key : studentMap.keySet()) {
         System.out.println("Student Name: " + key + "; ID Number: " + studentMap.get(key));}
		
	}

}