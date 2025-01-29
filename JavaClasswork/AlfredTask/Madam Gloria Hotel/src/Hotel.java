import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Random;

public class Hotel {
    private final ArrayList<Room> rooms;
    private final ArrayList<Guest>guestList;
    private final ArrayList<BookingReceipt>receipts;
    private final ArrayList<Integer> maintenanceRooms;

    Random rand = new Random();
    Scanner input = new Scanner(System.in);
    public Hotel() {
        rooms = new ArrayList<>();
        guestList = new ArrayList<>();
        receipts = new ArrayList<>();
        maintenanceRooms = new ArrayList<>();
        createRoom();
    }
    public void createRoom() {
        //Room room = new Room();
        for(int suite = 0; suite < 4; suite++) {
            rooms.add(new Room(100 + suite,"Suite",25000));
        }
        for (int doubleRoom = 0; doubleRoom < 6; doubleRoom++) {
            rooms.add(new Room(200 + doubleRoom,"Double",15000));
        }
        for (int single = 0; single < 10; single++) {
            rooms.add(new Room(300 + single,"Single",10000));
        }
    }
    public void addRoom() {
        System.out.println("What type of room do you want to add?");
        String type = input.nextLine().trim();
        System.out.println("How many "+type+" rooms do you want to add?");
        int roomsAdded = input.nextInt();
        if(type.equalsIgnoreCase("Single")){
            for (int single = 0; single < roomsAdded; single++) {
                rooms.add(new Room(310 + single,"Single",10000));
                System.out.println("Room "+ (310 + single) +" Successfully added");
            }
        }
        else if(type.equalsIgnoreCase("Double")){
            for (int doubleRoom = 0; doubleRoom < roomsAdded; doubleRoom++) {
                rooms.add(new Room(206 + doubleRoom,"Double",15000));
            }
        }
        else if(type.equalsIgnoreCase("Suite")){
            for(int suite = 0; suite < roomsAdded; suite++) {
                rooms.add(new Room(104 + suite,"Suite",25000));
            }
        }
        else {System.out.println("Invalid Room-Typr");}


    }
    public Room findRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber()== roomNumber) {
                return room;
            }
        }
        return null;
    }

    public void displayAvailableRoom() {
        for (Room room : rooms) {
            if (room.isAvailable()) System.out.println(room);
        }
    }

    public void bookRoom() {
            //guest.setRoomNumber(roomNumber);
        System.out.println("Welcome to Naija Comfort Inn!(N.B There's an additional 20% Surcharge of the Room prices during festive period)");

        String name;
        String phone;
        String email;
        String roomType;
        int noOfNights;
        int roomNumber;
        String festive;

        while(true) {
            System.out.println("Please enter your name: ");
            name = input.next().trim();
            if (!name.isEmpty() && name.matches("[a-zA-Z\\s]+")) {
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
                System.out.println("Invalid phone number. Please enter exactly 11 digits: ");
            }
        }
        while(true) {
            System.out.println("Please enter your email address: ");
            email = input.next().trim();
            input.nextLine();
            if ( email.endsWith("@gmail.com")){
                break;
            }else {
                System.out.println("Invalid email. It must contain '@' and a '.'");
            }
        }
        while (true){
            System.out.println("Is this a Festive period? (Yes/No): ");
            festive = input.nextLine().trim();
            if (festive.equalsIgnoreCase("Yes") || festive.equalsIgnoreCase("No")){
                break;
            }
            else {
                System.out.println("Invalid input. Enter either Yes or No");
            }
        }
        while(true) {
            System.out.println("Please select a room type(Single/Double/Suite): ");
            roomType = input.nextLine().trim();
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
            if (noOfNights > 0) {
                break;
            }
            else {System.out.println("Invalid number of nights. Please enter a positive integer: ");}
        }
        while(true) {
            displayAvailableRoom();
            System.out.println("Enter a room number");
            roomNumber = input.nextInt();
            Room room = findRoom(roomNumber);
            //Guest guest = findGuest(roomNumber);

            if (room != null && room.isAvailable()) {
                if (room.getRoomType().equalsIgnoreCase(roomType)) {
                    room.setAvailable(false);
                    Guest newGuest = new Guest(name, phone, email, roomNumber);
                    guestList.add(newGuest);

                    LocalDate checkInDate = LocalDate.now();
                    LocalDate checkOutDate = checkInDate.plusDays(noOfNights);
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                    System.out.println("Room " + roomNumber + " has been booked.");
                    //System.out.println(guestList);
                    double totalPrice = room.getRoomPrice() * noOfNights;
                    double festiveTotalPrice = totalPrice + (totalPrice * 0.2);

                    if(festive.equalsIgnoreCase("Yes")) {
                        BookingReceipt receipt = new BookingReceipt(name,phone,email,roomNumber,roomType,festiveTotalPrice,newGuest.getBookingReference(),checkInDate,checkOutDate);
                        receipts.add(receipt);
                    }
                    else { BookingReceipt receipt = new BookingReceipt(name,phone,email,roomNumber,roomType,totalPrice,newGuest.getBookingReference(),checkInDate,checkOutDate);
                        receipts.add(receipt);
                    }

                    System.out.println("Guest Details: ");
                    System.out.println("    Name: " + name);
                    System.out.println("    Phone: " + phone);
                    System.out.println("    Email: " + email);
                    System.out.println("Room Details: ");
                    System.out.println("    Room Number: " + roomNumber);
                    System.out.println("    Type:   " + roomType);
                    if (festive.equalsIgnoreCase("Yes")) {
                        System.out.println("    Festive Price period Surcharge: 20%" );
                        System.out.println("    Total Payment: " + festiveTotalPrice);
                    }
                    else {
                        System.out.println("    Price per Night: " + room.getRoomPrice());
                        System.out.println("    Total Payment: " + totalPrice);
                    }
                    System.out.println("    Booking Reference Number: " + newGuest.getBookingReference());
                    System.out.printf("    Your check-In Date is: %s and your check-out Date is: %s", checkInDate.format(formatter), checkOutDate.format(formatter));

                    break;
                } else {
                    System.out.println("Room " + roomNumber + " does not match the type " + roomType);
                }
            } else {
                System.out.println("Room " + roomNumber + " is not available.");
            }
        }
    }
   /*
      public void addGuest(Guest guest) {
        guestList.add(guest);
     }
     */

    public Guest findGuest(int roomNumber) {
        for (Guest guest : guestList) {
            if (guest.getRoomNumber() == roomNumber) {
                return guest;
            }
        }
        return null;
    }
    public BookingReceipt findReceiptWithBooking(String bookingReference) {
        for (BookingReceipt receipt : receipts) {
            if (receipt.getBookingReference().equalsIgnoreCase(bookingReference)) {
                return receipt;
            }
        }
        return null;
    }

    public void cancelBooking() {
        System.out.println("Enter your booking reference number: ");
        String bookingReference = input.next().trim();

        Guest guestToCancel = null;

        for (Guest guest : guestList) {
            if (guest.getBookingReference().equals(bookingReference)) {
                guestToCancel = guest;
                break;
            }
        }

        if (guestToCancel != null) {
            Room room = findRoom(guestToCancel.getRoomNumber());
            if (room != null){
                room.setAvailable(true);
            }
            guestList.remove(guestToCancel);
            BookingReceipt receipt = searchReceiptByRoomNumber(guestToCancel.getRoomNumber());
            receipts.remove(receipt);
            System.out.println("Booking Cancelled for " + guestToCancel.getName());
        }
        else {System.out.println("No booking found for " + bookingReference);}
    }
    public void searchReceiptByReference() {
        //String bookingRef;
        System.out.println("Enter your booking reference number: ");
        String bookingRef = input.next().trim();
        for (BookingReceipt receipt : receipts) {
            if (receipt.getBookingReference().equalsIgnoreCase(bookingRef)) {
                System.out.println(receipt);
                return;
            }
        }
        System.out.println("No booking found for " + bookingRef);
    }
    public BookingReceipt searchReceiptByRoomNumber(int roomNumber) {
        for (BookingReceipt receipt : receipts) {
            if (receipt.getRoomNumber() == roomNumber) {
                return receipt;
            }
        }
        return null;
    }
    public void maintenance(){
        System.out.println("Enter room number: ");
        int roomNumber = input.nextInt();
        Room room = findRoom(roomNumber);
        if (room != null && room.isAvailable()) {
            room.setAvailable(false);
            maintenanceRooms.add(roomNumber);
            System.out.println("Room " + roomNumber + " has been marked for maintenance.");
        }
        else {System.out.println("Room " + roomNumber + " is not available.");}
    }
    public void roomsUnderMaintenance(){
        if (!maintenanceRooms.isEmpty()){
            for (Integer maintenanceRoom : maintenanceRooms) {
                System.out.println("Room " + maintenanceRoom + " is under maintenance.");
            }
        }else {System.out.println("There are no rooms under maintenance.");}

    }
    public void viewNotification(){
        System.out.println("Enter your booking reference number: ");
        String bookingReference = input.next().trim();
        BookingReceipt receipt = findReceiptWithBooking(bookingReference);
        if (receipt != null) {
            System.out.println("Notification sent to " + receipt.getName() + ":\nDear " + receipt.getName() +", this is a reminder for your stay at Naija Comfort Inn.\nCheck-in Date: " + receipt.getCheckInDate() +"\nRoom Number: " + receipt.getRoomNumber() + "\nWe look forward to hosting you! ");
        }
        else {System.out.println("No guest found with booking Number: " + bookingReference);}

    }
    public void viewAllRooms(){
        for (Room room : rooms) {
            System.out.println(room);
        }
    }
    public void viewAllBookings(){
        for (BookingReceipt receipt : receipts) {
            System.out.println(receipt);
        }
    }
    public void generateReport(){
        System.out.println("Weekly Report");
        System.out.println("Total number of rooms: " + rooms.size());
        System.out.println("Total number of guests: " + guestList.size());
        System.out.println("Total number of rooms Booked: " + receipts.size());
        double occupancyRate = ((double) receipts.size() /rooms.size()) * 100;
        System.out.printf("Occupancy rate: %.3f%%%n", occupancyRate);
        double totalRevenue = 0;
        for (BookingReceipt receipt : receipts) {
            totalRevenue += receipt.getPrice();
        }
        System.out.println("Total revenue: " + totalRevenue);
    }
    //public void (){}






}
