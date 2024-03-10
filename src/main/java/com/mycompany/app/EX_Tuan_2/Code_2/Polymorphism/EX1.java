package com.mycompany.app.EX_Tuan_2.Code_2.Polymorphism;
    class Cycle{
        void ride(){
            System.out.println("normal cycle");
        }
    }
    class Unicycle extends Cycle{
        void ride(){
            System.out.println("unicycle");
        }
    }
    class Bicycle extends Cycle{
        void ride(){
            System.out.println("bicycle");
        }
    }
    class Tricycle extends Cycle{
        void ride(){
            System.out.println("tricycle");
        }
    
    

public static void main(String[] args) {
      
        Cycle basicCycle = new Cycle();
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();

        Cycle upcastUnicycle = unicycle;
        Cycle upcastBicycle = bicycle;
        Cycle upcastTricycle = tricycle;

        basicCycle.ride();
        upcastUnicycle.ride();
        upcastBicycle.ride();
        upcastTricycle.ride();
    }
}
