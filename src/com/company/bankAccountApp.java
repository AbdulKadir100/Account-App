package com.company;

import java.util.List;

public class bankAccountApp extends Account{
    private static String file;
        //
    public bankAccountApp(String name,String sSN,double initDeposit) {
        super(name,sSN,initDeposit);
    }

    @Override
    public void setRate() {
    }

    public static void main(String[] args) {

/*
        checking acc1 = new checking("Abdul Hadi ","32477473",1500);

        Saving ss1 = new Saving("Abdul Kadir ","33475653",1600);
        ss1.compound();

        acc1.showInfo();
        System.out.println("******************");
        ss1.showInfo();

 */
        // Read the CSV file and create new account based on that date

        List<String[]> newAccountHolders = utilities.CSv.read(file);
        for (String[] accountHolders :  newAccountHolders
             ) {
            System.out.println("NEW ACCOUNT: ");
            System.out.println(accountHolders[0]);
            System.out.println(accountHolders[1]);
            System.out.println(accountHolders[2]);
            System.out.println(accountHolders[3]);
            System.out.println(accountHolders[4]);


        }
    }
}
