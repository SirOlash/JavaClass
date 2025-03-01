import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AccountTest {
    Account account;
    @BeforeEach
    void setUp() {
        account = new Account("John","Doe","1234",123451);
    }
    @Test
    public void testThatBalanceIsZero() {
        Assertions.assertEquals(0,account.getBalance("1234"));
    }
    @Test
    public void testThatYouCanDeposit(){
        account.deposit(1000);
        Assertions.assertEquals(1000,account.getBalance("1234"));
    }
    @Test
    public void testThatYouCantDepositANegativeAmount(){
        //account.deposit(-1000);
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            account.deposit(-1000);
        });
    }
    @Test
    public void testThatYouCanWithdraw(){
        account.deposit(1000);
        Assertions.assertEquals(1000,account.getBalance("1234"));
        account.withdraw(500,"1234");
        Assertions.assertEquals(500,account.getBalance("1234"));
        account.updatePin("1234","0000");
        account.withdraw(100,"0000");
        Assertions.assertEquals(400,account.getBalance("0000"));

    }
    @Test
    public void testThatYouCantWithdrawANegativeAmount(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            account.withdraw(-500, "1234");
        });

    }
    @Test
    public void testThatUpdatePinThrowsExceptionIfPinDoesNotMatch() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            account.updatePin("123", "0000");
        });
    }
//    @Test
//    public void testThatUpdatingDetailsWithADifferentPinThrowsExceptionIfPinDoesNotMatch() {
//        Assertions.assertThrows(IllegalArgumentException.class, () -> {
//            account.accountDetails("tola","titi","123");
//        });
//    }


}
