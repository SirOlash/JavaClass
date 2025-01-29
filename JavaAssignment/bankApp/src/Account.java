public class Account{
    private int balance;
    private String pin;
    private String firstName;
    private String lastName;
    private int accountNumber;

    public Account(String firstName, String lastName, String pin,int accountNumber) {
        if (pin.trim().isEmpty()){
            throw new IllegalArgumentException("Invalid Pin");
        }
        this.pin = pin;
        this.balance = 0;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public int getBalance(String pin){
        if (!pin.equals(this.pin)){
            throw new IllegalArgumentException("Invalid Pin");
        }
        return balance;
    }

    public void deposit(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        balance += amount;
    }

    public void withdraw(int amount, String pin) {
        if (amount < 0 ) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        if (balance < amount) {
            throw new IllegalArgumentException("Insufficient Balance");
        }
        if (!pin.equals(this.pin)) {
            throw new IllegalArgumentException("Pin does not match");
        }
        balance -= amount;
    }
    public void updatePin(String oldPin,String newPin) {
        if (oldPin.trim().isEmpty() || newPin.trim().isEmpty()) {
            throw new IllegalArgumentException("Pin cannot be null");
        }
        if (!oldPin.equals(pin)) {
            throw new IllegalArgumentException("Pin does not match");
        }
        pin = newPin;
    }
    public int getAccountNumber() {
        return accountNumber;
    }

}