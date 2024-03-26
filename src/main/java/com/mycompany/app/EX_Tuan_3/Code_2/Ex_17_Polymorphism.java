package com.mycompany.app.EX_Tuan_3.Code_2;

public class Ex_17_Polymorphism {
    class Cycles{
	
    }
    
    class Unicycles extends Cycles{
        public String toString(){
        return "Unicycles";	
        }
        public void balance(){
            System.out.println("Balancing on " + this);
        }
    }
    
    class Bicycles extends Cycles{
        public String toString(){
            return "Bicycles";
        }
        public void balance(){
            System.out.println("Balancing on " + this);
            }
    }
        
    class Tricycles extends Cycles{
        public String toString(){
            return "Tricycles";	
        }
    }
        
    public class Ex17 {
        public void ride(Cycles c){
            System.out.println("Riding a " + c.toString());
        }
        public void main(String[] args) {
            Cycles[] c = {
                    new Unicycles(), 
                    new Bicycles(),
                    new Tricycles()
            };
            
            ((Unicycles)c[0]).balance();
            ((Bicycles)c[1]).balance();
        }
    }
}
