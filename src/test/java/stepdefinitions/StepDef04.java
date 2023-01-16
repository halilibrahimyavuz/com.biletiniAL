package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.SinemaBiletiAl;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class StepDef04 {

        SinemaBiletiAl sinemaBiletiAl =new SinemaBiletiAl();
        Faker faker=new Faker();
        Actions actions=new Actions(Driver.getDriver());

        @Given("Kullanici bir film secer")
        public void kullanici_bir_film_secer() {
                ReusableMethods.waitFor(2);
                sinemaBiletiAl.rasgeleFilm.click();
                ReusableMethods.waitFor(2);
        }


        @Given("Kullanici BiletiniAl butonuna tiklar")
        public void kullanici_biletini_al_butonuna_tiklar() {
                ReusableMethods.waitFor(2);
                sinemaBiletiAl.sinemaBiletiniAlButonu.click();
                ReusableMethods.waitFor(2);
        }


        @Given("Kullanici Sehir Secer")
        public void kullanici_sehir_secer() {
             //   sinemaBiletiAl.ilSecButonu.click();
                ReusableMethods.waitFor(1);
                sinemaBiletiAl.rasgeleIlSec.click();

        }

        @Given("Kullanici acilan sayfadan bir Sinemaya ait seans secer")
        public void kullanici_acilan_sayfadan_bir_sinemaya_ait_seans_secer() {
                ReusableMethods.waitFor(2);
                sinemaBiletiAl.yarinSecimi.click();
                ReusableMethods.waitFor(2);
                sinemaBiletiAl.seansButonu.click();

        }

        @Given("Kullanici bir koltuk secer")
        public void kullanici_bir_koltuk_secer() {
                ReusableMethods.waitFor(1);
                sinemaBiletiAl.koltukButonu.click();

        }

        @Given("Kullanici Simdi Odeme Yap butonuna tiklar")
        public void kullanici_simdi_odeme_yap_butonuna_tiklar() {
                ReusableMethods.waitFor(1);
                sinemaBiletiAl.simdiOdemeYapButonu.click();

        }
        @Given("Kullanici bilgilerini girer")
        public void kullanici_bilgilerini_girer() {
               String fakerAd=faker.name().firstName();
               String fakerSoyad=faker.name().lastName();
               String fakerGsm=faker.phoneNumber().phoneNumber();

                sinemaBiletiAl.adTextBox.sendKeys(fakerAd);
                ReusableMethods.waitFor(2);

                sinemaBiletiAl.soyadTextBox.sendKeys(fakerSoyad);
                ReusableMethods.waitFor(2);

               sinemaBiletiAl.telefonTextBox.sendKeys(ConfigReader.getProperty("KayitliGSM"));
                ReusableMethods.waitFor(2);

                sinemaBiletiAl.emailTextBox.sendKeys(ConfigReader.getProperty("KayitliEmail"));

        }
        @Given("Kullanici Odeme bilgilerini girer")
        public void kullanici_odeme_bilgilerini_girer() {
                ReusableMethods.waitFor(2);
                sinemaBiletiAl.kartUstundekiIsim.sendKeys("Akbank");
                sinemaBiletiAl.kartNumarasi.sendKeys(ConfigReader.getProperty("AkbankKartNo"));
                Select select=new Select(sinemaBiletiAl.ayDropdown);
                select.selectByVisibleText(ConfigReader.getProperty("AkbankAy"));

                ReusableMethods.waitFor(2);

                select=new Select(sinemaBiletiAl.yilDropdown);
                select.selectByVisibleText(ConfigReader.getProperty("AkbankYil"));

                ReusableMethods.waitFor(2);
                sinemaBiletiAl.guvenlikKodu.sendKeys(ConfigReader.getProperty("AkbankCVC"));
                ReusableMethods.waitFor(4);
                      }

        @Given("Kullanici Kullanim sartlarini okudum butonuna tiklar")
        public void kullanici_kullanim_sartlarini_okudum_butonuna_tiklar() {
                ReusableMethods.waitFor(2);

                JavascriptExecutor executor = (JavascriptExecutor)Driver.getDriver();
                executor.executeScript("arguments[0].click();", sinemaBiletiAl.kullanimSartlariButonu);
                ReusableMethods.waitFor(4);
              //  sinemaBiletiAl.kullanimSartlariButonu.click();

        }
        @Given("Kullanici Odeme Yap butonuna tiklar")
        public void kullanici_odeme_yap_butonuna_tiklar() {
                ReusableMethods.waitFor(2);
                sinemaBiletiAl.odemeYapButonu.click();
                ReusableMethods.waitFor(16);

        }

        @Given("Kullanici odeme ekranina geldigini dogrular")
        public void kullanici_odeme_ekranina_geldigini_dogrular() {
             ReusableMethods.waitFor(10);
             Assert.assertTrue(sinemaBiletiAl.güvenliOdemeEkraniOnaylaButonu.isDisplayed());

        }




}
