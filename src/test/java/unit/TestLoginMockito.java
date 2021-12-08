package unit;

import com.example.mns_mockito.db.Database;
import com.example.mns_mockito.user.User;
import com.example.mns_mockito.login.Login;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class TestLoginMockito {

    private Login login;
    private Login loginSpy;

    @Before
    public void setUp() {
        //Mock de la db..
        Database db = Mockito.mock(Database.class);
        //Spy
//        Database dbSpy = Mockito.spy(Database.class);

        Mockito.
                when(db.getUser("TEST", "TEST")).
                thenReturn(new User("TEST", "TEST"));
//
//        Mockito.
//                when(dbSpy.getUser("TEST", "TEST")).
//                thenReturn(new User("TEST", "TEST"));

        this.login = new Login(db);
//        this.loginSpy = new Login(dbSpy);
    }

    @Test
    public void testGetLogin() {
        User user = login.getLogin("TEST", "TEST");
        Assert.assertEquals("TEST", user.getName());
    }

//    @Test
//    public void testGetLoginWithSpy(){}
//
}
