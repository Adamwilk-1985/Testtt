package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class FormTest {
    WebDriver driver;

    @Test
    public void formTest() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-extensions");
        driver = new ChromeDriver(options);
        driver.get("https://seleniumui.moderntester.pl/form.php");

        WebElement firstName = driver.findElement(By.id("inputFirstName3"));
        firstName.sendKeys("Jan");

        WebElement lastName = driver.findElement(By.cssSelector("#inputLastName3"));
        lastName.sendKeys("Nowak");

        WebElement emailAdress = driver.findElement(By.cssSelector("input#inputEmail3"));
        emailAdress.sendKeys("jannowak@malpa.pl");

        WebElement male = driver.findElement(By.cssSelector("input#gridRadiosMale"));
        male.click();

        WebElement age = driver.findElement(By.cssSelector("input#inputAge3"));
        age.sendKeys("25");

        WebElement commandsElement = driver.findElement(By.id("selectSeleniumCommands"));
        Select commandsSelect = new Select(commandsElement);
        commandsSelect.selectByValue("navigation-commands");

        WebElement continentsElements = driver.findElement(By.id("selectContinents"));
        Select continents = new Select(continentsElements);
        List<WebElement> continentsOptions = continents.getOptions();
        continentsOptions.remove(0);
        WebElement randomOption = getRandomElement(continentsOptions);
        continents.selectByVisibleText(randomOption.getText());


        List<WebElement> yearsOfExpirience = driver.findElements(By.name("gridRadiosExperience"));
        getRandomElement(yearsOfExpirience).click();

        WebElement additionalInfo = driver.findElement(By.cssSelector("#additionalInformations"));
        additionalInfo.sendKeys("przykład");


    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    public WebElement getRandomElement(List<WebElement> elements) {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(elements.size() - 1);
        return elements.get(randomNumber);
    }


}

