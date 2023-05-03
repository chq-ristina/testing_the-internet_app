package cookies;

import base.BaseTests;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CookieTests extends BaseTests {
    @Test
    public void testDeleteCookie(){
        var cookieName = "optimizelyBuckets";
        homePage.deleteCookieByName(cookieName);
        var cookies = homePage.getCookies();
        assertFalse(cookies.contains(cookieName), "Cookie was not deleted");

    }

    @Test
    public void testDeleteCookieToo(){
        var cookieManager = getCookieManager();
        Cookie cookie = cookieManager.buildCookie("optimizelyBuckets", "%7B%TD");
        cookieManager.deleteCookie(cookie);
        assertFalse(cookieManager.isCookiePresent(cookie), "Cookie was not deleted");
    }
}
