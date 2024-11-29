package AdvancedOops;


class Account{
    private double balance;
    private String name;
    private String pass;
    public Account(String name, String pass){
        this.name = name;
        this.pass = pass;
    }
    public void getBalance(){
        System.out.println("Balance Available: " + balance);
    }
    public void setBalance(double balance){
        boolean res = validate();
        if(res){
            this.balance += balance;
            System.out.println("Amount Credited Successfully");
        }
        else{
            System.out.println("Invalid Username/Password .....");
        }
    }
    public void withdraw(double balance){
        boolean res = validate();
        if(res){
            this.balance -= balance;
            System.out.println("Amount debited Successfully: " + balance);
        }
        else{
            System.out.println("Invalid Username/Password .....");
        }
    }
    private boolean validate(){
        return name.equals("aftab") && pass.equals("aftab123");
    }
}
public class ATM {
    public static void main(String[] args) {
        Account ac = new Account("aftab","aftab123");
        ac.setBalance(1000.0);
        ac.getBalance();
        ac.withdraw(200);
    }
}
