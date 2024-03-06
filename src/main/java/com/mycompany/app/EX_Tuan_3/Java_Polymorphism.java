package com.mycompany.app.EX_Tuan_3;

class Anima {
    public void animalSound() {
      System.out.println("The animal makes a sound");
    }
  }
  
  class Pig extends Anima {
    public void animalSound() {
      System.out.println("The pig says: wee wee");
    }
  }
  
  class Dog extends Anima {
    public void animalSound() {
      System.out.println("The dog says: bow wow");
    }
  }
  
  class Main {
    public static void main(String[] args) {
      Anima myAnimal = new Anima();  // Create a Animal object
      Anima myPig = new Pig();  // Create a Pig object
      Anima myDog = new Dog();  // Create a Dog object
      myAnimal.animalSound();
      myPig.animalSound();
      myDog.animalSound();
    }
  }