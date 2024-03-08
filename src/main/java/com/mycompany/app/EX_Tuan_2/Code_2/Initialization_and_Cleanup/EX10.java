package com.mycompany.app.EX_Tuan_2.Code_2.Initialization_and_Cleanup;

public class EX10 {
    static class Num {
        boolean checkedOut = false;

        Num(boolean checkOut) {
            checkedOut = checkOut;
        }

        void checkIn() {
            checkedOut = false;
        }

        @Override
        protected void finalize() {
            if (checkedOut) {
                System.out.println("Error: checked out");
            }
        }
    }

    public static void main(String[] args) {
        Num novel = new Num(true);
        novel.checkIn();

        new Num(true); // This object won't be used and will be eligible for garbage collection
    }
}
