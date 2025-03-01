package eStore;

public class UserDetails {
    private String userName;
    private int age;
    private String email;
    private Address homeAddress;
    private String phoneNumber;
    private String password;

    public UserDetails(String userName,int age,String email,
                       Address homeAddress, String phoneNumber, String password) {
        this.userName = userName;
        this.age = age;
        this.email = email;
        this.homeAddress = homeAddress;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }
}
