import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Start {

    WebDriver wd;

    @Test
    public void start() {
        wd = new ChromeDriver();
        //wd.get("https://contacts-app.tobbymarshall815.vercel.app/login");// without history
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");//with history
        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();


        // wd.close();//close browser where you now
        wd.quit();//close all tabs
    }

    @Test
    public void firstTestLoginSuccess() {

        wd = new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");

        WebElement loginTab = wd.findElement(By.cssSelector("[href='/login']"));
        loginTab.click();

        WebElement emailTextBox = wd.findElement(By.cssSelector("[placeholder='Email']"));
        emailTextBox.click();
        emailTextBox.clear();
        emailTextBox.sendKeys("noa@gmail.com");

        WebElement passwordTextBox = wd.findElement(By.cssSelector("[placeholder='Password']"));
        passwordTextBox.click();
        passwordTextBox.clear();
        passwordTextBox.sendKeys("Nnoa12345$");

        WebElement loginButton = wd.findElement(By.cssSelector("button"));
        loginButton.click();

    }

    @Test
    public void firstTestRegistrationSuccess(){

        wd = new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");

        WebElement loginTab = wd.findElement(By.cssSelector("[href='/login']"));
        loginTab.click();

        WebElement emailTextBox = wd.findElement(By.cssSelector("[placeholder='Email']"));
        emailTextBox.click();
        emailTextBox.clear();
        emailTextBox.sendKeys("tata@gmail.com");

        WebElement passwordTextBox = wd.findElement(By.cssSelector("[placeholder='Password']"));
        passwordTextBox.click();
        passwordTextBox.clear();
        passwordTextBox.sendKeys("Ttata120$");

       // WebElement registrationButton = wd.findElement(By.cssSelector("div.login_login__3EHKB:last-child"));
       // WebElement registrationButton = wd.findElement(By.cssSelector("button:last-child"));
       // List<WebElement> list = wd.findElements(By.cssSelector("button"));
       // WebElement registrationButton





    }
}
