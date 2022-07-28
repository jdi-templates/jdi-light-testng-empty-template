package site;

import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import site.pages.*;

public class MySite {
    @Url("{HOME_PAGE_URL}")
    public static FirstPage homePage;

}
