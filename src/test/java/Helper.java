import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helper {

    public static final String CHROMEKEY = "webdriver.chrome.driver";
    public static final String CHROMEPATH = "res\\chromedriver.exe";
    public static final String GOOGLE = "https://www.google.com/";
    public static final String GITHUB = "https://github.com/";
    public static final String SAUCE = "https://www.saucedemo.com/";
    public static final String HERO = "https://the-internet.herokuapp.com/";
    public static final String HERODROPDOWN = "https://the-internet.herokuapp.com/dropdown";
    public static final String HEROCHECKBOXES = "https://the-internet.herokuapp.com/checkboxes";

    public static final String BASICCALC = "https://testsheepnz.github.io/BasicCalculator.html";
    public static final String NUMBER1FIELD = "number1Field";
    public static final String NUMBER2FIELD = "number2Field";
    public static final String DROPDOWN = "selectOperationDropdown";
    public static final String CAlCBTN = "calculateButton";
    public static final String RESULTFIELD = "numberAnswerField";



    public static final String USERNAMEFIELD = "user-name";
    public static final String PASSWORDFIELD = "password";
    public static final String LOGINBTN = "login-button";

    public static final String STANDART = "standard_user";
    public static final String LOCKED = "locked_out_user";
    public static final String PROBLEM = "problem_user";

    public static final String[] USERS = {STANDART,LOCKED,PROBLEM};


    public static final String PASSWORD = "secret_sauce";

    public static final String FOLDER = "C:\\Users\\User\\Desktop\\Screenshots\\1.jpg";
    public static final String FOLDER1 = "C:\\Users\\User\\Desktop\\123\\2.jpg";

    public static final String JPG = ".jpg";

    public static WebDriver setProperty(){
        System.setProperty(CHROMEKEY,CHROMEPATH);
        return new ChromeDriver();
    }
}
