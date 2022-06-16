
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountTest {


    private final String name;
    private final boolean expected;


    public AccountTest(String checkedText, boolean expected) {
        this.name = checkedText;
        this.expected = expected;
    }


    @Parameterized.Parameters
    public static Object[][] getTextData() {
        return new Object[][] {
                {"Дмитрий Майоров", true},
                {"Д М", true},
                {"Дмитрий Майороввввв", true},
                {"Дима", false},
                {"Дмитрий Май оров", false},
                {"Дмитрий Майоровввввв", false},
                {" Майор", false},
                {"Майор ", false}
        };
    }


    @Test
    @DisplayName("Check account owner's name")
    @Description("This test is for checking validation")
    public void accountValidionTest() {
        Account account = new Account(name);
        boolean actual = account.checkNameToEmboss(name);
        assertEquals(expected, actual);
    }
}

