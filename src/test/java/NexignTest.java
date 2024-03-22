import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;

public class NexignTest {

    NexignPage nexign = new NexignPage();

    @BeforeAll
    public static void setup() {
        Configuration.baseUrl = "https://nexign.com/ru";
    }

    @Test
    public void productsForDevTest() {
        NexignPage nexign = new NexignPage();
        nexign.open();
        nexign.storeSection
                .click();
        nexign.productsForDev.shouldBe(visible)
                .click();
    }
}