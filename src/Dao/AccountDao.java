package Dao;

import Model.Account;
import Model.Data;

public class AccountDao {

    public void saveAccount(Account a){
        Data.getConnectedUser().getUserAccounts().put(a.getId(), a);
    }
}
