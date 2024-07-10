package com.ansary;

public class Program {

    public static void main(String[] args){
        Customer Ansary = new Customer("Ansary", "132");

        Ansary.addAccount("DBBL");
        Ansary.deposit("DBBL", 500);

        Ansary.addAccount("bKash");
        Ansary.deposit("bKash", 1000);

        Ansary.displayCustomerInformation();

        Ansary.withdraw("DBBL", 10);
        Ansary.withdraw("bKash", 100);
        Ansary.withdraw("DBBL", 500);
        Ansary.displayCustomerInformation();

    }

}
