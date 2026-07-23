package demo.src.test.java.com.junit.demo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class AAAPatternTest {
    private List<String> testList;

    // Setup method runs BEFORE every single @Test
    @Before
    public void setUp() {
        testList = new ArrayList<>();
        System.out.println("Setup: Created a fresh testList.");
    }

    // Teardown method runs AFTER every single @Test
    @After
    public void tearDown() {
        testList.clear();
        testList = null;
        System.out.println("Teardown: Cleared the testList.");
    }

    @Test
    public void testListAdditionUsingAAA() {
        // 1. ARRANGE: Set up the specific data for this test
        String expectedItem = "VS Code";
        int expectedSize = 1;

        // 2. ACT: Execute the behavior being tested
        testList.add(expectedItem);

        // 3. ASSERT: Verify the expected outcomes
        assertEquals(expectedSize, testList.size());
        assertEquals(expectedItem, testList.get(0));
    
}
}
