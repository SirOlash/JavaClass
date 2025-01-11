import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Hotel {
    private final ArrayList<Room> rooms;
    private final ArrayList<Guest>guestList;

    public Hotel() {
        rooms = new ArrayList<>();
        guestList = new ArrayList<>();
        createRoom();
    }
    public void createRoom() {
        //Room room = new Room();
        for(int suite = 1; suite <= 5; suite++) {
            rooms.add(new Room(100 + suite,"Suite",25000));
        }
        for (int doubleRoom = 0; doubleRoom < 10; doubleRoom++) {
            rooms.add(new Room(200 + doubleRoom,"Double",15000));
        }
        for (int single = 0; single < 15; single++) {
            rooms.add(new Room(300 + single,"Single",10000));
        }
    }
    public void addRoom(Room room) {
        rooms.add(room);
    }
    public Room findRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber()== roomNumber) {
                return room;
            }
        }
        return null;
    }

    public void displayRoom() {
        for (Room room : rooms) {
            System.out.println(room);
        }
    }

    public void bookRoom(int roomNumber,Guest guest,int nights) {
        Room room = findRoom(roomNumber);
        if (room != null && room.isAvailable()) {
            room.setAvailable(false);
            guest.setRoomNumber(roomNumber);

            LocalDate checkInDate = LocalDate.now();
            LocalDate checkOutDate = checkInDate.plusDays(nights);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            System.out.println("Room " + roomNumber + " has been booked.");

            double totalPrice = room.getRoomPrice() * nights;

            System.out.println("Guest Details: ");
            System.out.println("    Name: " + guest.getName());
            System.out.println("    Phone: " + guest.getPhoneNumber());
            System.out.println("    Email: " + guest.getEmail());
            System.out.println("Room Details: ");
            System.out.println("    Room Number: " + room.getRoomNumber());
            System.out.println("    Type:   " + room.getRoomType());
            System.out.println("    Price per Night: " + room.getRoomPrice());
            System.out.println("    Total Payment: " + totalPrice);
            System.out.println("    Booking Reference Number: "+ guest.getBookingReference());
            System.out.printf("    Your check-In Date is: %s and your check-out Date is: %s", checkInDate.format(formatter),checkOutDate.format(formatter));
            guestList.add(guest);
        }
        else {System.out.println("Room " + roomNumber + " is not available.");}
    }

    public void cancelBooking(String bookingReference) {
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
            System.out.println("Booking Cancelled for " + guestToCancel.getName());
        }
        else {System.out.println("No booking found for " + bookingReference);}
    }







}
