import java.time.LocalDate;

public class BookingReceipt {
    private String name;
    private String phone;
    private String email;
    private int roomNumber;
    private String roomType;
    private double price;
    private String bookingReference;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;

    public BookingReceipt(String name, String phone, String email, int roomNumber,String roomType,double price, String bookingReference, LocalDate checkInDate, LocalDate checkOutDate ) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.price = price;
        this.bookingReference = bookingReference;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public double getPrice() {
        return price;
    }
    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }
    public String getName() {
        return name;
    }
    public String getBookingReference(){
        return bookingReference;
    }
    @Override
    public String toString() {
        return "Booking Receipt:\n" +
                "  Name: " + name + "\n"
                + "  Phone: " + phone + "\n"
                + "  Email: " + email + "\n"
                + "  Room Number: " + roomNumber + "\n"
                + "  Room Type: " + roomType + "\n"
                + "  Total Price: " + price + "\n"
                + "  Check In Date: " + checkInDate + "\n"
                + "  Check Out Date: " + checkOutDate + "\n\n";
    }

}
