package com.mycompany.app.EX_Tuan_3.Code_2;


   // Tạo 1 lớp Instrument
    abstract class Instrument{
        abstract void play();
        abstract void adjust();
        String name(){
            return null;}
       
    }
    // Tạo class Wind là con của Instrument
    class Wind extends Instrument{
        public Wind(){}
        public void play(Note n){
            System.out.println("Sound wind " + n.C);
        }
        public void adjust(){

        }
    }
    // Tạo class Percussion là con của Instrument
    class Percussion extends Instrument{
        public Percussion(){}
        public void play(Note n){
            System.out.println("Sound Percussion " + n.C);
        }
        public void adjust(){

        }
    }
    // Tạo class Stringed là con của Instrument
     class Stringed extends Instrument{
        public Stringed(){}
        public void play(Note n){
            System.out.println("sound Stringed " + n.C);
        }
        public void adjust(){

        }
    }
    //Tạo class Woodwind là con của Wind
    class Woodwind extends Wind{
        public Woodwind(){}
        public void play(){
            System.out.println("Sound woodwind");
        }
        public void adjust(){
            System.out.println("Nut ngam da duoc thay");
        }
    }
    //Tạo class Brass là con của Wind
    class Brass extends Wind{
        public Brass(){}
        public void play(){
            System.out.println("Sound brass");
        }
        public void adjust(){

        }
      
    }
    // Tạo note
    class Note{
        String A = "A";
        String B = "A";
        String C = "Middle_C";
        String D = "D";
        String E = "E";
        String F = "F";
        String G = "G";
        
    }
    //Tạo âm thanh cho từng con của Instrument
   interface Tune{
    public void Windsound();
    public void Percussionsound();
    public void Stringedsound();
    }
    
    public class test {
    public static void main(String[] args) {
        Note note = new Note();
        Wind noiseWind = new Wind();
        noiseWind.play(note);
        Percussion noisePercussion = new Percussion();
        noisePercussion.play(note);
        Stringed noiseStringed = new Stringed();
        noiseStringed.play(note);
        }
    }

