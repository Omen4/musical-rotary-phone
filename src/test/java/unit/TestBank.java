package unit;

import java.util.ArrayList;
import java.util.List;

import com.example.mns_architecture_logicielle.model.Bank;
import com.example.mns_architecture_logicielle.model.accounts.Account;
import com.example.mns_architecture_logicielle.model.accounts.AccountWithoutOverdraft;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBank {

    private Bank bank;

    @Before
    public void setUp() {
        bank = new Bank();
        List<Account> accounts = new ArrayList<>();
        Account account = new AccountWithoutOverdraft(100);
        account.setNum("IBAN");
        accounts.add(account);
        bank.setAccounts(accounts);
    }

    @Test
    public void testWithdraw() {
        String numCompte = "IBAN";
        String numClient = "JOYEUX";
        double amount = 50d;
        Account account = bank.getAccount(numCompte);
        Double soldeInit = account.getSolde();
        Assert.assertTrue(bank.withdraw(numCompte, numClient, amount));
        Double soldeEnd = account.getSolde();
        Assert.assertNotEquals(soldeInit, soldeEnd);
    }

}
