package com.company;

public class checking extends Account {
    // List properties to a checking account
    private int debitCardPIN;
   private int debitCardNumber;

    // Constructor to initialize checking account properties
    public checking(String name,String sSN,double initDeposit){
        super(name,sSN,initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();

    }
    @Override
    public void setRate(){
        rate = getbaserate() * .15;
    }
    private void setDebitCard(){
        debitCardNumber = (int)(Math.random() * Math.pow(10 , 12));
        debitCardPIN =  (int)(Math.random() * Math.pow(10 , 4));
        System.out.println("Debit Card Number : "+this.debitCardNumber);
        System.out.println("Debit Card PIN : "+this.debitCardPIN);
    }

    // List any method specific to the checking account
    public void showInfo(){
        super.showInfo();
        System.out.println("Your Checking Account Feature : " +
                "\n Debit Number " +debitCardNumber+
                "\n Debit Card PIN : "+debitCardPIN
        );
    }
}
