package junit;

import junit.framework.TestCase;
import org.junit.Test;

public class TestAssertNull extends TestCase {
    @Test
    public void testFindByPk() throws Exception {

        UserBean user = UserModel.findByPk(2);
       // assertNull(user + "user not found");
       // assertNotNull(user + "user found");
        assertTrue(user != null);
        assertFalse(user == null);
    }
}
