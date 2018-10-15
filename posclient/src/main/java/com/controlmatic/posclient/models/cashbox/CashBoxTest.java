package com.controlmatic.posclient.models.cashbox;

public class CashBoxTest {
    public static void main(String[] args){
        
        CashBoxAdapter cba = new CashBoxAdapter();
        
        System.out.println(cba.getStatus());
        cba.openCashbox();
        System.out.println(cba.getStatus());
       
    }
}
