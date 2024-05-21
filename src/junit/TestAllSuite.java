package junit;

import junit.framework.Test;
import junit.framework.TestSuite;

public class TestAllSuite {
    public static void main(String[] args) {

        junit.textui.TestRunner.run(getSuite());

    }

    public static Test getSuite() {

        TestSuite suite = new TestSuite("Test All");
        suite.addTestSuite(TestAssertNotNull.class);
        suite.addTestSuite(TestAssertNull.class);
        return suite;

    }


}
