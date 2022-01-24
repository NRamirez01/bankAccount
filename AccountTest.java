public class AccountTest {
    public static void main(String[] args) {
        BankAccount user1 = new BankAccount(100, 200);
        user1.getCheckingBalance();
        user1.deposit("checking", 100);
        user1.getCheckingBalance();
        user1.withdrawal("checking", 300);
        user1.getCheckingBalance();
        user1.getTotalBalance();
    }
}
