package com.mycompany.app.EX_Tuan_2.Code_2.Initialization_and_Cleanup;

public class EX12 {
    boolean isFilled;
    class Tank{
        boolean isFilled = false;
        Tank(boolean filled) {
            this.isFilled = filled;
        } 
    }
    public void fill() {
       isFilled = true;
    }
    public void empty() {
       isFilled = false;
    }
    @Override
    protected void finalize() {
        if (isFilled) {
            System.out.println("Error: Tank is full!");
        }
    }
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        EX12 tanksliver = new EX12();
    tanksliver.fill();
        EX12 tankcopper = new EX12();
    System.gc();
        EX12 tankdiamon = new EX12();
    tankdiamon.fill();
    tankcopper = null;
    System.gc();
    }
}
