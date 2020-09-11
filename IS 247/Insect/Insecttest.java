/*
Priya Patel 
IS 247 - 02
Class Exercise: Polymorphism

shows three diffrent overided insect methods
with a method in bog, flying, and jumping

*/

public class Insecttest {
   public static void main (String [] args) {

   //Insect method from insect class
      { Insect bug = new Insect();
        bug.nickname();
      }
      
   //Overiding insect method w/ flying method
      { Insect flyingBug = new Flying();
        flyingBug.nickname(); 
      }
      
   //Overiding insect method w/ jumping method
      { Insect jumpingBug = new Jumping();
        jumpingBug.nickname();
      }
   }
}