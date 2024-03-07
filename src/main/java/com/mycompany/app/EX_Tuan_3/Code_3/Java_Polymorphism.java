package com.mycompany.app.EX_Tuan_3.Code_3;

class Anima {
    public void animalSound() {
      System.out.println("The animal makes a sound");
    }
  }
  
  class Pg extends Anima {
    public void animalSound() {
      System.out.println("The pig says: wee wee");
    }
  }
  
  class Dg extends Anima {
    public void animalSound() {
      System.out.println("The dog says: bow wow");
    }
  }
  
  class M {
    public static void main(String[] args) {
      Anima myAnimal = new Anima();  // Create a Animal object
      Anima myPig = new Pg();  // Create a Pig object
      Anima myDog = new Dg();  // Create a Dog object
      myAnimal.animalSound();
      myPig.animalSound();
      myDog.animalSound();
    }
  }