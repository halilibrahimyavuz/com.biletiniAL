package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.Anasayfa;
import utilities.Driver;
import utilities.ReusableMethods;

public class StepDef03 {

    Faker faker=new Faker();
    Actions actions=new Actions(Driver.getDriver());
    Anasayfa anasayfa=new Anasayfa();



    @Given("Kullanici Anasayfadaki Sinema dropdowna tiklar")
    public void kullanici_anasayfadaki_sinema_dropdowna_tiklar() {
      anasayfa.sinemaDropdown.click();
    }
    @Given("Kullanici Sinema sayfasina yonledigini dogrular.")
    public void kullanici_sinema_sayfasina_yonledigini_dogrular() {
      String actualURLText=Driver.getDriver().getCurrentUrl();
        System.out.println("actualURLText = " + actualURLText);

      String expectedURLText="sinema";
      Assert.assertTrue(actualURLText.contains(expectedURLText));
      ReusableMethods.waitFor(3);
    }


    @Given("Kullanici Anasayfadaki Tiyatro dropdowna tiklar")
    public void kullanici_anasayfadaki_tiyatro_dropdowna_tiklar() {
       anasayfa.tiyatroDropdown.click();
    }
    @Given("Kullanici Tiyatro sayfasina yonledigini dogrular.")
    public void kullanici_tiyatro_sayfasina_yonledigini_dogrular() {
        String actualURLText=Driver.getDriver().getCurrentUrl();
        System.out.println("actualURLText = " + actualURLText);
        String expectedURLText="tiyatro";
        Assert.assertTrue(actualURLText.contains(expectedURLText));
        ReusableMethods.waitFor(3);
    }


    @Given("Kullanici Anasayfadaki Muzik dropdowna tiklar")
    public void kullanici_anasayfadaki_muzik_dropdowna_tiklar() {
       anasayfa.muzikDropdown.click();
    }
    @Given("Kullanici Muzik sayfasina yonledigini dogrular.")
    public void kullanici_muzik_sayfasina_yonledigini_dogrular() {
        String actualURLText=Driver.getDriver().getCurrentUrl();
        System.out.println("actuaMUZIKlURLText = " + actualURLText);

        Assert.assertTrue(actualURLText.contains("muzik"));
        ReusableMethods.waitFor(3);
    }



    @Given("Kullanici Anasayfadaki Spor dropdowna tiklar")
    public void kullanici_anasayfadaki_spor_dropdowna_tiklar() {
       anasayfa.sporDropdown.click();

    }
    @Given("Kullanici Spor sayfasina yonledigini dogrular.")
    public void kullanici_spor_sayfasina_yonledigini_dogrular() {
        String actualURLText=Driver.getDriver().getCurrentUrl();
        System.out.println("actualURLText = " + actualURLText);

        String expectedURLText="spor";
        Assert.assertTrue(actualURLText.contains(expectedURLText));
        ReusableMethods.waitFor(3);
    }



    @Given("Kullanici Anasayfadaki Kultur ve Turizm Bakanligi dropdowna tiklar")
    public void kullanici_anasayfadaki_kultur_ve_turizm_bakanligi_dropdowna_tiklar() {
      anasayfa.kulturBakanligiDropdown.click();
    }
    @Given("Kullanici Bakanligin sayfasina yonledigini dogrular.")
    public void kullanici_bakanligin_sayfasina_yonledigini_dogrular() {
        String actualURLText=Driver.getDriver().getCurrentUrl();
        System.out.println("actualURLText = " + actualURLText);

        String expectedURLText="#";
        Assert.assertTrue(actualURLText.contains(expectedURLText));

        ReusableMethods.waitFor(3);
    }


    @Given("Kullanici Anasayfadaki Sehire Ozel Etkinlikler butonuna tiklar")
    public void kullanici_anasayfadaki_sehire_ozel_etkinlikler_butonuna_tiklar() {
        ReusableMethods.waitFor(2);
        anasayfa.sehirSecDropdown.click();

       anasayfa.bursaSehirSec.click();
        ReusableMethods.waitFor(3);
        anasayfa.sehireOzelEtkinlikler.click();

    }

    @Given("Kullanici Sehire Ozel Etkinlik sayfaya yonledigini dogrular.")
    public void kullanici_sehire_ozel_etkinlik_sayfaya_yonledigini_dogrular() {
        String actualURLText=Driver.getDriver().getCurrentUrl();
        System.out.println("actualURLText = " + actualURLText);

        String expectedURLText="sehrineozel";
        Assert.assertTrue(actualURLText.contains(expectedURLText));
        ReusableMethods.waitFor(3);
    }


    @Given("Kullanici Anasayfadaki Sehir Sec dropdowna tiklar")
    public void kullanici_anasayfadaki_sehir_secdropdowna_tiklar() {

        anasayfa.sehirSecDropdown.click();
    }

    @Given("Kullanici acilan dropdowndan sectigi sehrin ustune tiklar")
    public void kullanici_acilan_dropdowndan_sectigi_sehrin_ustune_tiklar() {
        ReusableMethods.waitFor(2);


        anasayfa.bursaSehirSec.click();
        ReusableMethods.waitFor(3);

    }
    @Given("Kullanici anasayfadaki Sehir Sec dropdown yerinde sectigi sehrin yazdigini dogrular")
    public void kullanici_anasayfadaki_sehir_sec_dropdown_yerinde_sectigi_sehrin_yazdigini_dogrular() {
            String actualText=anasayfa.seciliSehir.getText();
            System.out.println("actualText = " + actualText);

            String expectedText="Bursa";

            Assert.assertTrue(actualText.contains(expectedText));
             ReusableMethods.waitFor(3);
    }

    @Given("Kullanici Anasayfadaki biletinial butonuna tiklar")
    public void kullanici_anasayfadaki_biletinial_butonuna_tiklar() {
        anasayfa.biletiniAlLogo.click();
        Assert.assertTrue(anasayfa.biletiniAlLogo.isDisplayed());

    }

    @Given("Kullanici acilan dropdowndan sectigi sehrin iptal edebilmelidir")
    public void kullanici_acilan_dropdowndan_sectigi_sehrin_iptal_edebilmelidir() {
        ReusableMethods.waitFor(2);


        anasayfa.bursaSehirSec.click();
        ReusableMethods.waitFor(3);

        ReusableMethods.waitFor(2);
        anasayfa.seciliSehir.click();

        ReusableMethods.waitFor(2);
        anasayfa.bursaSehirSec.click();
        Driver.getDriver().navigate().refresh();

    }
    @Given("Kullanici anasayfadaki Sehir Sec dropdown yerinde Sehir yazmadigini dogrular")
    public void kullanici_anasayfadaki_sehir_sec_dropdown_yerinde_sehir_yazmadigini_dogrular() {
        String actualText=anasayfa.sehirDegistir.getText();
        System.out.println("actualText = " + actualText);

        String expectedText="Şehir Değiştir";

        Assert.assertTrue(actualText.contains(expectedText));
        ReusableMethods.waitFor(2);

    }






}
