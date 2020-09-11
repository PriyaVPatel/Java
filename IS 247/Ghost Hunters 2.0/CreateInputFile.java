import java.io.File; 
import java.io.IOException; 

public class CreateInputFile {
  public static void main(String[] args) {
    
    try {
    
      File text = new File("input.txt");
      
      if (text.createNewFile()) {
        System.out.println();
        System.out.println("The text was created & named: " + text.getName());
        System.out.println();} 
      
      else {
        System.out.println();
        System.out.println("The text file already exists."); 
        System.out.println();} } 
    
    catch (IOException e) {
         System.out.println();
         System.out.println("An error occurred.");
         e.printStackTrace(); }
  }
}