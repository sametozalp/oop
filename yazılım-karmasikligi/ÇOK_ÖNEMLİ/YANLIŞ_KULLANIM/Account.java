package ÇOK_ÖNEMLİ.YANLIŞ_KULLANIM;
import java.lang.System.Logger;

public class Account {
    private int id;
    private double balance;
    private Logger log;

    // YENİ ŞEYLER EKLENDİKÇE ELSE İF UZAR GİDER - BUNU İSTEMİYORUZ !!!!!!!!!!

    public void changeBalance(String action, double amount) {
        if (action.equals("deposit")) {
            balance += amount;
        } else if (action.equals("Withraw")) {
            balance -= amount;
        }
    }
}
