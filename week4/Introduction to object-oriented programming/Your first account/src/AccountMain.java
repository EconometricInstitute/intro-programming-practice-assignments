public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account("My account", 100);
        account.deposit(20);
        System.out.println(account);
    }
}
