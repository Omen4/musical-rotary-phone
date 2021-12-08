package unit;

import com.example.mns_mockito.db.Database;
import com.example.mns_mockito.user.User;
import com.example.mns_mockito.login.Login;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestLogin {

    private Login login;

    @Before
    public void setUp() {
        Database db = new Database();
        this.login = new Login(db);
    }

    @Test
    public void testLogin() {
        User user = login.getLogin("Test", "Test");
        Assert.assertEquals("Stéphane", user.getName());
    }
}
