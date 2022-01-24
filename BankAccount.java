public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private static int numberOfAccounts = 0;
    private static int allAccountsValue = 0;
    
    public BankAccount(double checkingBalance, double savingsBalance){
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        numberOfAccounts += 1;
        allAccountsValue += checkingBalance + savingsBalance; 
    }
    public void getCheckingBalance() {
        System.out.println(checkingBalance);
    }
    public void getSavingsBalance() {
        System.out.println(savingsBalance);
    }
    public void deposit(String account, double funds){
        if(account == "checking"){
            this.checkingBalance += funds;
            this.allAccountsValue += funds;
        }
        else{
            this.savingsBalance +=funds;
            this.allAccountsValue +=funds;
        }
    }
    public void withdrawal(String account, double funds){
        if(account == "checking" && checkingBalance >= funds){
            this.checkingBalance -= funds;
            this.allAccountsValue -= funds;
        }
        else if(savingsBalance >= funds){
            this.checkingBalance -= funds;
            this.allAccountsValue -= funds;
        }
        else{
            System.out.println("Insufficient Funds.");
        }
    }
    public void getTotalBalance(){
        System.out.println(checkingBalance + savingsBalance);
    }
}