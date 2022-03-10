package Model;

public class AddDataTest {

    public static void addDataForTest(){
        User u1 = new User("TestFirstName1", "1", "1");
        User u2 = new User("TestFirstName2", "TestLastName2", "PWU2");
        Account au1 = new Account("accountU1", 1, 20.00, true);
        Account au2 = new Account("accountU2", 2, 20.00, true);
        Transaction tau1Toau2 = new Transaction("payment", 10, au1, au2);

        Data.getUsersList().put(u1.getLastName(), u1);
        Data.getUsersList().put(u2.getLastName(), u2);
        u1.getUserAccounts().add(au1);
        u2.getUserAccounts().add(au2);
        Data.getAccountsList().add(au1);
        Data.getAccountsList().add(au2);
        au1.getListTransactions().add(tau1Toau2);
        Data.getTransactionsList().add(tau1Toau2);
    }


}
