/*
Priya Patel 
IS - 247 - 02 
Week 10 CE: Lists, Stacks, and Queus

The following code computes the avg. time required for
a custumer to checkout with on the number of cashiers 
avilable. 

The code uses a queue, becuase it uses FIFO, 
mimicing what wouldhappen at checkout. The main method removes 
each customer FIFO method while keeping track of the time 
required to check out. It also computes the average time and 
displays it alsong with the number of cashiers available for checkout. 
*/

import java.util.*;

public class TicketCounter { 
 
 private final static int PROCESS = 120;
 //Max # cashiers set to 10
 private final static int MAX_CASHIERS = 10; 
 //Max # customers set to 100
 private final static int NUM_CUSTOMERS = 100; 
 //Main Method
 public static void main(String[] args) { 
 
 Customer customer;
 
 Queue<Customer> customerQueue = new LinkedList<Customer>();
 
 //Create "line queus" for each cashier
 int[] cashierTime = new int[MAX_CASHIERS]; 
 
 //Initialize queue variables
 int totalTime, averageTime, departs, start;
  
    // run the simulation for various number of cashiers 
    for (int cashiers = 0; cashiers < MAX_CASHIERS; cashiers++){
    
      // set each cashiers time to zero initially
      for (int count = 0; count < cashiers; count++)
      cashierTime[count] = 0;
    
      // load customer queue
      for (int count = 1; count <= NUM_CUSTOMERS; count++)
      customerQueue.add(new Customer(count * 15));
      
      totalTime = 0;
    
      // process all customers in the queue
      //Until all customers are processed, 
      while (!(customerQueue.isEmpty())) {
         for (int count = 0; count <= cashiers; count++) {
            //keep checking out (removing customers) FIFO
            if (!(customerQueue.isEmpty())) {
               customer = customerQueue.remove();
               //Each customer and time their check out upon arivial
               if (customer.getArrivalTime() > cashierTime[count])
                  start = customer.getArrivalTime();
               else
                  start = cashierTime[count];
            
            //Calculates time for eahc customer
            departs = start + PROCESS;
            customer.setDepartureTime(departs);
            cashierTime[count] = departs;
            totalTime += customer.totalTime();}
         }
      }
    
      // output results for this simulation
    
      //Computes avg time for each check out
      averageTime = totalTime / NUM_CUSTOMERS; 
      //Prints number of cashiers avaliable
      System.out.println("Number of cashiers: " + (cashiers + 1));
      //Prints out average time for each checkout
      System.out.println("Average time: " + averageTime + "\n");  
    }
  } 
}