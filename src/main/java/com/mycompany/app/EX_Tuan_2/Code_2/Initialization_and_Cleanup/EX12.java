package com.mycompany.app.EX_Tuan_2.Code_2.Initialization_and_Cleanup;

public class EX12 {
    boolean isfilled;
    class Tank{
        boolean isfilled = false;
        Tank(boolean Filled) {
            Filled = isfilled;
            } 
    }
    public void fill() {
       boolean isfilled = true;
    }
    public void empty() {
       boolean isfilled = false;
    }
    @Override
    protected void finalize() {
        if (isfilled) {
            System.out.println("Error: Tank is not empty during cleanup!");
        }
    }
    public static void main(String[] args) {
        EX12 tanksliver = new EX12();
    tanksliver.fill();
        EX12 tankcopper = new EX12();
    System.gc();
        EX12 tankdiamon = new EX12();
    tankdiamon.fill();
    
    }
}
