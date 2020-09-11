//IS 247, Group 5 Abstract Class Example

abstract class Animal {
   protected String name;
   public abstract void animalSound();
   public abstract void getType();
   public abstract String getName();
}

class Horse extends Animal {

   public Horse() {
      name = "Leo";
   }
   public Horse(String nickname) {
      name = nickname;
   }

   public String getName() {
      return name;
   }

   public void animalSound() {
      System.out.println("Neigh");
   }

   public void getType() {
      System.out.println("Equine");
   }

}

class Cow extends Animal {
   public Cow() {
      name = "Bessy";
   }
   public Cow(String nickname) {
      name = nickname;
   }

   public String getName() {
      return name;
   }

   public void animalSound() {
      System.out.println("Moo");
   }

   public void getType() {
      System.out.println("Bovine");
   }
}

class Cat extends Animal {
   public Cat() {
      name = "Fluffy";
   }
   public Cat(String nickname) {
      name = nickname;
   }

   public String getName() {
      return name;
   }

   public void animalSound() {
      System.out.println("Meow");
   }

   public void getType() {
      System.out.println("Feline");
   }
}


public class AnimalTest {
   public static void main(String[] args) {
   
      Horse fur = new Horse();
      Horse hoof = new Horse("Penny");
      Animal moo = new Cow();
      Animal cud = new Cow("Bob");
      Animal claw = new Cat();
      Animal catnip = new Cat("Arwen");
      
      System.out.println(fur.getName());
      fur.getType();
      fur.animalSound(); 
      
      System.out.println(hoof.getName());
      hoof.getType();
      hoof.animalSound(); 
      
      System.out.println(moo.getName());
      moo.getType();
      moo.animalSound(); 
      
      System.out.println(cud.getName());
      cud.getType();
      cud.animalSound(); 
      
      System.out.println(claw.getName());
      claw.getType();
      claw.animalSound(); 
      
      System.out.println(catnip.getName());
      catnip.getType();
      catnip.animalSound();   
   }
}