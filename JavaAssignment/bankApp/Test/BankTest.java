import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankTest {
    Bank bank;
    @BeforeEach
    void setUp() {
        bank = new Bank();
    }
    @Test
    public void testThatCreateAccountThrowsExceptionIfAnyFieldIsEmptyOrNull() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            bank.createAccount("john","","0000", bank.getAccountNumber());
        });
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            bank.createAccount("","Doe","0000", bank.getAccountNumber());
        });
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            bank.createAccount("john","Doe","",bank.getAccountNumber());
        });
    }
    @Test
    public void testThatArraySizeIncreasesAfterCreatingAccount() {
        Assertions.assertEquals(0,bank.accounts.size());
        bank.createAccount("john","Doe","0000", bank.getAccountNumber());
        Assertions.assertEquals(1,bank.accounts.size());
        //bank.accounts.size();
    }
    @Test
    public void testThatYouCanDepositIntoAccount() {
        bank.createAccount("john","Doe","0000", bank.getAccountNumber());
        bank.deposit(123451,1000);
        bank.checkBalance(123451)
    }

}
