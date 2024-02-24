package junit;

import org.junit.Test;

public class TestFail {

    @Test
    public void testadd() throws Exception {
        UserBean user = new UserBean();
        user.setId(3);
        user.setName("aman");
        user.setSalary(3000);
        UserModel.add(user);
    }


}
