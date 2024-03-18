// Bài 1: Tạo các lớp dựa trên sơ đồ UML
package com.mycompany.app.EX_Tuan_2.Code_2.Polymorphism;

abstract class Instrument {
    abstract void play();

    String what() {
        return null;
        /* */};

    abstract void adjust();
}

class Wind extends Instrument {
    void play() {
    }

    String what() {
        return "Wind";
    }

    void adjust() {
    }
}

class Percussion extends Instrument {
    void play() {
    }

    String what() {
        return "Percussion";
    }

    void adjust() {
    }
}

class Stringed extends Instrument {
    void play() {
    }

    String what() {
        return "Stringed";
    }

    void adjust() {
    }
}

class Woodwind extends Wind {
    void play() {
    }

    String what() {
        return "Woodwind";
    }
}

class Brass extends Wind {
    void play() {
    }
    void adjust() {
    }
    
}

