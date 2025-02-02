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
            bank.createAccount("john","","correctPin");
        });
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            bank.createAccount("","Doe","correctPin");
        });
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            bank.createAccount("john","Doe","");
        });
    }
    @Test
    public void testThatArraySizeIncreasesAfterCreatingAccount() {
        Assertions.assertEquals(0,bank.accounts.size());
        bank.createAccount("john","Doe","correctPin");
        Assertions.assertEquals(1,bank.accounts.size());
    }

    @Test
    public void testThatIfYouDeposit1000_balanceIs1000() {
        bank.createAccount("john","Doe","correctPin");
        bank.deposit(1, 1000);
        Assertions.assertEquals(1000,bank.checkBalance(1,"correctPin"));
    }
    @Test
    public void testThatIfYouDeposit1000_withdraw500_balanceIs500() {
        bank.createAccount("john","Doe","correctPin");
        bank.deposit(1, 500);
        bank.deposit(1,500);
        bank.withdraw(1,500,"correctPin");
        Assertions.assertEquals(500,bank.checkBalance(1,"correctPin"));
    }
    @Test
    public void testThatICanTransferFromOneAccountToAnotherAccount() {
        bank.createAccount("john","Doe","correctPin");
        bank.createAccount("joh","Do","correctPin");
        bank.deposit(1,1000);
        bank.transfer(1,2,500,"correctPin");
        Assertions.assertEquals(500,bank.checkBalance(1,"correctPin"));
        Assertions.assertEquals(500,bank.checkBalance(2,"correctPin"));
    }
    @Test
    public void testThatYouCanUpdatePin(){
        bank.createAccount("john","Doe","correctPin");
        bank.deposit(1,1000);
        bank.withdraw(1,500,"correctPin");
        Assertions.assertEquals(500,bank.checkBalance(1,"correctPin"));
        bank.updatePin(1,"correctPin","newPin");
        Assertions.assertEquals(500,bank.checkBalance(1,"newPin"));
    }

}
