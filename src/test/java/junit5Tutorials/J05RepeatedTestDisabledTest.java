package junit5Tutorials;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class J05RepeatedTestDisabledTest {
    /*
	 	@RepeatedTest JUnit5 ile yeni gelmiştir.
	 */

    //
    @RepeatedTest(10)
    @DisplayName("Contain test 10 kere calisacak")
    void containsTest() {
        assertFalse("abcdefg".contains("hi"));
        System.out.println("containsTest caliştirildi");
    }

    @BeforeEach
    void beforeEachTest(TestInfo info) {
        System.out.println(info.getDisplayName() + " beforeEach calisti");
    }

    @AfterEach
    void afterEachTest(TestInfo info) {
        System.out.println(info.getDisplayName() + " afterEach calisti");
        System.out.println("=====================");
    }

    @RepeatedTest(4)
    @DisplayName("toplaTest  4 kere calisacak")
    void toplaTest() {
        assertEquals(3, Math.addExact(1, 2));
        System.out.println("topla calistirildi");
    }

    /*
	 First run the test without using @Disabled annotation and display on the left bar both are executed.
	 Then put @Disabled annotation and run the test, and display testWithArrays() is not executed.
	 Note: In JUnit4 we were using @Ignored instead of @Disabled
	 */

    @Disabled
    @Test
    void testStringLength() {
        String str = "Junit ile Unit test";
        int actual = str.length();
        int expected = 19;

        assertEquals(expected, actual, "Uzunluklar eşit değil");
        System.out.println("testStringLength() calisitirildi");
    }


}