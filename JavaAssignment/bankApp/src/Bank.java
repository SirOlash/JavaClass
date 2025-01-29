import java.util.ArrayList;

public class Bank {
    ArrayList<Account> accounts = new ArrayList<>();
    private int accountNumber = 123450;


    public Account createAccount(String firstName, String lastName, String pin, int accountNumber) {
        this.accountNumber = accountNumber + 1;
        if (firstName == null || firstName.trim().isEmpty()){
            throw new IllegalArgumentException("Invalid first name");
        }
        if (lastName == null || lastName.trim().isEmpty()){
            throw new IllegalArgumentException("Invalid Last Name");
        }
        if(pin == null || pin.trim().isEmpty()){
            throw new IllegalArgumentException("Invalid Pin");
        }
        Account account = new Account(firstName, lastName, pin,accountNumber);
        accounts.add(account);

        return account;
    }
    public int getAccountNumber(){
        return accountNumber;
    }

    public void deposit(int accountNumber, int amount) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                account.deposit(amount);
            }
            else {
                throw new IllegalArgumentException("Invalid Account Number");
            }
        }
    }
}
