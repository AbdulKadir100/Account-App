package com.company;

public abstract class Account implements baseRate {
    // List common properties for saving and checking accounts
   private String name;
   private String sSN;
   private double balance;

   private static int index = 10000;
   protected String accountNumber;
   protected double rate;


    // Constructor to set base properties the account
    public Account(String name, String sSN,double initDeposit){
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;



        // Set Account nmbr
        this.accountNumber = setAccountNumber();
        System.out.println("Base Rate is : "+getbaserate());
        setRate();
    }
    public abstract void setRate();
  // Set Account Number
    private String setAccountNumber(){
        index++;
        int uniqueID = index;
        String lastTwoOfsSN = sSN.substring(sSN.length()-2, sSN.length());
        int randomNumber = (int)(Math.random() * Math.pow(10,3));
        return lastTwoOfsSN + uniqueID + randomNumber;
    }
    public void compound(){
        double accountIntrest = balance * (rate/100);
        balance = balance + accountIntrest;
        System.out.println("Interest is $ : "+accountIntrest);
    }

    //  List Common method transactions
    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Depositing $ : "+amount);
        printBalance();
    }
    public void withdraw(double amount){
       balance = balance -  amount;
       System.out.print("Withdraw $ : "+amount);
        printBalance();
    }
    public void transfer(String towhere , double amount){
          balance = balance - amount;
          System.out.println("transfer $ : "+amount+ " "+towhere);
        printBalance();

    }
    public void printBalance(){
        System.out.println("Your balance $ : "+balance);
    }
    public void showInfo(){
        System.out.println(
          "NAME : " + name +
          "\nACCOUNT NUMBER : " + accountNumber +
           "\nBALANCE : " +balance+ "" +
                  "\n RATE : "+rate

        );
    }

}
