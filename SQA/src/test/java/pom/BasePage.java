package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver){

        this.driver = driver;
    }

    public void click(By element) throws Exception {
        try {
            driver.findElement(element).click();
        }catch (Exception e){
            throw  new Exception("Lo siento no pudo dar click en:" + element);
        }
    }
    public void write(By element, String element1) throws Exception{
        try{
            driver.findElement(element).sendKeys(element1);

        }catch (Exception e){
            throw  new Exception("Lo siento no pudo escribir en:" + element);
        }

    }

    public String getText(By element) throws Exception {
        try {
            return driver.findElement(element).getText();
        }catch (Exception e){
            throw  new Exception("Lo siento obtener el texto del:" + element);
        }
    }

    public String getTittle() throws Exception {
        try {
            return driver.getTitle();
        }catch (Exception e){
            throw  new Exception("Lo siento obtener el titulo"  );

        }
    }


}
