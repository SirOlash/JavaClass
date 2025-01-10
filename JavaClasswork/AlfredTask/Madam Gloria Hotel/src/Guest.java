import java.util.Random;
public class Guest {
    private String name;
    private String phoneNumber;
    private String email;
    private String bookingReference;

    public Guest(String name, String phoneNumber, String email, String bookingReference) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        setBookingReference();
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setBookingReference(){
        Random rand = new Random();
        int randomNumber = rand.nextInt(1000,100000);
        this.bookingReference = "RES" + randomNumber;
    }

    public String getName(){
        return name;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getEmail(){
        return email;
    }
    public String getBookingReference(){
        return bookingReference;
    }
}