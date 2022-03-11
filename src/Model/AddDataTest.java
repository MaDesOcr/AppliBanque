package Model;

public class AddDataTest {

    public static void addDataForTest(){
        User u1 = new User("TestFirstName1", "1", "1", "customer");
        User u2 = new User("TestFirstName2", "TestLastName2", "2", "customer");
        User u3 = new User("Admins", "Admin", "3", "admin");
        Account au1 = new Account("accountU1", 20.00, true);
        Account au2 = new Account("accountU2", 20.00, true);
        Transaction tau1Toau2 = new Transaction("payment", 10, au1, au2);

        Data.getUsersMap().put(u1.getId(), u1);
        Data.getUsersMap().put(u2.getId(), u2);
        u1.getUserAccounts().put(au1.getId(), au1);
        u2.getUserAccounts().put(au2.getId(), au2);

        au1.getListTransactions().add(tau1Toau2);
    }


}
