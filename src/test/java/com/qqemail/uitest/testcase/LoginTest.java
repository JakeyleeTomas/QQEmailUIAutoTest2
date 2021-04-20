package com.qqemail.uitest.testcase;

import com.qqemail.uitest.page.LoginPage;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author guji
 * @description
 * @date 2021/4/9 22:25
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LoginTest {
    LoginPage loginPage = new LoginPage();

    @BeforeAll
    static void openUrl(){
        new LoginPage().openUrl();
    }

    @Test
    @DisplayName("密码错误登录")
    @Order(1)
    void loginWithErrPassword(){
        String username = "43922644";
        String password = "123456";
        String expectedErrM = "你输入的帐号或密码不正确，请重新输入。";

        String errM = loginPage.loginWithErrPassword(username, password);
        assertEquals(errM,expectedErrM);
    }

    @Test
    @DisplayName("账号错误登录")
    @Order(2)
    void loginWithErrUsername(){
        String username = "111";
        String password = "123456";
        String expectedErrM = "请输入正确的帐号！";

        String errM = loginPage.loginWithErrUsername(username, password);
        assertEquals(errM,expectedErrM);
    }

    @Test
    @DisplayName("空密码登录")
    @Order(3)
    void loginWithoutPassword(){
        String username = "43922644";
        String password = "";
        String expectedErrM = "你还没有输入密码！";

        String errM = loginPage.loginWithoutPassword(username, password);
        assertEquals(errM,expectedErrM);
    }

    @Test
    @DisplayName("正确登录")
    @Order(4)
    void logSuccess(){
        String username = "43922644";
        String password = "xxx";
        loginPage.loginSuccess(username,password);
    }
}
