package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Login {

    public Login(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


   @FindBy(xpath = "//a[@href='/WebLogin?lang=tr']")
   public WebElement  anasayfaLoginButonu;

    @FindBy(xpath = "//input[@name='UserName']")
    public WebElement  eMailTextBox;

    @FindBy(xpath = "//input[@name='Password']")
    public WebElement  passwordTextBox;

    @FindBy(xpath = "//button[@class='mt-10']")
    public WebElement  girisYapButonu;

    @FindBy(xpath = "//div[@id='notice']")
    public WebElement  hataliSifrePopup;

    @FindBy(xpath = "//a[text()='Hemen Üye Ol']")
    public WebElement  hemenUyeOlButonu;

    @FindBy(xpath = "//a[text()='Şifremi Unuttum']")
    public WebElement  sifremiUnuttumButonu;

    @FindBy (xpath = "//span[@class='mb-20']")
    public WebElement sayfaText;

    @FindBy (xpath ="//input[@placeholder='Email *']")
    public WebElement sifreUnuttumEmailTextBox;


    @FindBy (xpath ="(//button[@type='submit'])[2]")
    public WebElement gonderButonu;

    @FindBy (xpath ="//h1[text()=' Şifre sıfırlama talebiniz']")
    public WebElement sifreSifirlamaTalebiText;

    @FindBy (xpath ="//a[text()='Ana Sayfaya Git']")
    public WebElement anasayfayaGitButonu;

    @FindBy (xpath ="//button[@type='button']")
    public WebElement yandexGirisYapButonu;

    @FindBy (xpath ="//input[@type='text']")
    public WebElement yandexEmailTextBox;

    @FindBy (xpath ="//button[@id='passp:sign-in']")
    public WebElement yandexİleriButonu;

    @FindBy (xpath ="//input[@id='passp-field-passwd']")
    public WebElement yandexSifreTExtBox;

    @FindBy (xpath ="//*[@id=\"js-apps-container\"]/div[2]/div[7]/div/div[3]/div[2]/div/main/div[7]/div[1]/div/div/div[3]/div/div[1]/div/div/div/a/div/span[1]/span[2]/span\n")
    public WebElement yandexİlkMail;

     @FindBy (xpath ="//a[@id='mainHolder_linkUyeliksiz']")
     public WebElement uyeliksizDevamEtButonu;









}
