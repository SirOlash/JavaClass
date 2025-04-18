import java.util.Scanner;

public class MainMenu {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Bank bank = new Bank();
   // private static Account account;

    public static void main(String[] args) {
        goToMainMenu();
    }

    private static void goToMainMenu() {
            System.out.println("""
            Welcome to Gtb Bank
            1. Create Account
            2. Deposit
            3. Withdrawal
            4. Transfer
            5. Check Balance
            6. Update Pin
            7. Exit
            """);
       int userChoice = intInput("Enter your choice: ");
       switch (userChoice) {
           case 1:createAccount();
               break;
           case 2: deposit();
                break;
           case 3: withdrawal();
                break;
           case 4: transfer();
                break;
           case 5: checkBalance();
                break;
           case 6: updatePin();
                break;
           case 7: System.out.println("Thank you for using Gtb Bank");
               System.exit(0);
                break;
           default: System.out.println("Invalid choice");


       }

    }


    private static void createAccount(){
        String firstName = stringInput("Enter first name: ","[a-zA-Z]+","Enter a valid first name!!");
        String lastName = stringInput("Enter last name: ","[a-zA-Z]+","Enter a valid last name!!");
        String pin = pinInput("Enter your pin: ");
        Account account = bank.createAccount(firstName, lastName, pin);
        loadingScreen();
        System.out.println("Account with account number: " + account.getAccountNumber() + " created Successfully");
        System.out.println();
        goToMainMenu();
    }
    private static void deposit(){
        int accountNumber = intInput("Enter account number: ");
        try{
            bank.getAccount(accountNumber);
            int amount = intInput("Enter amount to deposit: ");
            bank.deposit(accountNumber, amount);
            loadingScreen();
            System.out.println("Deposited NGN" + amount + " to accountNumber: " + accountNumber);

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            goToMainMenu();
        }

    }

    private static void withdrawal(){
        int accountNumber = intInput("Enter account number: ");
        try {
            bank.getAccount(accountNumber);
            int amount = intInput("Enter amount to withdraw: ");
            String pin = pinInput("Enter your pin: ");
            bank.withdraw(accountNumber, amount, pin);
            loadingScreen();
            System.out.println("You just withdrew " + amount + " from " + accountNumber);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            goToMainMenu();
        }

    }
    private static void transfer(){
        int senderAccountNumber = intInput("Enter sender account number: ");
        int receiverAccountNumber = intInput("Enter receiver account number: ");
        if (senderAccountNumber == receiverAccountNumber) {
            System.out.println("You cannot transfer to the same account");
            goToMainMenu();
        }
        try {
            bank.getAccount(senderAccountNumber);
            bank.getAccount(receiverAccountNumber);
            int amount = intInput("Enter amount to transfer: ");
            String senderPin = pinInput("Enter senders pin: ");
            bank.transfer(senderAccountNumber,receiverAccountNumber,amount,senderPin);
            loadingScreen();
            System.out.println("You just transferred NGN" + amount + " to Account Number " + receiverAccountNumber + " from Account Number" + senderAccountNumber);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("hshsh");
            goToMainMenu();
        }

    }
    private static void checkBalance(){
        int accountNumber = intInput("Enter account number: ");
        try{
            bank.getAccount(accountNumber);
            String pin = pinInput("Enter your PIN: ");
            double balance = bank.checkBalance(accountNumber,pin);
            loadingScreen();
            System.out.println("Your balance is " + balance);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            goToMainMenu();
        }
    }
    private static void updatePin(){
        int accountNumber = intInput("Enter the account number whose pin you want to update: ");
        try{
            bank.getAccount(accountNumber);
            String oldPin = pinInput("Enter your old pin: ");
            String newPin = pinInput("Enter your new pin: ");
            bank.updatePin(accountNumber,oldPin,newPin);
            loadingScreen();
            System.out.println("Your new pin has been successfully updated");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            goToMainMenu();
        }
    }

    private static String stringInput(String prompt, String regex, String errorMessage) {
        while (true) {
            System.out.print(prompt);
            String userInput = scanner.nextLine().trim();

            if (!userInput.isEmpty() && userInput.matches(regex)) {
                return userInput;
            } else {
                System.out.println(errorMessage);
            }
        }
    }

//    private static double doubleInput(String message){
//        System.out.print(message + " ");
//        while(!scanner.hasNextInt()){
//            System.out.println("Invalid input. Please enter a number");
//            scanner.next();
//        }
//        int value = scanner.nextInt();
//        scanner.nextLine();
//        return value;
//    }

    private static int intInput(String message) {
        System.out.print(message + " ");
        while(!scanner.hasNextInt()){
            System.out.println("Invalid input. Please enter a Whole Number");
            scanner.next();
        }
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }
    private static String pinInput(String prompt) {
        return stringInput(
                prompt,
                "^[a-zA-Z0-9]{4,}$",
                "PIN should contain a minimum of 4 characters (letters or numbers)!"
        );
    }
    private static void loadingScreen() {
        System.out.print("Please Wait");
       // int duration = 3000;
//        String prompt = "LOADING";
//        int delay = duration/prompt.length();
//        for (char letter: prompt.toCharArray() ) {
//            System.out.print(letter + " ");
//            try{
//                Thread.sleep(delay);
//            }catch (InterruptedException e){
//                e.printStackTrace();
//            }
//        }
//        System.out.println();
//        }
        //int delay = duration/10;
        for (int index = 1;index < 6; index++) {
            System.out.print(">");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println();
    }




}
