package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.devtools.v137.overlay.model.ContainerQueryContainerHighlightConfig;

public class BaseTest {

    @BeforeAll
    public static void setUp(){
        Configuration.baseUrl = "https://www.petrolplus.ru/";
        Configuration.pageLoadStrategy = "eager";
    }
}
