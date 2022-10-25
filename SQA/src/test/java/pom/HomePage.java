package pom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage{

    //LOCALIZADORES
    private By iconUser = By.xpath("//*[@id=\"hrefUserIcon\"]");
    private By newAccount = By.xpath("//a[normalize-space()='CREATE NEW ACCOUNT']");
    private By userName = By.xpath("//input[@name='usernameRegisterPage']");
    private By email = By.xpath("//input[@name='emailRegisterPage']");
    private By password = By.xpath("//input[@name='passwordRegisterPage']");
    private By confirmPass = By.xpath("//input[@name='confirm_passwordRegisterPage']");
    private By agree = By.xpath("//input[@name='i_agree']");
    private By register = By.id("register_btnundefined");

    private  By getUserName = By.xpath("(//a[@id='menuUserLink'])[1]");

    //DATOS
    private String name = "CUENTA521";
    private String lastName = "PERE";
    private String mail = "pepitoperez24@outlook.com";
    private String pass = "Holamund0";
    private String phoneNumber = "3154894578";
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void clickIconUser() throws Exception{
        this.click(iconUser);




    }

    public void setNewAccount() throws Exception{
        Thread.sleep(3000);
        this.click(newAccount);
    }
    public void setRegister() throws Exception{
        Thread.sleep(2000);
        this.write(userName,name);
        Thread.sleep(500);
        this.write(email,mail);
        Thread.sleep(500);
        this.write(password,pass);
        Thread.sleep(500);
        this.write(confirmPass,pass);
    }
    public void validateUser() throws Exception{
        this.click(agree);
        Thread.sleep(1000);
        this.click(register);
        Thread.sleep(7000);
        String getName = this.getText(getUserName);
        System.out.println(getName);
        System.out.println("fdiouhdf");
        Assert.assertEquals(getName, name);

    }


}
