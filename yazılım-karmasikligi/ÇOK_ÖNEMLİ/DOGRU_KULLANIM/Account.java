package ÇOK_ÖNEMLİ.DOGRU_KULLANIM;
import java.lang.System.Logger;

public class Account {
    private int id;
    private double balance;
    private Logger log;

    // YENİ ŞEYLER EKLENDİKÇE ELSE İF UZAR GİDER - BUNU İSTEMİYORUZ !!!!!!!!!!

    public void changeBalance(AccountAction action, double amount) {
        balance = action.act(balance, amount);
    }
}
