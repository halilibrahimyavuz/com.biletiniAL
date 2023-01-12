package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Anasayfa {

    public Anasayfa(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

        @FindBy (xpath = "(//a[@class='dropdown-toggle'])[1]")
        public WebElement sinemaDropdown;

        @FindBy (xpath = "(//a[@class='dropdown-toggle'])[2]")
         public  WebElement tiyatroDropdown;

        @FindBy (xpath = "(//a[@class='dropdown-toggle'])[3]")
        public WebElement muzikDropdown;

        @FindBy (xpath = "(//a[@class='dropdown-toggle'])[4]")
        public  WebElement sporDropdown;

        @FindBy (xpath = "(//a[@class='dropdown-toggle'])[5]")
        public  WebElement kulturBakanligiDropdown;

        @FindBy (xpath = "/html/body/main/header/div/div/nav[1]/ul/li[6]/a")
        public  WebElement sehireOzelEtkinlikler;

        @FindBy (xpath = "(//button[@onclick='switchCity()'])[1]")
        public  WebElement sehirSecDropdown;

       @FindBy (xpath = "//a[@onclick='switchCity()']")
       public  WebElement seciliSehir;
       @FindBy(xpath = "//img[@class='logo']")
       public  WebElement biletiniAlLogo;
       @FindBy(xpath = "(//span[@class='cityName'])[3]")
       public  WebElement bursaSehirSec;

       @FindBy(xpath = "//span[text()='Şehir Değiştir']")
       public  WebElement sehirDegistir;







}
