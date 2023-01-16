package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WindowType;
import pages.Login;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class StepDef02 {


        Login login=new Login();
        Faker faker=new Faker();

    @Given("Kullanici Anasayfadaki Giris Yap butonuna tiklar")
    public void kullanici_anasayfadaki_giris_yap_butonuna_tiklar() {
            login.anasayfaLoginButonu.click();
            ReusableMethods.waitFor(1);

    }
    @Given("Kullanici email textboxa {string} girer")
    public void kullanici_email_textboxa_girer(String GecerliEmail) {
            login.eMailTextBox.sendKeys(ConfigReader.getProperty(GecerliEmail));
           ReusableMethods.waitFor(1);

    }



    @Given("Kullanici Sifre bolumune {string} girer.")
    public void kullanici_sifre_bolumune_girer(String GecerliSifre) {
        login.passwordTextBox.sendKeys(ConfigReader.getProperty(GecerliSifre));
        ReusableMethods.waitFor(1);

    }
    @Given("Kullanici Giris Yap butonuna tiklar")
    public void kullanici_giris_yap_butonuna_tiklar() {
            login.girisYapButonu.click();
            ReusableMethods.waitFor(1);

    }

    @Given("Kullanici basarili uye oldugunda Anasayfaya Login olarak yonlendigi dogrulanmalidir")
    public void kullanici_basarili_uye_oldugunda_anasayfaya_Login_olarak_yonlendigi_dogrulanmalidir() {

        String expectedURL="https://biletinial.com/?cityId=23";
        System.out.println("expectedURL = " + expectedURL);
        ReusableMethods.waitFor(1);

        String actualURL=Driver.getDriver().getCurrentUrl();
        System.out.println("actualURL = " + actualURL);
        ReusableMethods.waitFor(1);

        Assert.assertEquals(expectedURL,actualURL);
        ReusableMethods.waitFor(4);


    }





    // TC02-----------------------------------------------
    @Given("Kullanici basarili uye girisi yapamadigi dogrulanmalidir.")
    public void kullanici_basarili_uye_girisi_yapamadigi_dogrulanmalidir() {
        String expectedURL="https://biletinial.com/";
        System.out.println("expectedURL = " + expectedURL);
        ReusableMethods.waitFor(1);


        String actualURL= Driver.getDriver().getCurrentUrl();
        System.out.println("actualURL = " + actualURL);
        ReusableMethods.waitFor(1);

        Assert.assertNotEquals(expectedURL, actualURL);
        ReusableMethods.waitFor(1);
    }

    //    TC03  ----------------------------------------------

    @Given("Kullanici Hatali kullanici adi veya sifre yazili popupi dogrulamalidir")
    public void kullanici_hatali_kullanici_adi_veya_sifre_yazili_popupi_dogrulamalidir() {
       String expectedHataliSifre="Hatalı kullanıcı adı veya şifre";
        System.out.println("expectedHataliSifre = " + expectedHataliSifre);

        String actualHataliSifre=login.hataliSifrePopup.getText();
        System.out.println("actualHataliSifre = " + actualHataliSifre);

        Assert.assertEquals(expectedHataliSifre,actualHataliSifre);

    }

    //   TC04 -------------------------------------------------------


    @Given("Kullanici email textboxa sistemde kayitli olmayan bir email girer.")
    public void kullanici_email_textboxa_sistemde_kayitli_olmayan_bir_email_girer() {
        String sistemeKayitsizMail=faker.internet().emailAddress();
        ReusableMethods.waitFor(2);
        System.out.println("sistemeKayitsizMail = " + sistemeKayitsizMail);

        login.eMailTextBox.sendKeys(sistemeKayitsizMail);

    }


    @Given("Kullanici E-mail adresine sahip kullanici bulunamadi uyarisi verdigini dogrular")
    public void kullanici_e_mail_adresine_sahip_kullanici_bulunamadi_uyarisi_verdigini_dogrular() {
        String expectedKayitsizSifre="Bu e-mail adresine sahip kullanıcı bulunamadı!";
        System.out.println("expectedKayitsizSifre = " + expectedKayitsizSifre);
        String actualKayitsizSifre=login.hataliSifrePopup.getText();
        System.out.println("actualKayitsizSifre = " + actualKayitsizSifre);

        Assert.assertEquals(expectedKayitsizSifre,actualKayitsizSifre);
    }

    //  TC06 -----------------------------------------------------------

    @Given("Kullanici Hemen Uye Ol butonuna tiklar")
    public void kullanici_hemen_uye_ol_butonuna_tiklar() {
       login.hemenUyeOlButonu.click();
       ReusableMethods.waitFor(2);


    }
    @Given("Kullanici Hemen Uye Ol sayfasina yonlendigini dogrulamalidir")
    public void kullanici_hemen_uye_ol_sayfasina_yonlendigini_dogrulamalidir() {
        String actualText="Hemen Üye Ol";
        String expectedText=login.sayfaText.getText();
        Assert.assertEquals(expectedText,actualText);


    }

    //   TC07 -------------------------------------------------------

    @Given("Kullanici Sifremi Unuttum butonuna tiklar")
    public void kullanici_sifremi_unuttum_butonuna_tiklar() {
        login.sifremiUnuttumButonu.click();
        ReusableMethods.waitFor(1);
    }
    @Given("Kullanici Sifremi Unuttum sayfasina yonlendigini dogrulamalidir")
    public void kullanici_sifremi_unuttum_sayfasina_yonlendigini_dogrulamalidir() {
        String actualText="Şifremi Unuttum";
        System.out.println("actualText = " + actualText);

        String expectedText=login.sayfaText.getText();
        System.out.println("expectedText = " + expectedText);

        Assert.assertEquals(expectedText,actualText);

    }

    // TC08 ------------------------------------------------

    @Given("Kullanici Sifremi Unuttum sayfasindaki Email textbox a {string} girer")
    public void kullanici_sifremi_unuttum_sayfasindaki_email_textbox_a_girer(String KayitliEmail) {
       login.sifreUnuttumEmailTextBox.sendKeys(ConfigReader.getProperty(KayitliEmail));
       ReusableMethods.waitFor(1);
    }

    @Given("Kullanici Gonder butonuna tiklar")
    public void kullanici_gonder_butonuna_tiklar() {
        login.gonderButonu.click();

    }

    @Given("Kullanici Sifre sifirlama sayfasina yonlendigini dogrular")
    public void kullanici_sifre_sifirlama_sayfasina_yonlendigini_dogrular() {
        String actualText="Şifre sıfırlama talebiniz";
        String expectedText=login.sifreSifirlamaTalebiText.getText();

        Assert.assertEquals(expectedText,actualText);
        ReusableMethods.waitFor(4);

    }

    @Given("Kullanici Ana Sayfaya Git butonuna tiklar")
    public void kullanici_ana_sayfaya_git_butonuna_tiklar() {
        login.anasayfayaGitButonu.click();

    }

    @Given("Kullanici Anasayfaya yonlendigini dogrular")
    public void kullanici_anasayfaya_yonlendigini_dogrular() {
        String expectedURL="https://biletinial.com/";
        System.out.println("expectedURL = " + expectedURL);
        ReusableMethods.waitFor(1);


        String actualURL=Driver.getDriver().getCurrentUrl();
        System.out.println("actualURL = " + actualURL);
        ReusableMethods.waitFor(1);

        Assert.assertEquals(expectedURL,actualURL);
        ReusableMethods.waitFor(1);

    }

   // @Given("Kullanici Mail adresine Yeni Sifreyi gonderildigi dogrular")
   // public void kullanici_mail_adresine_yeni_sifreyi_gonderildigi_dogrular() {
   //     String biletiniAlWindowHandle=Driver.getDriver().getWindowHandle();
   //     System.out.println("biletiniAlWindowHandle = " + biletiniAlWindowHandle);
//
   //     Driver.getDriver().switchTo().newWindow(WindowType.TAB);
   //     ReusableMethods.waitFor(2);
   //     Driver.getDriver().get("https://mail.yandex.com.tr/");
   //     ReusableMethods.waitFor(2);
   //     String mailWindowHandle=Driver.getDriver().getWindowHandle();
   //     System.out.println("mailWindowHandle = " + mailWindowHandle);
//
   //     ReusableMethods.waitFor(1);
   //     login.yandexGirisYapButonu.click();
   //     ReusableMethods.waitFor(1);
   //     login.yandexEmailTextBox.sendKeys("halil.yavuz@biletinial.com");
   //     ReusableMethods.waitFor(2);
   //     login.yandexIleriButonu.click();
//
   //     ReusableMethods.waitFor(2);
   //     login.yandexSifreTExtBox.sendKeys("Hay123456.");
   //     login.yandexIleriButonu.click();
//
   //     String actualText=login.yandexIlkMail.getText();
   //     System.out.println("actualText = " + actualText);
   //     String expectedText="Biletinial";
   //     System.out.println("expectedText = " + expectedText);
//
   //     Assert.assertEquals(expectedText,actualText);
   // }

    //  TC09   ------------------------------------------------------------

    @Given("Kullanici Uyeliksiz Devam Et butonuna tiklar")
    public void kullanici_uyeliksiz_devam_et_butonuna_tiklar() {
            login.uyeliksizDevamEtButonu.click();
    }



}
