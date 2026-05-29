



// Deposit money
// Withdraw money
// Check their balance

public class passingClassToMethods {
    
    public static class BankAccount{

    //Data Members
    String Accountholder;
    int Accountnumber;
    double Balance;

    //Deposit Money
    void deposit(double amount) {
        Balance = Balance + amount;
        System.out.println(amount + "deposited");
    }

    //Withdraw Money
    void withdraw(double amount){
        if(amount<=Balance){
            Balance = Balance - amount;
            System.out.println(amount + "Withdraw");
        }else{
            System.out.println("Insufficient Balance");
        }
    }

    //Display Account Balance 

    void displayBalance(){
        System.out.println("Account Holder: " + Accountholder);
        System.out.println("Current Balance: " + Balance);
    }
}
    public static void main(String[]args) {

        BankAccount  a1 = new BankAccount();

        a1.Accountholder = "Yash Shinde";
        a1.Accountnumber = 123456789;
        a1.Balance = 10000;

        a1.deposit(1000);
        a1.withdraw(2000);
        a1.displayBalance();
    }
}