import static org.junit.Assert.*;

public class BankAccountTest {

    @org.junit.Test
    public void deposit() throws Exception {
//        fail("This test has yet to be implemented");
        BankAccount account = new BankAccount("Armando", "PaPa", 1000.00,
                BankAccount.CHECKING);
        double balance = account.deposit(200.00, true);
        assertEquals(1200.00, balance, 0);
    }

    @org.junit.Test
    public void withdraw() throws Exception {
        fail("This test has yet to be implemented");
    }

    @org.junit.Test
    public void getBalance_deposit() throws Exception {
//        fail("This test has yet to be implemented");
        BankAccount account = new BankAccount("Armando", "PaPa", 1000.00,
                BankAccount.CHECKING);
        account.deposit(200.00, true);
        assertEquals(1200.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void getBalance_withdraw() throws Exception {
//        fail("This test has yet to be implemented");
        BankAccount account = new BankAccount("Armando", "PaPa", 1000.00,
                BankAccount.CHECKING);
        account.withdraw(200.00, true);
        assertEquals(800.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void isChecking_true() {
        BankAccount account = new BankAccount("Armando", "PaPa", 1000.00,
                BankAccount.CHECKING);
//        assertEquals(true, account.isChecking());
        assertTrue("The account is NOT a checking account", account.isChecking());
//        assertFalse(account.isChecking());
    }


//    @org.junit.Test
//    public void dummyTest(){
//        assertEquals(20,21);
//    }

}







