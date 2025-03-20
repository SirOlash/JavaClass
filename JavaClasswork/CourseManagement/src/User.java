public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public User(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public boolean validatePassword(String password) {
        return this.password.equals(password);
    }
}

//part of the few people i actually like talking to early morning cus she has a comforting face , she will be be a r