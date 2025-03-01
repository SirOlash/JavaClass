package eStore;

import java.util.ArrayList;
import java.util.List;

public class Customer extends UserDetails{
    private List<BillingInfo> billingInfo;
    private Cart cart;

    public Customer(String userName,int age,String email,Address homeAddress,String phoneNumber, String password) {
        super(userName,age,email,homeAddress,phoneNumber,password);
        this.billingInfo = new ArrayList<>();
        this.cart = new Cart();
    }
}
