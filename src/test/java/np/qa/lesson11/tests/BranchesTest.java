package np.qa.lesson11.tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BranchesTest {

    @Test
    public void commitTest() {
    assertTrue(3==2);
    }

    @Test
    public void commitTest2() {
        assertEquals(2,2);
    }

}
