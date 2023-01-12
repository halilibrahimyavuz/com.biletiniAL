package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.UyeOl;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class StepDef01 {

        UyeOl uyeOl=new UyeOl();
        Faker faker=new Faker();
        Actions actions=new Actions(Driver.getDriver());

    @Given("Kullanici {string} e gider")
    public void kullanici_e_gider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));


    }
    @Given("Kullanici Anasayfadaki uye Ol butonuna tiklar")
    public void kullanici_anasayfadaki_uye_ol_butonuna_tiklar() {

        ReusableMethods.waitFor(1);
        uyeOl.anasayfaUyeOlButonu.click();
    }

   
        @Given("Kullanici Adi textbox a {string} girer")
        public void kullanici_Adi_textbox_a_girer(String GecerliAdi) {

            System.out.println("*******");
            uyeOl.adiTextBox.sendKeys(ConfigReader.getProperty(GecerliAdi));
            System.out.println("GecerliAdi = " + ConfigReader.getProperty(GecerliAdi));

        }

//   @Given("Kullanici adi textbox a GecersizAdi girer")
//   public void kullanici_adi_textbox_a_gecersiz_adi_girer() {

//       uyeOl.adiTextBox.sendKeys(ConfigReader.getProperty("GecerliAdi"));
//   }


    @Given("Kullanici adi textbox a {string} girer")
    public void kullanici_adi_textbox_a_girer(String string) {
        uyeOl.adiTextBox.sendKeys(ConfigReader.getProperty("GecersizAdi"));
    }



    @Given("Kullanici Soyadi textbox a {string} girer")
    public void kullanici_Soyadi_textbox_a_girer(String GecerliSoyadi) {
        uyeOl.soyadiTextBox.sendKeys(ConfigReader.getProperty(GecerliSoyadi));
        System.out.println("GecerliSoyadi = " + ConfigReader.getProperty(GecerliSoyadi));
    }

    @Given("Kullanici soyadi textbox a {string} girer")
    public void kullanici_soyadi_textbox_a_girer(String GecersizSoyadi) {
        uyeOl.soyadiTextBox.sendKeys(ConfigReader.getProperty(GecersizSoyadi));

    }

    @Given("Kullanici E-Mail textbox a {string} adresi girer")
    public void kullanici_e_mail_textbox_a_adresi_girer(String string) {
        uyeOl.eMailTextBox.click();
        ReusableMethods.waitFor(2);
        String FakerGecerliEmail=faker.internet().emailAddress();
        uyeOl.eMailTextBox.sendKeys(FakerGecerliEmail);
    }

    @Given("Kullanici Telefon numarasi textbox a {string} girer")
    public void kullanici_telefon_numarasi_textbox_a_girer(String String) {
        uyeOl.gsmTextBox.click();
        ReusableMethods.waitFor(2);

        String FakerGSM=faker.phoneNumber().phoneNumber();
        uyeOl.gsmTextBox.sendKeys(FakerGSM);
    }

    @Given("Kullanici Telefon numarasi Textbox a {string} girer")
    public void kullanici_telefon_numarasi_Textbox_a_girer(String GecersizGSM) {
        uyeOl.gsmTextBox.sendKeys(ConfigReader.getProperty("GecersizGSM"));
        ReusableMethods.waitFor(3);
        System.out.println("GecersizGSM = " + ConfigReader.getProperty("GecersizGSM"));

    }



    @Given("Kullanici Sehir dropdownundan bir sehir secer")
    public void kullanici_sehir_dropdownundan_bir_sehir_secer() {
        ReusableMethods.waitFor(2);
        Select select=new Select(uyeOl.sehirDropDown);
        select.selectByVisibleText("Antalya");
    }


    @Given("Kullanici Sifre textbox a {string} girer")
    public void kullanici_sifre_textbox_a_girer(String GecerliSifre) {
        uyeOl.sifreTextBox.click();
        ReusableMethods.waitFor(2);
        uyeOl.sifreTextBox.sendKeys(ConfigReader.getProperty(GecerliSifre));

    }


    @Given("Kullanici Sifre Tekrar textbox a {string} girer")
    public void kullanici_sifre_tekrar_textbox_a_girer(String GecerliSifre) {
        uyeOl.sifreTekrarTExtBox.click();
        ReusableMethods.waitFor(2);
        uyeOl.sifreTekrarTExtBox.sendKeys(ConfigReader.getProperty(GecerliSifre));
        uyeOl.passwordEyeButton.click();
    }

    @Given("Kullanici Biletinial.com Uyelik butonuna tiklar")
    public void kullanici_biletinial_com_uyelik_butonuna_tiklar() {

        uyeOl.uyelikButonu.click();
        ReusableMethods.waitFor(2);
    }


    @Given("Kullanici Uye Ol butonuna tiklar")
    public void kullanici_uye_ol_butonuna_tiklar() {

        uyeOl.uyeOlButonu.click();
    }



    @Given("Kullanici basarili uye oldugunda Anasayfaya yonlendigi dogrulanmalidir")
    public void kullanici_basarili_uye_oldugunda_anasayfaya_yonlendigi_dogrulanmalidir() {
        String expectedURL="https://biletinial.com/";
        System.out.println("expectedURL = " + expectedURL);
        ReusableMethods.waitFor(1);

        String actualURL=Driver.getDriver().getCurrentUrl();
        System.out.println("actualURL = " + actualURL);
        ReusableMethods.waitFor(1);

        Assert.assertEquals(expectedURL,actualURL);
        ReusableMethods.waitFor(4);


    }

    //TC02 ----------------------------------------------------------------------

    @Given("Kullanici alt kisimda ad alani gecersiz yazisinin gorundugunu dogrulamalidir.")
    public void kullanici_alt_kisimda_ad_alani_gecersiz_yazisinin_gorundugunu_dogrulamalidir() {
        String expectedHataTextAd=uyeOl.uyeOlSayfasiHataText.getText();
        System.out.println("expectedHataText = " + expectedHataTextAd);

        String actualHataTextAd="ad alanı geçersiz : \"Test123\"";
        System.out.println("actualHataText = " + actualHataTextAd);

        ReusableMethods.waitFor(1);
        Assert.assertTrue(actualHataTextAd.contains(expectedHataTextAd));
    }

    //TC03--------------------------------------------------------

    @Given("Kullanici alt kisimda soyad alani gecersiz yazisinin gorundugunu dogrulamalidir.")
    public void kullanici_alt_kisimda_soyad_alani_gecersiz_yazisinin_gorundugunu_dogrulamalidir() {
        String expectedHataTextSoyad=uyeOl.uyeOlSayfasiHataText.getText();
        System.out.println("expectedHataTextSoyad = " + expectedHataTextSoyad);

        String actualHataTextSoyad="soyad alanı geçersiz : \"Test123\"";
        System.out.println("actualHataTextSoyad = " + actualHataTextSoyad);

        ReusableMethods.waitFor(1);
        Assert.assertTrue(actualHataTextSoyad.equals(expectedHataTextSoyad));


    }


    //TC04----------------------------------------------------------------------------


    @Given("Kullanici E-Mail textbox a {string} adresini girer")
    public void kullanici_e_mail_textbox_a_adresini_girer(String GecersizEmail) {
        uyeOl.eMailTextBox.click();
        ReusableMethods.waitFor(2);
        uyeOl.eMailTextBox.sendKeys(ConfigReader.getProperty(GecersizEmail));



    }

    @Given("Kullanici e-mail bolumunden uyari popupinin ciktigini dogrulamalidir.")
    public void kullanici_e_mail_bolumunden_uyari_popupinin_ciktigini_dogrulamalidir() {
        String expectedURL="https://biletinial.com/WebLogin/Register?lang=tr";
        System.out.println("expectedURL = " + expectedURL);
        ReusableMethods.waitFor(1);


        String actualURL="https://biletinial.com/";
        System.out.println("actualURL = " + actualURL);
        ReusableMethods.waitFor(1);

        Assert.assertFalse(expectedURL.equals(actualURL));
        ReusableMethods.waitFor(1);
    }


 //TC05 -----------------------------------------------------------------------------

    @Given("Kullanici E-Mail textbox kismina {string} adresi girer")
    public void kullanici_e_mail_textbox_kismina_adresi_girer(String GecerliEmail) {

        uyeOl.eMailTextBox.click();
        ReusableMethods.waitFor(1);
        uyeOl.eMailTextBox.sendKeys(ConfigReader.getProperty(GecerliEmail));
    }


    @Given("Kullanici en altta E-posta adresi kullanimda yazisinin gorundugunu dogrulamalidir.")
    public void kullanici_en_altta_e_posta_adresi_kullanimda_yazisinin_gorundugunu_dogrulamalidir() {
        String expectedEpostaKullanimdaHatasi=uyeOl.uyeOlSayfasiHataText.getText();
        System.out.println("expectedEpostaKullanımdaHatası = " + expectedEpostaKullanimdaHatasi);

        String actualEpostaKullanimdaHatasi="E-posta adresi kullanımda!";
        System.out.println("actualEpostaKullanımdaHatası = " + actualEpostaKullanimdaHatasi);

        Assert.assertTrue(actualEpostaKullanimdaHatasi.contains(expectedEpostaKullanimdaHatasi));


    }

     //TC06-------------------------------------------------------------
    @Given("Kullanici basarili uye olma islemi yapamadigi dogrulanmalidir.")
    public void kullanici_basarili_uye_olma_islemi_yapamamalidir() {
        String expectedURL="https://biletinial.com/";
        System.out.println("expectedURL = " + expectedURL);
        ReusableMethods.waitFor(1);

        String actualURL=Driver.getDriver().getCurrentUrl();

        System.out.println("actualURL = " + actualURL);
        ReusableMethods.waitFor(1);

        Assert.assertNotEquals(expectedURL,actualURL);
        ReusableMethods.waitFor(5);


    }

    //   TC07-------------------------------------------------------------------
    @Given("Kullanici Sehir sekmesini BOS birakir.")
    public void kullanici_sehir_sekmesini_bos_birakir() {
      uyeOl.sehirDropDown.click();

    }

    //      TC08------------------------------------------------

    @Given("Kullanici Sifre textboxina {string} girer")
    public void kullanici_sifre_textboxina_girer(String GecersizSifre) {
        ReusableMethods.waitFor(2);
            uyeOl.sifreTextBox.sendKeys(GecersizSifre);


    }

    @Given("Kullanici Sifre Tekrar textboxina {string} girer")
    public void kullanici_sifre_tekrar_textboxina_girer(String GecersizSifreTekrar) {
        ReusableMethods.waitFor(2);
        uyeOl.sifreTekrarTExtBox.sendKeys(GecersizSifreTekrar);
        ReusableMethods.waitFor(2);
        uyeOl.passwordEyeButton.click();
    }

        //     TC09--------------------------------------------------------------------------------

    @Given("Kullanici Biletinial.com Uyelik butonuna tiklamadan gecer")
    public void kullanici_biletinial_com_uyelik_butonuna_tiklamadan_gecer() {
        actions.sendKeys(Keys.TAB).perform();
        // Assert.assertTrue(uyeOl.uyelikButonu.isDisplayed());
    }

        //TC10       ------------------------------------------------------------------------------

    @Given("Kullanici sayfanin en altindaki Zaten uyeyim! Giris Yap butonuna tiklar.")
    public void kullanici_sayfanin_en_altindaki_zaten_uyeyim_giris_yap_butonuna_tiklar() {

        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
        uyeOl.zatenUyeyimButonu.click();

    }

    @Given("Kullanici Oturum Ac sayfasina yonlenmelidir.")
    public void kullanici_oturum_ac_sayfasina_yonlenmelidir() {
        String expectedURL="https://biletinial.com/WebLogin?lang=tr";
        System.out.println("expectedURL = " + expectedURL);
        ReusableMethods.waitFor(1);


        String actualURL=Driver.getDriver().getCurrentUrl();
        System.out.println("actualURL = " + actualURL);
        ReusableMethods.waitFor(1);

        Assert.assertEquals(expectedURL,actualURL);
        ReusableMethods.waitFor(1);
       // https://biletinial.com/WebLogin?lang=tr

    }


}
