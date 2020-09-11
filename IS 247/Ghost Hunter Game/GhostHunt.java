/* 
Priya Patel 
IS 247 - 02 
Programming Assignment #2 / Lab #2

Please disregard all of the spelling errors. Im not the best at it. 

This code is a game where you are batteling three regular ghosts and a deamon or boss ghost 
in order to move in with your significant other. 

The main requirement is to have a super ghost class:
   - default constructor sets valuses to 0 
   - has all common attributes between regular and boss ghost 
and have two child classes of the parent class
   - regular ghost
      - inflicts damage 
      - returns health if defeated
   - boss ghost 
      - inflicts even more damage
      - has weapons option 

depending on the difficulty level chosen, the cooresponding damage is inflected
   - easy has least damage
   - medium is a little more damage
   - hard inflicts the most damage

*/

import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////   
//PLAYER CLASS ///////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////

//Class holding data of player
class Character { 
   
   String name; 
   int health; 
   int damage; 
   
   //Default Constructor 
   Character () { 
      this.health = 0; }
   
   //Overloaded Constructor 
   Character (String name, int health, int damage) { 
      this.name = name; 
      this.health = health;
      this.damage = damage; } 
   
   //Damage health 
   void damageHealth() { 
      health -= damage; }
    
   //Get health  
   int getHealth() {
      return health; }
         
   //Prints the stats of the player
   void printStat() {
      System.out.println();
      System.out.println ();
      System.out.println("-------------------------------------------");
      System.out.println(this.name + "'s Stat: " +this.health);
      System.out.println("-------------------------------------------");
      System.out.println(); }
}

//////////////////////////////////////////////////////////////////////////////////////   
//GHOST PARENT / SUPER CLASS /////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////

class Ghost { 

String ghostName; 
int ghostHealth; 
int damage; 

Ghost() { 
   this.ghostHealth = 0; 
   this.damage = 0; }
   
   //Prints the stats of the ghost
   void printStat() {
      System.out.println ();
      System.out.println("-------------------------------------------");
      System.out.println(this.ghostName + "'s Stat: " +this.ghostHealth);
      System.out.println("-------------------------------------------");
      System.out.println(); }
       
   //Damage health 
   void damageHealth() {
      ghostHealth -= damage; }     
   
   //Get health   
   int getGhostHealth() {
      return ghostHealth; }
   
}

//////////////////////////////////////////////////////////////////////////////////////   
//REGULAR GHOST CHILD / SUB CLASS ////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////

class RegularGhost extends Ghost {
   
   // 3 paramaters
   RegularGhost (String ghostName, int ghostHealth, int damage) { 
      this.ghostName = ghostName; 
      this.ghostHealth = ghostHealth;
      this.damage = damage; }  
      
   //Return health
   int returnHealth(Character player, int health) {
      player.health += 10; 
      return health; }
      
  //Kill ghost health 
   void deadHealth() {
      ghostHealth = 0; }  

   //Battle code with 20% chance of escaping 
   void battle (Character player, RegularGhost ghost, int damage) {
      Random r = new Random();
      int rand = r.nextInt(100);
      Random win = new Random(); 
      int randomWin = r.nextInt(2); 
      
         if ((rand <= 19) && (randomWin == 1)) {
            System.out.println ("Ghost has escaped & attacked you.");
            System.out.println ("You have taken " + damage + " damage.");
               player.damageHealth();
               player.printStat();
            System.out.println ();  }
         else {
            System.out.println ("You have defeated the ghost."); 
               ghost.deadHealth(); 
               player.printStat();
            System.out.println(); } }  
} 

//////////////////////////////////////////////////////////////////////////////////////   
//BOSS GHOST CHILD / SUB CLASS ///////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////

class BossGhost extends Ghost {

   // Overloaded constructor
   BossGhost (String ghostName, int ghostHealth, int damage) { 
      this.ghostName = ghostName; 
      this.ghostHealth = ghostHealth;
      this.damage = damage; }  

   //Battle code
   void battle (Character player, BossGhost bossGhost, int damage) {
      //- Random result whether it works or not and whether ghost inflicts damage on them or not      
      Random r = new Random();
      int rand = r.nextInt(100);
      
         if (rand <= 19) {
            System.out.println ("The demon has attacked you with his acid breath.");
            System.out.println ("You have taken " + (damage) + " damage.");
               player.damageHealth();
               player.printStat();
               bossGhost.printStat(); 
            System.out.println ();  }
         else {
            System.out.println ("You have weakned the demon"); 
               bossGhost.damageHealth();
               player.printStat(); 
               bossGhost.printStat(); 
            System.out.println(); } }
    
     
}

//////////////////////////////////////////////////////////////////////////////////////   
//GHOSTHUNT MAIN CLASS ///////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////

public class GhostHunt {
   public static void main(String[] args) {
   
   int ghostEncounter = 0; 

   //Introduce the game to the user 
   System.out.println("Welcome to Ghost hunting!"); 

   //Ask the user for a setting level (easy, medium, hard)
   System.out.println();
   System.out.println("How good at ghost hunting are you?: ");
   System.out.println("1 = New ");
   System.out.println("2 = Okay ");
   System.out.println("3 = Very Good ");
   
   //Scanner for difficulty level
   Scanner diff = new Scanner (System.in); 
   int difficult = diff.nextInt();
      
      //Check scanner input 
      while (true) {
         if (!((difficult == 3) || (difficult == 2) || (difficult == 1))) {
            System.out.println("Invalid entry.");
            System.out.println("Enter valid level of difficulty.");
            difficult = diff.nextInt();
            continue; } 
         break; }
   
   System.out.println();
   
   //Sets damage based on the user input difficulty
   int damage = 0; 
   if (difficult == 1)
      damage = 15;
   else if (difficult == 2)
      damage = 20;
   else if (difficult == 3 )
      damage = 25; 

   //Ask the user for their character name
   System.out.println();
   System.out.println("Enter your character's name: ");
   System.out.println("Characters only. ");
   
   //Scanner for name
   Scanner charName = new Scanner (System.in); 
   String name = charName.nextLine();
   
      //Check input
      while (true) {
         for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);
            if (!(letter >= 'A' && letter <= 'Z') && !(letter >= 'a' && letter <='z')) {
               System.out.println("Invalid entry.");
               System.out.println("Enter valid name.");
               name = charName.nextLine();
               continue; } }
         break; }
         
   //Creates new character
   int health = 100; 
   Character player = new Character(name, health, damage); 
   System.out.println();

   //Introduce the setting
   System.out.println( name + ", you grew up hearing about the creepy old mansion on Ghoul Street.");
   System.out.println("You hire a ghost hunting service which clears ghosts from homes before tenants move in. ");
   System.out.println("Since you conviently are marrying your childhood sweet heart and are looking for a place to live, you hire them. ");
   System.out.println("You also want to see a ghost, so the service providers make you sign a liability release before you enter.");
   System.out.println("You've just entered the haunted mansion..."); 
   System.out.println("When you enter, you walk into a long and narrow hallway.");

//For non repeat purposes
int arr [] = {1,1,1,1};

//////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////

while (ghostEncounter < 4) { 
    
   //Ask for room 
   System.out.println();
   System.out.println("Which room would you like to enter: ");
   System.out.println("1 = Bedroom ");
   System.out.println("2 = Study ");
   System.out.println("3 = Day Room ");
   System.out.println("4 = Living Room "); 
   Scanner which = new Scanner (System.in);  
   int room = which.nextInt();
   
  //6) Describe the room 
   if (arr[room - 1] == 0) {
      System.out.println();
      System.out.println("This room has already been cleared."); 
      continue;}
  
   else if (room == 1) {
      System.out.println();
      System.out.println("While walking in, you stop as you come to a room on your left." );
      System.out.println("As you walk in, all you hear is 'errr' 'err' 'errr' 'err'..." );
      System.out.println("Immediately you see a creepy doll in a creaking rocking chair." );
      System.out.println("You freeze. " );
      System.out.println("The possessed doll's head makes a full 360\u00B0." );
      System.out.println("The doll becomes violent, flying objects are being raised and tossed." ); }
   
   else if ( room == 2 ) {
      System.out.println();
      System.out.println("You come to a square room, a study. " );
      System.out.println("You see a large oak wood desk, disarrayed papers becuase of soft winds from a broken window." );
      System.out.println("You suddenly get shiveres when the gust of wind intensified. " );
      System.out.println("A warm breath behind your neck makes you stop.  " );
      System.out.println("You slowly turn around." );
      System.out.println("The study room ghost has scissors, staplers, and other objects all around him." ); }
     
   
   else if (room == 3 ) {
      System.out.println();
      System.out.println("You walk into the day room on the main floor." );
      System.out.println("As you walk in, the lights above you start to flicker. " );
      System.out.println("'Beware mortal! Do not step any further' says a loud bellowing voice. " );
      System.out.println("You perseveer and take a baby step. " );
      System.out.println("A ghostly green haze appears, you make out a very angry looking old man. " );
      System.out.println("The ghost suddenly charges at you..." ); }
   
   else if (room == 4 ) {
      System.out.println();
      System.out.println("To exit by the back patio, you have to walk through a huge living room." );
      System.out.println("As you walk into the living room, all the lights turn off. " );
      System.out.println("The room becomes incredibly cold." );
      System.out.println("You run towards the the only light source but a force suddenly fols you back." );
      System.out.println("You have come face to face with foul breath and red eyes." );
      System.out.println("..." ); }

//////////////////////////////////////////////////////////////////////////////////////   
//REGULAR GHOST ENCOUNTER ////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////


      //Create regular ghost
      String ghostName = "Ghost";
      int ghostHealth = 100;
      RegularGhost ghost = new RegularGhost(ghostName, ghostHealth, damage);

   //Regular ghost
   //- Check for ghost dead or character dead
   //- Repeat  steps until either the user runs away, or the ghost or character loses      
   while (player.getHealth() > 0 && ghost.getGhostHealth() > 0 && room != 4) {

      //Scanner for entering room 
      System.out.println();
      System.out.println("Do you want to fight? ");
      //- Ask user if they want to continue battle or run away
      System.out.println("1 = Battle ");
      System.out.println("2 = Run away "); 
      Scanner fight = new Scanner (System.in); 
      int battle = fight.nextInt();
      System.out.println();
      
      //Checkk input 
      while (true) {
         if (battle < 1 || battle > 2) {
            System.out.println("Invalid entry. ");
            System.out.println("Do you want to enter the room? ");
            System.out.println("1 = Enter ");
            System.out.println("2 = Move on "); 
            battle = fight.nextInt();
            continue; } 
         break; }
    
    //7) The character encounters a regular ghost: Describe the ghost, tell user the battle has started
    //If battle insert battle code 
    if (battle == 1) { 
      System.out.println();
      ghost.battle(player, ghost, damage);
      continue; 
      }
   //If run away print statements of running away and then ++ 
   //- If the user chooses to run away then continue  
   else {
      System.out.println();
      System.out.println("You have ran away from the ghost. You move further into the house. ");
      System.out.println();
      break; }  
   
   }

//////////////////////////////////////////////////////////////////////////////////////   
//BOSS GHOST ENCOUNTER ///////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////

   //Create boss ghost
   String bossName = "Deamon";
   int bossHealth = 100;
   BossGhost bossGhost = new BossGhost(bossName, bossHealth, damage);

   //Boss Ghost / Deomon
   while (player.getHealth() > 0 && bossGhost.getGhostHealth() > 0 && room == 4) {


   //Scanner for entering room 
   System.out.println();
   System.out.println("Do you want to fight? ");
   //- Ask user if they want to continue battle or run away
   System.out.println("1 = Battle ");
   System.out.println("2 = Run away "); 
   Scanner fight = new Scanner (System.in); 
   int battle = fight.nextInt();
      
      //Check scanner input 
      while (true) {
         if (battle < 1 || battle > 2) {
            System.out.println("Invalid entry. ");
            System.out.println("Do you want to enter the room? ");
            System.out.println("1 = Enter ");
            System.out.println("2 = Move on "); 
            battle = fight.nextInt();
            continue; } 
         break; }    
    
    //Battle: pick weapon and set damage; else run away
    if (battle == 1) { 
      System.out.println();
      System.out.println("You remember you hace a special vaccum to suck up demons and a supernatural knife.");
      System.out.println("Choose your weapon: ");
      System.out.println("1 = Special Vaccum ");
      System.out.println("2 = Supernaturel Knife "); 
      Scanner item = new Scanner (System.in); 
      int weapon = item.nextInt();
      
      //Checkk input 
      while (true) {
         if (weapon < 1 || weapon > 2) {
            System.out.println("Invalid entry. ");
            System.out.println("Pick your weapon: ");
            System.out.println("1 = Special Vaccum ");
            System.out.println("2 = Supernaturel Knife "); 
            weapon = item.nextInt();
            continue; } 
         break; }  
         
     //Adjust damage base don weapon
     if (weapon == 1) {
      System.out.println();
      damage = 20; 
      bossGhost.battle(player, bossGhost, damage);}
     else {
      System.out.println();
      damage = 30;
      bossGhost.battle(player, bossGhost, damage);
      continue; } }
   //If run away print statements of running away and then ++ 
   //- If the user chooses to run away then continue  
   else {
      System.out.println("You have ran away from the ghost. You move further into the house. ");
      System.out.println();
      break; }  

      }//boss ghost

//////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////// 
     
   //- If character/user loses: end game
   if (player.getHealth() <= 0) {
      System.out.println ("You have died."); 
      break; }
      
   else if (player.getHealth() > 0 && ghost.getGhostHealth() <= 0) {
      System.out.println ("You have defeated the ghost. ");
      System.out.println();
      if (player.health == 100) {
      System.out.println ("You have full health");
      player.printStat();  }
      else {
      System.out.println ("You have 10 points returned for defeating the ghost. ");
      ghost.returnHealth(player, health);
      player.printStat(); }
         //replace array index with 0 to store cleared room
         arr[room - 1] = 0;
      ghostEncounter++; }
      
   else if (player.getHealth() > 0 && bossGhost.getGhostHealth() <= 0) {
      System.out.println ("You have defeated the deamon. ");
      System.out.println();
         //replace array index with 0 to store cleared room
         arr[room - 1] = 0;
      ghostEncounter++; }
   
   else {
      continue; } 
      
//////////////////////////////////////////////////////////////////////////////////////
//Do not remove beloew for while loop ghost encounter
}

//////////////////////////////////////////////////////////////////////////////////////
//- If character wins then Congratulate the user on winning! and end your story (the family moves in, everybody is happy, etc.)
   if (ghostEncounter == 4 ) {
      System.out.println("CONGRATS! You're alive and you've cleared the haunted house!" ); }
   else {
      System.out.println("Game has ended."); }



   }
}
