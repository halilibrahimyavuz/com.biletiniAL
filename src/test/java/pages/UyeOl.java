package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UyeOl {
    public UyeOl(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//a[@href='/WebLogin/Register?lang=tr']")
    public WebElement anasayfaUyeOlButonu;

    @FindBy (xpath = "//input[@placeholder='Adı']")
    public WebElement adiTextBox;

    @FindBy (xpath = "//input[@placeholder='Soyadı']")
    public WebElement soyadiTextBox;

    @FindBy (xpath = "//input[@name='Email']")
    public WebElement eMailTextBox;

    @FindBy (xpath = "//input[@type='tel']")
    public WebElement gsmTextBox;

    @FindBy (xpath = "//div[@class='inputLine selectLine mb-10']//select")
    public WebElement sehirDropDown;

    @FindBy (xpath = "//input[@id='Password']")
    public WebElement sifreTextBox;

    @FindBy (xpath = "//input[@id='PasswordApprove']")
    public WebElement sifreTekrarTExtBox;

    @FindBy (xpath = "//input[@id='KullSart']")
    public WebElement uyelikButonu;

    @FindBy (xpath = "//button[text()='Üye Ol']")
    public WebElement uyeOlButonu;

    @FindBy (xpath = "//div[@id='divRegisterError']")
    public WebElement uyeOlSayfasiHataText;

    @FindBy (xpath = "//a[@href='/WebLogin?lang=tr']")
    public WebElement zatenUyeyimButonu;

  @FindBy (xpath = "(//*[@class='openEye passwordEye'])[2]")
    public WebElement passwordEyeButton;



















}
