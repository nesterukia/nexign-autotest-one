import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class NexignPage {

    public SelenideElement storeSection = $(".store");
    public SelenideElement productsForDev = $(byText("Продукты для разработчиков"));
    public NexignPage open() {
        Selenide.open("/");
        return this;
    }
}
