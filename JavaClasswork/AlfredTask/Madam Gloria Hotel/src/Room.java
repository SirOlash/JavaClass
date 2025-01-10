public class Room {
    private int roomNumber;
    private String roomType;
    private double roomPrice;
    private boolean isAvailable;

   public Room(int roomNumber, String roomType, double roomPrice) {
       this.roomNumber = roomNumber;
       this.roomType = roomType;
       this.roomPrice = roomPrice;
       this.isAvailable = true;
   }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    public void setRoomType(String roomType) {
       this.roomType = roomType;
    }
    public void setRoomPrice(double roomPrice) {
       this.roomPrice = roomPrice;
    }
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    public boolean isAvailable() {
       return isAvailable;
    }
    public int getRoomNumber() {
        return roomNumber;
   }
    public String getRoomType() {
        return roomType;
   }
    public double getRoomPrice() {
        return roomPrice;
   }



}
