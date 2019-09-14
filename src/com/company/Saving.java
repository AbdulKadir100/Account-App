package com.company;

public class Saving extends Account {
    // List properties specific to the Saving account
   private int safetyDepositBoxID;
   private int SafetyDepositBoxKey;

    // Constructor to initialize setting for the saving properties
    public Saving (String name,String sSN,double initDeposit){
        super(name , sSN , initDeposit );
        accountNumber = "1" + accountNumber;
        setSefetyDeositBox();

    }
    @Override
    public void setRate() {
        rate = getbaserate() - 2.5;
    }
        private void setSefetyDeositBox(){
        safetyDepositBoxID = (int)(Math.random() * Math.pow(10 , 3));
        SafetyDepositBoxKey = (int)(Math.random() * Math.pow(10 , 4));
        System.out.println(safetyDepositBoxID);
    }

    // List any method specific to saving account
   public void showInfo(){
        super.showInfo();
        System.out.println(" Your Saving Account feature: " +
                "\n Safety Deposit Box ID: " +safetyDepositBoxID+
                "\n Safety Deposit Box Key: " + SafetyDepositBoxKey
             );
    }
}

