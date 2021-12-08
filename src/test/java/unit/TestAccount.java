package unit;

import com.example.mns_architecture_logicielle.model.accounts.Account;
import com.example.mns_architecture_logicielle.model.accounts.AccountWithOverdraft;
import com.example.mns_architecture_logicielle.model.accounts.AccountWithoutOverdraft;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestAccount {

    private Account account;
    private AccountWithOverdraft accountWithOverdraft;

    @Before
    public void setUp() {
        // Test avec compte découvert non autorisé ..
        account = new AccountWithoutOverdraft(100);
        accountWithOverdraft = new AccountWithOverdraft(500);
    }

    @Test
    public void testCredit() {
        Assert.assertTrue(account.credit(100));
        Assert.assertEquals(200, account.getSolde(), 0);
    }

    @Test
    public void testDebitAccountWithoutOverDraft() {
        Assert.assertFalse(account.withdrawal(150));
        Assert.assertEquals(100, account.getSolde(), 0);
    }

    @Test
    public void testDebitAccountWithOverDraft() {
        accountWithOverdraft.setOverdraftAllowed(100d);
        Assert.assertTrue(accountWithOverdraft.withdrawal(550));
        Assert.assertEquals(-50, accountWithOverdraft.getSolde(), 0);
    }
}
