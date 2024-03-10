package com.mycompany.app.EX_Tuan_2.Code_2.Initialization_and_Cleanup;

public class EX22 {
    enum PaperCurrency{
        empty,mot_dong,hai_dong,ba_dong,bon_dong,nam_dong,sau_dong,bay_dong;
    }
    
    public static void main(String[] args) {
        PaperCurrency currency = PaperCurrency.empty;
        switch (currency) {
            case mot_dong:System.out.println("hoi it");
                
                break;
                case hai_dong:System.out.println("van hoi it");
                
                break;
                case ba_dong:System.out.println("ok");
                
                break;
                case bon_dong:System.out.println("cx gan nua so tien");
                
                break;
                case nam_dong:System.out.println("nua so tien r");
                
                break;
                case sau_dong:System.out.println("cao them it r");
                
                break;
                case bay_dong:System.out.println("cao");
                
                break;
        
            default:System.out.println("HET TIEN ROI A");
                break;
        }
        
    }
}
