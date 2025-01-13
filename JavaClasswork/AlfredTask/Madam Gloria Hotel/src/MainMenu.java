import java.util.Scanner;
public class MainMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;
        Hotel hotel = new Hotel();



        while (running) {
            while(true){
                try{
                    System.out.println("\nWelcome to Naija Comfort Inn, Your comfort is our priority");
                    System.out.println("\n========== Hotel Management ==========");
                    System.out.println("1. View Available Rooms ");
                    System.out.println("2. Book Room ");
                    System.out.println("3. Cancel Booking ");
                    System.out.println("4. Edit Profile");
                    System.out.println("5. View Booking ");
                    System.out.println("6. View Notification");
                    System.out.println("7. Sign in for Admin Privileges");
                    System.out.println("8. Exit");
                    System.out.println("Enter your choice: ");

                    int choice = input.nextInt();
                    input.nextLine();
                    switch (choice) {
                        case 1:
                            hotel.displayAvailableRoom();
                            System.out.println("\nEnter '0' to go back: ");
                            break;
                        case 2:hotel.bookRoom();
                            break;
                        case 3:hotel.cancelBooking();
                            break;
                        case 4: System.out.println("Enter your Room Number:");
                                int roomNumber = input.nextInt();
                                input.nextLine();
                                Guest guest = hotel.findGuest(roomNumber);
                                BookingReceipt receipt = hotel.searchReceiptByRoomNumber(roomNumber);

                            boolean edit = true;
                            while (edit) {


                                if (guest != null) {
                                System.out.println("Choose what you want to edit");
                                System.out.println("1. Name");
                                System.out.println("2. PhoneNumber ");
                                System.out.println("3. Email ");
                                System.out.println("4. Exit ");
                                    int userChoice = input.nextInt();
                                    input.nextLine();

                                        switch (userChoice) {
                                            case 1:
                                                System.out.println("Enter Your Name : ");
                                                String name = input.nextLine();
                                                guest.setName(name);
                                                receipt.setName(name);
                                                System.out.println("Name has been updated Successfully!!!");
                                                edit = false;
                                                break;
                                            case 2:
                                                System.out.println("Enter Your PhoneNumber : ");
                                                String phoneNumber = input.nextLine();
                                                guest.setPhoneNumber(phoneNumber);
                                                receipt.setPhone(phoneNumber);
                                                System.out.println("Phone number has been updated Successfully!!!");
                                                edit = false;
                                                break;
                                            case 3:
                                                System.out.println("Enter Your Email : ");
                                                String email = input.nextLine();
                                                guest.setEmail(email);
                                                receipt.setEmail(email);
                                                System.out.println("Email has been updated Successfully!!!");
                                                edit = false;
                                                break;
                                            case 4: edit = false;
                                                break;
                                            default:
                                                System.out.println("Invalid choice");
                                               // break;
                                        }
                                    }
                                    else {System.out.println("Room "+roomNumber+" does not exist");
                                        break;
                                    }
                                }
                            break;
                        case 5: hotel.searchReceiptByReference();
                            break;
                        case 6: hotel.viewNotification();
                            break;
                        case 7: System.out.println("Enter Admin Password");
                                String password = input.nextLine();
                                if (password.equals("admin123")) {
                                    System.out.println("\nWelcome, Madam Gloria");
                                    boolean backToMain = false;

                                    while (!backToMain) {
                                        System.out.println("\n====== Admin Menu ======");
                                        System.out.println("1. View all Rooms");
                                        System.out.println("2. View Guests Details");
                                        System.out.println("3. Mark Rooms for Maintenance ");
                                        System.out.println("4. View Rooms under Maintenance ");
                                        System.out.println("5. View Reports");
                                        System.out.println("6. Go back to Main Menu");
                                        System.out.println("7. Enter your choice: ");
                                        int adminChoice = input.nextInt();
                                        input.nextLine();
                                        switch (adminChoice) {
                                            case 1:
                                                hotel.viewAllRooms();
                                                break;
                                            case 2:
                                                hotel.viewAllBookings();
                                                break;
                                            case 3:
                                                hotel.maintenance();
                                                break;
                                            case 4:
                                                hotel.roomsUnderMaintenance();
                                                break;
                                            case 5:
                                                hotel.generateReport();
                                                break;
                                            case 6:
                                                backToMain = true;
                                                break;
                                            default:System.out.println("\nInvalid choice. Please try again.");

                                        }
                                    }
                                }
                                else System.out.println("Invalid Password. Access denied.!!!");
                            break;
                        case 8: //running = false;
                                System.out.println("Exiting...");
                            return;
                    }
                }
                catch(Exception e){System.out.println("Invalid input. Try again");}
                    input.nextLine();
            }


        }

    }
}
