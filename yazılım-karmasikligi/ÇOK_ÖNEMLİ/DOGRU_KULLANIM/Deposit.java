package ÇOK_ÖNEMLİ.DOGRU_KULLANIM;

public class Deposit implements AccountAction {
    @Override
    public double act(double balance, double amount) {
        return balance += amount;
    }
    
}
