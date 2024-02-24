package junit;

import org.junit.*;

public class TestLifeCycle {
    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("before class");
    }

    @Before
    public void before() throws Exception {
        System.out.println("before");
    }

    @Test
    public void testAdd1() {
        System.out.println("Test 01");
        // System.out.println(Calculation.add(10, 5));
    }

    @Test
    public void testAdd2() {
        System.out.println("Test 02"); //

    }

    @Ignore
    public void testAdd3() {
        System.out.println("Test 03"); //

    }

    @After
    public void after() throws Exception {
        System.out.println("after");
    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("after class");
    }



}
