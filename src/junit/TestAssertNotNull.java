package junit;

import junit.framework.TestCase;
import org.junit.Test;

public class TestAssertNotNull extends TestCase {

    @Test
    public void testFindByPk() throws Exception {

        UserBean user = UserModel.findByPk(2);
        assertNotNull("user is not added", user);
    }


}
