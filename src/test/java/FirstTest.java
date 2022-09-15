import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.time.Duration;

public class FirstTest {

    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();

    }

    @Test
    public static void testOne() {
        WebDriver driver = new ChromeDriver();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.close();
    }

    @Test
    public static void testTwo(){
        WebDriver driver = new ChromeDriver();
        driver.get(Helper.GOOGLE);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.close();
    }

    @Test
    public static void testThree() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(Helper.SAUCE);
        Thread.sleep(3000);
        driver.navigate().to(Helper.GITHUB);
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        driver.close();
    }

    @Test
    public static void testFour() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(Helper.GITHUB);
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.manage().window().minimize();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.close();
    }

    @Test
    public static void testFive(){
        WebDriver driver = new ChromeDriver();
        driver.get(Helper.SAUCE);
        WebElement loginField = driver.findElement(By.id(Helper.USERNAMEFIELD));
        loginField.sendKeys("hey");
        loginField.clear();
        loginField.sendKeys("haha");
        WebElement passwordField = driver.findElement(By.id(Helper.PASSWORDFIELD));
        passwordField.sendKeys("1234");
        WebElement loginBtn = driver.findElement(By.id(Helper.LOGINBTN));
        loginBtn.click();
        driver.close();
    }

    @Test
    public static void testSix() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get(Helper.SAUCE);
        WebElement loginField = driver.findElement(By.id(Helper.USERNAMEFIELD));
        WebElement passwordField = driver.findElement(By.id(Helper.PASSWORDFIELD));
        WebElement loginBtn = driver.findElement(By.id(Helper.LOGINBTN));
        loginField.sendKeys(Helper.STANDART);
        passwordField.sendKeys(Helper.PASSWORD);
        loginBtn.click();
        File file1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File file2 = new File(Helper.FOLDER + "1.jpg");
        FileUtils.copyFile(file1,file2);

        driver.get(Helper.SAUCE);
        loginField = driver.findElement(By.id(Helper.USERNAMEFIELD));
         passwordField = driver.findElement(By.id(Helper.PASSWORDFIELD));
         loginBtn = driver.findElement(By.id(Helper.LOGINBTN));
        loginField.sendKeys(Helper.LOCKED);
        passwordField.sendKeys(Helper.PASSWORD);
        loginBtn.click();
//        driver.close();

    }

    @Test
    public static void test1(){
        WebDriver driver = new ChromeDriver();
        driver.close();
    }

    @Test
    public static void test2(){
        WebDriver driver = new ChromeDriver();
        driver.get(Helper.GITHUB);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        driver.close();
    }

    @Test
    public static void test3() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(Helper.GOOGLE);
        Thread.sleep(3000);
        driver.navigate().to(Helper.GITHUB);
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        driver.close();
    }

    @Test
    public static void test4() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(Helper.GITHUB);
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.manage().window().minimize();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.close();
    }

    @Test
    public static void test5(){
        WebDriver driver = new ChromeDriver();
        driver.get(Helper.SAUCE);
        WebElement loginField = driver.findElement(By.id(Helper.USERNAMEFIELD));
        loginField.sendKeys("hey");
        loginField.clear();
        loginField.sendKeys("shlom");
        WebElement passwordField = driver.findElement(By.id(Helper.PASSWORDFIELD));
        passwordField.sendKeys(Helper.PASSWORD);
        WebElement loginBtn = driver.findElement(By.id(Helper.LOGINBTN));
        loginBtn.click();
        driver.close();
    }

    @Test
    public static void test6() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get(Helper.SAUCE);
        WebElement loginField = driver.findElement(By.id(Helper.USERNAMEFIELD));
        WebElement passwordField = driver.findElement(By.id(Helper.PASSWORDFIELD));
        WebElement loginBtn = driver.findElement(By.id(Helper.LOGINBTN));

        loginField.sendKeys(Helper.STANDART);
        passwordField.sendKeys(Helper.PASSWORD);
        loginBtn.click();

        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File file1 = new File(Helper.FOLDER1 + "2.jpg");
        FileUtils.copyFile(file,file1);

        driver.get(Helper.SAUCE);
        loginField = driver.findElement(By.id(Helper.USERNAMEFIELD));
        loginField.sendKeys(Helper.LOCKED);
        passwordField = driver.findElement(By.id(Helper.PASSWORDFIELD));
        passwordField.sendKeys(Helper.PASSWORD);
        loginBtn = driver.findElement(By.id(Helper.LOGINBTN));
        loginBtn.click();
        driver.close();
    }

    @Test
    public static void test6s() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get(Helper.SAUCE);
        WebElement loginField = driver.findElement(By.id(Helper.USERNAMEFIELD));
        WebElement passwordField = driver.findElement(By.id(Helper.PASSWORDFIELD));
        WebElement loginBtn = driver.findElement(By.id(Helper.LOGINBTN));

        loginField.sendKeys(Helper.STANDART);
        passwordField.sendKeys(Helper.PASSWORD);
        loginBtn.click();

        File file1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File file2 = new File(Helper.FOLDER1 + "2.jpg");
        FileUtils.copyFile(file1,file2);

        driver.get(Helper.SAUCE);
        loginField = driver.findElement(By.id(Helper.USERNAMEFIELD));
        passwordField = driver.findElement(By.id(Helper.PASSWORDFIELD));
        loginBtn = driver.findElement(By.id(Helper.LOGINBTN));
        loginField.sendKeys(Helper.LOCKED);
        passwordField.sendKeys(Helper.PASSWORD);
        loginBtn.click();
        driver.close();

    }

    @Test
    public static void test7() throws IOException {
        WebDriver driver = new ChromeDriver();
        for (int i = 0; i < Helper.USERS.length; i++) {
            driver.get(Helper.SAUCE);
            WebElement loginField = driver.findElement(By.id(Helper.USERNAMEFIELD));
            WebElement passwordField = driver.findElement(By.id(Helper.PASSWORDFIELD));
            WebElement loginBtn = driver.findElement(By.id(Helper.LOGINBTN));
            loginField.sendKeys(Helper.USERS[i]);
            passwordField.sendKeys(Helper.PASSWORD);
            loginBtn.click();
            File path = new File(Helper.FOLDER1 + (i + 1) + Helper.JPG);
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot,path);
            driver.navigate().to(Helper.SAUCE);
        }
        driver.quit();
    }

    @Test
    public static void i1(){
       WebDriver driver = new ChromeDriver();
       driver.close();
    }

    @Test
    public static void i2(){
        WebDriver driver = new ChromeDriver();
        driver.get(Helper.GITHUB);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        driver.close();
    }

    @Test
    public static void i3() throws InterruptedException {
        WebDriver driver  = new ChromeDriver();
        driver.get(Helper.GITHUB);
        Thread.sleep(3000);
        driver.navigate().to(Helper.GOOGLE);
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        driver.close();
    }

    @Test
    public static void i4() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(Helper.GITHUB);
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.manage().window().minimize();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.close();
    }

    @Test
    public static void i5(){
        WebDriver driver = new ChromeDriver();
        driver.get(Helper.SAUCE);
        WebElement loginField = driver.findElement(By.id(Helper.USERNAMEFIELD));
        WebElement passwordField = driver.findElement(By.id(Helper.PASSWORDFIELD));
        WebElement loginBtn = driver.findElement(By.id(Helper.LOGINBTN));
        loginField.sendKeys("neria");
        loginField.clear();
        loginField.sendKeys("Neria Mines");
        passwordField.sendKeys("12345");
        loginBtn.click();
        driver.close();
    }

    @Test
    public static void i6() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get(Helper.SAUCE);
        WebElement loginField = driver.findElement(By.id(Helper.USERNAMEFIELD));
        loginField.sendKeys(Helper.STANDART);
        WebElement passwordField = driver.findElement(By.id(Helper.PASSWORDFIELD));
        passwordField.sendKeys(Helper.PASSWORD);
        WebElement loginBtn = driver.findElement(By.id(Helper.LOGINBTN));
        loginBtn.click();
        File file1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File file2 = new File(Helper.FOLDER1 + "1.jpg");
        FileUtils.copyFile(file1,file2);
        driver.get(Helper.SAUCE);
        loginField = driver.findElement(By.id(Helper.USERNAMEFIELD));
        loginField.sendKeys(Helper.LOCKED);
        passwordField = driver.findElement(By.id(Helper.PASSWORDFIELD));
        passwordField.sendKeys(Helper.PASSWORD);
        loginBtn = driver.findElement(By.id(Helper.LOGINBTN));
        loginBtn.click();
        driver.close();


    }

    @Test
    public static void i7() throws IOException {
        WebDriver driver = new ChromeDriver();
        for (int i = 0; i < Helper.USERS.length; i++) {
            driver.get(Helper.SAUCE);
            WebElement loginField = driver.findElement(By.id(Helper.USERNAMEFIELD));
            WebElement passwordField = driver.findElement(By.id(Helper.PASSWORDFIELD));
            WebElement loginBtn = driver.findElement(By.id(Helper.LOGINBTN));
            loginField.sendKeys(Helper.USERS[i]);
            passwordField.sendKeys(Helper.PASSWORD);
            loginBtn.click();
            File path = new File(Helper.FOLDER + (i+1) + Helper.JPG);
            File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot,path);
        }
        driver.quit();

    }

    @Test
    public static void i8(){
        WebDriver driver = new ChromeDriver();
        driver.get(Helper.SAUCE);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        WebElement usernameField =
//                wait.until(ExpectedConditions.presenceOfElementLocated(By.id(Helper.USERNAMEFIELD)));
//          WebElement usernameField = driver.findElement(By.cssSelector("#user-name"));
//        WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        WebElement usernameField = driver.findElement(By.name("user-name"));
        usernameField.sendKeys("found it");
//        driver.quit();
    }

    @Test
    public static void i9() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(Helper.SAUCE);
        String firstWindow = driver.getWindowHandle();

//        WebDriver driver1 = new ChromeDriver();
//        driver1.get(Helper.GOOGLE);
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get(Helper.GOOGLE);
        String secondWindow = driver.getWindowHandle();
        Thread.sleep(3000);
        driver.switchTo().window(firstWindow);
        driver.get(Helper.GOOGLE);
        driver.quit();
    }

    @Test
    public static void i10() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(Helper.SAUCE);
        String firstTab = driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(Helper.GOOGLE);
        String secondTab = driver.getWindowHandle();
        Thread.sleep(3000);
        driver.switchTo().window(firstTab);
        driver.get(Helper.GOOGLE);
        driver.close();
    }

    @Test
    public static void t1(){
        WebDriver driver = new ChromeDriver();
        driver.close();
    }
    @Test
    public static void t2(){
        WebDriver driver = new ChromeDriver();
        driver.get(Helper.GITHUB);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        driver.close();
    }
    @Test
    public static void t3() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(Helper.GOOGLE);
        Thread.sleep(3000);
        driver.navigate().to(Helper.GITHUB);
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        driver.close();
    }
    @Test
    public static void t4() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(Helper.GITHUB);
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.manage().window().minimize();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.close();
    }
    @Test
    public static void t5(){
        WebDriver driver = new ChromeDriver();
        driver.get(Helper.SAUCE);
        WebElement usernameField = driver.findElement(By.id(Helper.USERNAMEFIELD));
        WebElement passwordField = driver.findElement(By.id(Helper.PASSWORDFIELD));
        WebElement loginBtn = driver.findElement(By.id(Helper.LOGINBTN));
        usernameField.sendKeys("neria");
        usernameField.clear();
        usernameField.sendKeys("mines");
        passwordField.sendKeys("123456");
        loginBtn.click();
        driver.close();
    }
    @Test
    public static void t6() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get(Helper.SAUCE);
        WebElement loginField = driver.findElement(By.id(Helper.USERNAMEFIELD));
        WebElement passwordField = driver.findElement(By.id(Helper.PASSWORDFIELD));
        WebElement loginBtn = driver.findElement(By.id(Helper.LOGINBTN));
        loginField.sendKeys(Helper.STANDART);
        passwordField.sendKeys(Helper.PASSWORD);
        loginBtn.click();
        File file1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File file2 = new File(Helper.FOLDER + "1.jpg");
        FileUtils.copyFile(file1,file2);

        driver.get(Helper.SAUCE);
        loginField = driver.findElement(By.id(Helper.USERNAMEFIELD));
        passwordField = driver.findElement(By.id(Helper.PASSWORDFIELD));
        loginBtn = driver.findElement(By.id(Helper.LOGINBTN));
        loginField.sendKeys(Helper.LOCKED);
        passwordField.sendKeys(Helper.PASSWORD);
        loginBtn.click();
        driver.close();
    }
    @Test
    public static void t7() throws IOException {
        WebDriver driver = new ChromeDriver();
        for (int i = 0; i < Helper.USERS.length; i++) {
            driver.get(Helper.SAUCE);
            WebElement usernameField = driver.findElement(By.id(Helper.USERNAMEFIELD));
            WebElement passwordField = driver.findElement(By.id(Helper.PASSWORDFIELD));
            WebElement loginBtn = driver.findElement(By.id(Helper.LOGINBTN));
            usernameField.sendKeys(Helper.USERS[i]);
            passwordField.sendKeys(Helper.PASSWORD);
            loginBtn.click();

            File screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File path = new File(Helper.FOLDER1 + (i + 1) + Helper.JPG);
            FileUtils.copyFile(screenShot, path);
        }
        driver.quit();
    }
    @Test
    public static void t8() {
        WebDriver driver = new ChromeDriver();
        driver.get(Helper.SAUCE);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//       WebElement usernameField =
//               wait.until(ExpectedConditions.presenceOfElementLocated(By.id(Helper.USERNAMEFIELD)));
//        WebElement usernameField = driver.findElement(By.cssSelector("#user-name"));
//        WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        WebElement usernameField = driver.findElement(By.name("user-name"));
        usernameField.sendKeys("found it");
        driver.quit();
    }
    @Test
    public static void t9() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(Helper.SAUCE);
        String firstWindow = driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get(Helper.GOOGLE);
        String secondWindow = driver.getWindowHandle();
        Thread.sleep(3000);
        driver.switchTo().window(firstWindow);
        driver.get(Helper.GOOGLE);
        driver.close();
    }











}
