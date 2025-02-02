import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Bank {
    ArrayList<Account> accounts = new ArrayList<>();
    private int accountNumber = 1;


    public Account createAccount(String firstName, String lastName, String pin) {

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
        accountNumber++;
        return account;
    }
    public int getAccountNumber(){
        return accountNumber;
    }

    public void deposit(int accountNumber, int amount) {
        Account account = getAccount(accountNumber);
        account.deposit(amount);
    }

    public Account getAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        throw new IllegalArgumentException("Invalid Account Number");
    }

    public int checkBalance(int accountNumber, String correctPin) {
        Account account = getAccount(accountNumber);
        return account.getBalance(correctPin);
    }

    public void withdraw(int accountNumber, int amount, String correctPin) {
        Account account = getAccount(accountNumber);
        account.withdraw(amount, correctPin);
    }

    public void transfer(int senderAccount, int receiverAccount, int amount, String senderPin) {
        Account sender = getAccount(senderAccount);
        Account receiver = getAccount(receiverAccount);
        sender.withdraw(amount, senderPin);
        receiver.deposit(amount);
    }

    public void updatePin(int accountNumber,String oldPin, String newPin) {
        Account account = getAccount(accountNumber);
        account.updatePin(oldPin,newPin);
    }
}
