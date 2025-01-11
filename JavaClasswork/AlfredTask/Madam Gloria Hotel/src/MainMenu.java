import java.util.Scanner;
public class MainMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            while(true){
                try{
                    System.out.println("\nWelcome to Naija Comfort Inn, Your comfort is our priority");
                    System.out.println("1. Book Room ");
                    System.out.println("2. View Available Rooms ");
                    System.out.println("3. Cancel Booking ");
                    System.out.println("4. Exit");
                    System.out.println("Enter your choice: ");

                    int choice = input.nextInt();
                    input.nextLine();
                    switch (choice) {
                        case 1:
                            String name;
                            String phone;
                            String email;
                            String roomType;
                            int noOfNights;

                            while(true) {
                                System.out.println("Please enter your name: ");
                                name = input.next().trim();
                                if (!name.isEmpty() && name.matches("[a-zA-Z\\s]+]")) {
                                    break;
                                }
                                 else {
                                    System.out.println("Enter a valid name (letters only): ");
                                }
                            }
                            while(true) {
                                System.out.println("Please enter your phone number: ");
                                phone = input.next().trim();
                                if (phone.length() == 11 && phone.matches("[0-9]{11}")) {
                                    break;
                                }
                                else {
                                    System.out.println("Invalid phone number. Pleease enter exactly 11 digits only: ");
                                }
                            }
                            while(true) {
                                System.out.println("Please enter your email address: ");
                                email = input.next().trim();
                                if (email.matches(".+@.+\\..+")){
                                    break;
                                }else {
                                    System.out.println("Invalid email. It must contain '@' and a '.'");
                                }
                            }
                            while(true) {
                                System.out.println("Please select a room type(Single/Double/Suite): ");
                                roomType = input.next().trim();
                                if (roomType.equalsIgnoreCase("Single") ||
                                        roomType.equalsIgnoreCase("Double") ||
                                        roomType.equalsIgnoreCase("Suite")) {
                                    break;
                                } else {
                                    System.out.println("Invalid room type. Please enter Single, Double, or Suite.");
                                }
                            }
                            while(true) {
                                System.out.println("Please enter the number of nights you wish to spend: ");
                                noOfNights = input.nextInt();
                                if (noOfNights <= 0) {
                                    break;
                                }
                                else {System.out.println("Invalid number of nights. Please enter a positive integer: ");}
                            }

                    }
                }
                catch(Exception e){System.out.println("Invalid input");}

            }


        }

    }
}
