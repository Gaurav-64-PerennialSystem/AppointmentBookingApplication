package com.company;

public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerphoneNumber;

    public void deposit(double depositAmount){
        this.balance+=depositAmount;
        System.out.println("Deposit  of "+depositAmount+"Made. New Balance is "+this.balance);
    }
    public void withdrawl(double withdrawlAmount){
        if(this.balance-withdrawlAmount<=0){
            System.out.println("Only"+this.balance+  " Available withdrawl not processed");
        }else{
            this.balance-=withdrawlAmount;
            System.out.println("withdrawl of "+withdrawlAmount+ "Processed .remaining balance="+balance);
        }
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerphoneNumber() {
        return customerphoneNumber;
    }

    public void setCustomerphoneNumber(String customerphoneNumber) {
        this.customerphoneNumber = customerphoneNumber;
    }
}
