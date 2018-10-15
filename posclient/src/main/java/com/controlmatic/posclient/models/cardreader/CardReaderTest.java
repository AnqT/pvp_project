package com.controlmatic.posclient.models.cardreader;

public class CardReaderTest {
    
    public static void main(String[] args){
        
        // Instantiating a new adapter.
        
        CardReaderAdapter cardreader = new CardReaderAdapter();
        
        CombinedCardResult crr = new CombinedCardResult();

        // cardreader.waitForPayMent(100.01);
           
        crr = cardreader.getResult();
        
        System.out.println(crr.bonusCardNumber+"\n"+
                crr.bonusState+"\n"+
                crr.paymentCardNumber+"\n"+
                crr.goodThruMonth+"\n"+
                crr.goodThruYear+"\n"+
                crr.paymentState+"\n"+
                crr.paymentCardType);
    }
}
