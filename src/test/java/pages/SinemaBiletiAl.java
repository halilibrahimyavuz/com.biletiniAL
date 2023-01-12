package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SinemaBiletiAl {

    public SinemaBiletiAl(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//img[@loading]")
    public WebElement rasgeleFilm;

    @FindBy(xpath = "//span[text()='Biletini Al']")
    public WebElement biletiniAlButonu;

  @FindBy(xpath = "//button[@class='biletiniAlLg flex alignCenter justifyCenter']")
    public WebElement sinemaBiletiniAlButonu;


    @FindBy(xpath = "//button[@onclick='showCityPopup(true);']")
    public WebElement ilSecButonu;

    @FindBy(xpath = "//a[@data-val]")
    public WebElement rasgeleIlSec;

  @FindBy (xpath = "(//*[@class='flex fluid alignCenter justifyCenter mobile-dates'])[2]")
  public WebElement yarınSecimi;

    @FindBy (xpath = "(//li[@data-timing])[2]")
    public WebElement seansButonu;

    @FindBy (xpath = "//span[@class='koltuk_tek normal-koltuk']")
    public WebElement koltukButonu;

    @FindBy (xpath = "//button[@id='btnBuy']")
    public WebElement simdiOdemeYapButonu;

    @FindBy (xpath = "//input[@id='firstName']")
    public WebElement adTextBox;

    @FindBy (xpath = "//input[@id='lastName']")
    public WebElement soyadTextBox;

    @FindBy (xpath = "//input[@id='email']")
    public WebElement emailTextBox;

    @FindBy (xpath = "//input[@id='gsm']")
    public WebElement telefonTextBox;

    @FindBy (xpath = "//input[@id='cardNameT']")
    public WebElement kartUstundekiIsim;

    @FindBy (xpath = "//input[@id='cardNumberT']")
    public WebElement kartNumarasi;

    @FindBy (xpath = "//select[@id='idAy']")
    public WebElement ayDropdown;

    @FindBy (xpath = "//select[@id='idYil']")
    public WebElement yilDropdown;

    @FindBy (xpath = "//input[@id='cardCvvT']")
    public WebElement guvenlikKodu;

    @FindBy (xpath = "//*[@id='kullSartFk']")
    public WebElement kullanimSartlariButonu;


    @FindBy (xpath = "//button[@id='gobefore']")
    public WebElement odemeYapButonu;

    @FindBy (xpath = "//*[@value='ONAYLA']")
    public WebElement güvenliOdemeEkraniOnaylaButonu;






}
