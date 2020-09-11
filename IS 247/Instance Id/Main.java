// Priya Patel 
//IS 247 - 02 
//Simple Generics Class Exercise 
//For instances of int, string, charcter, boolena, and double 

// We use < > to specify Parameter type
class Test<T>
{

 // An object of type T is declared
 T obj;
 Test(T obj) { this.obj = obj; } // constructor
 public T getObject() { return this.obj; }
 
}
// Driver class to test above
public class Main {
 public static void main (String[] args) {
//instance of Integer type
 Test <Integer> iObj = new Test<Integer>(22);
 System.out.println(iObj.getObject());

//instance of String type
 Test <String> sObj = new Test<String>("Print this string");
 System.out.println(sObj.getObject());
 
//instance of Double type
 Test <Double> dObj = new Test<Double>(247.47);
 System.out.println(dObj.getObject());
 
//instance of Character type
 Test <Character> cObj = new Test<Character>('P');
 System.out.println(cObj.getObject());
 
//instance of Boolean type
 Test <Boolean> bObj = new Test<Boolean>(false);
 System.out.println(bObj.getObject());
 
  }
}
