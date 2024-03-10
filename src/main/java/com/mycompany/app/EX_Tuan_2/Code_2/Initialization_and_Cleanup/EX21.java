package com.mycompany.app.EX_Tuan_2.Code_2.Initialization_and_Cleanup;

public class EX21 {
    enum PaperCurrency{
        empty,mot_dong,hai_dong,ba_dong,bon_dong,nam_dong,sau_dong,bay_dong;
    }
    public static void main(String[] args) {
        for(PaperCurrency currency : PaperCurrency.values()){
            System.out.println(currency+" "+currency.ordinal());
        }
    }
}
