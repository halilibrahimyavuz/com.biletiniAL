
@deneme @us1   @sirali
@paralel1
Feature: US01 Kullanici uyelik islemleri

  @us1tc1
  Scenario: TC01 Kullanici uye olabilmeli
    * Kullanici "url" e gider
    * Kullanici Anasayfadaki uye Ol butonuna tiklar
    * Kullanici Adi textbox a "GecerliAdi" girer
    * Kullanici Soyadi textbox a "GecerliSoyadi" girer
    * Kullanici E-Mail textbox a "GecerliEmail" adresi girer
    * Kullanici Telefon numarasi textbox a "GecerliGSM" girer
    * Kullanici Sehir dropdownundan bir sehir secer
    * Kullanici Sifre textbox a "GecerliSifre" girer
    * Kullanici Sifre Tekrar textbox a "GecerliSifre" girer
    * Kullanici Biletinial.com Uyelik butonuna tiklar
    * Kullanici Uye Ol butonuna tiklar
    * Kullanici basarili uye oldugunda Anasayfaya yonlendigi dogrulanmalidir


  @us1tc2
    Scenario: TC02 Kullanici Gecersiz Ad ile uye olamamalidir
   *  Kullanici "url" e gider
   *  Kullanici Anasayfadaki uye Ol butonuna tiklar
   *  Kullanici adi textbox a "GecersizAdi" girer
   *  Kullanici Soyadi textbox a "GecerliSoyadi" girer
   *  Kullanici E-Mail textbox a "GecerliMail" adresi girer
   *  Kullanici Telefon numarasi textbox a "GecerliGSM" girer
   *  Kullanici Sehir dropdownundan bir sehir secer
   *  Kullanici Sifre textbox a "GecerliSifre" girer
   *  Kullanici Sifre Tekrar textbox a "GecerliSifre" girer
   *  Kullanici Biletinial.com Uyelik butonuna tiklar
   *  Kullanici Uye Ol butonuna tiklar
   *  Kullanici alt kisimda ad alani gecersiz yazisinin gorundugunu dogrulamalidir.


    @us1tc3
    Scenario: TC03 Kullanici Gecersiz Soyad ile uye olamamalidir
    *  Kullanici "url" e gider
    *  Kullanici Anasayfadaki uye Ol butonuna tiklar
    *  Kullanici Adi textbox a "GecerliAdi" girer
    *  Kullanici soyadi textbox a "GecersizSoyadi" girer
    *  Kullanici E-Mail textbox a "GecerliMail" adresi girer
    *  Kullanici Telefon numarasi textbox a "GecerliGSM" girer
    *  Kullanici Sehir dropdownundan bir sehir secer
    *  Kullanici Sifre textbox a "GecerliSifre" girer
    *  Kullanici Sifre Tekrar textbox a "GecerliSifre" girer
    *  Kullanici Biletinial.com Uyelik butonuna tiklar
    *  Kullanici Uye Ol butonuna tiklar
    *  Kullanici alt kisimda soyad alani gecersiz yazisinin gorundugunu dogrulamalidir.

      @us1tc4
      Scenario: TC04 Kullaniici Gecersiz E-mail ile uye olamamalidir
    *  Kullanici "url" e gider
    *  Kullanici Anasayfadaki uye Ol butonuna tiklar
    *  Kullanici Adi textbox a "GecerliAdi" girer
    *  Kullanici Soyadi textbox a "GecerliSoyadi" girer
    *  Kullanici E-Mail textbox a "GecersizEmail" adresini girer
    *  Kullanici Telefon numarasi textbox a "GecerliGSM" girer
    *  Kullanici Sehir dropdownundan bir sehir secer
    *  Kullanici Sifre textbox a "GecerliSifre" girer
    *  Kullanici Sifre Tekrar textbox a "GecerliSifre" girer
    *  Kullanici Biletinial.com Uyelik butonuna tiklar
    *  Kullanici Uye Ol butonuna tiklar
    *  Kullanici e-mail bolumunden uyari popupinin ciktigini dogrulamalidir.

        @us1tc5
        Scenario: TC05 Kullanici sistemde kayitli e-posta adresi ile uye olamamalidir.
     *  Kullanici "url" e gider
     *  Kullanici Anasayfadaki uye Ol butonuna tiklar
     *  Kullanici Adi textbox a "GecerliAdi" girer
     *  Kullanici Soyadi textbox a "GecerliSoyadi" girer
     *  Kullanici E-Mail textbox kismina "GecerliEmail" adresi girer
     *  Kullanici Telefon numarasi textbox a "GecerliGSM" girer
     *  Kullanici Sehir dropdownundan bir sehir secer
     *  Kullanici Sifre textbox a "GecerliSifre" girer
     *  Kullanici Sifre Tekrar textbox a "GecerliSifre" girer
     *  Kullanici Biletinial.com Uyelik butonuna tiklar
     *  Kullanici Uye Ol butonuna tiklar
     *  Kullanici en altta E-posta adresi kullanimda yazisinin gorundugunu dogrulamalidir.


    @us1tc6
       Scenario: Kullanici GSM bolumune eksik numara girerek uye olamamalidir.
     *  Kullanici "url" e gider
     *  Kullanici Anasayfadaki uye Ol butonuna tiklar
     *  Kullanici Adi textbox a "GecerliAdi" girer
     *  Kullanici Soyadi textbox a "GecerliSoyadi" girer
     *  Kullanici E-Mail textbox a "GecerliMail" adresi girer
     *  Kullanici Telefon numarasi Textbox a "GecersizGSM" girer
     *  Kullanici Sehir dropdownundan bir sehir secer
     *  Kullanici Sifre textbox a "GecerliSifre" girer
     *  Kullanici Sifre Tekrar textbox a "GecerliSifre" girer
     *  Kullanici Biletinial.com Uyelik butonuna tiklar
     *  Kullanici Uye Ol butonuna tiklar
     * Kullanici basarili uye olma islemi yapamadigi dogrulanmalidir.


      @us1tc7
      Scenario: Kullanici Sehir secmeden uye olabilmelidir.
   *  Kullanici "url" e gider
   *  Kullanici Anasayfadaki uye Ol butonuna tiklar
   *  Kullanici Adi textbox a "GecerliAdi" girer
   *  Kullanici Soyadi textbox a "GecerliSoyadi" girer
   *  Kullanici E-Mail textbox a "GecerliEmail" adresi girer
   *  Kullanici Telefon numarasi textbox a "GecerliGSM" girer
   *  Kullanici Sehir sekmesini BOS birakir.
   *  Kullanici Sifre textbox a "GecerliSifre" girer
   *  Kullanici Sifre Tekrar textbox a "GecerliSifre" girer
   *  Kullanici Biletinial.com Uyelik butonuna tiklar
   *  Kullanici Uye Ol butonuna tiklar
   *  Kullanici basarili uye oldugunda Anasayfaya yonlendigi dogrulanmalidir


        @us1tc8
        Scenario Outline: Kullanici uygun kosullari saglamayan sifre ile uye olamamalidir.

     *  Kullanici "url" e gider
     *  Kullanici Anasayfadaki uye Ol butonuna tiklar
     *  Kullanici Adi textbox a "GecerliAdi" girer
     *  Kullanici Soyadi textbox a "GecerliSoyadi" girer
     *  Kullanici E-Mail textbox a "GecerliEmail" adresi girer
     *  Kullanici Telefon numarasi textbox a "GecerliGSM" girer
     *  Kullanici Sehir dropdownundan bir sehir secer
     *  Kullanici Sifre textboxina "<GecersizSifre>" girer
     *  Kullanici Sifre Tekrar textboxina "<GecersizSifreTekrar>" girer
     *  Kullanici Biletinial.com Uyelik butonuna tiklar
     *  Kullanici Uye Ol butonuna tiklar
     *  Kullanici basarili uye olma islemi yapamadigi dogrulanmalidir.
              Examples:
            | GecersizSifre |GecersizSifreTekrar|
            |Ee55++!|Ee55++!|
            | aaa111===  | aaa111=== |
            | AAA222???  | AAA222??? |
           | BBBbbb///  |BBBbbb///  |
            | Dd4&       |Dd4&       |



      @us1tc9
          Scenario: TC09 Kullanici Uyelik Sozlesmesini butonuna tiklamadan uye olamamalidir.
       *  Kullanici "url" e gider
       *  Kullanici Anasayfadaki uye Ol butonuna tiklar
       *  Kullanici Adi textbox a "GecerliAdi" girer
       *  Kullanici Soyadi textbox a "GecerliSoyadi" girer
       *  Kullanici E-Mail textbox a "GecerliMail" adresi girer
       *  Kullanici Telefon numarasi textbox a "GecerliGSM" girer
       *  Kullanici Sehir dropdownundan bir sehir secer
       *  Kullanici Sifre textbox a "GecerliSifre" girer
       *  Kullanici Sifre Tekrar textbox a "GecerliSifre" girer
       *  Kullanici Biletinial.com Uyelik butonuna tiklamadan gecer
       *  Kullanici Uye Ol butonuna tiklar
       *  Kullanici basarili uye olma islemi yapamadigi dogrulanmalidir.


        @us1tc10
        Scenario: TC10 Kullanici Zaten uyeyim butonuna tiklayinca oturum ac sayfasina yonlenir.
         *  Kullanici "url" e gider
         *  Kullanici Anasayfadaki uye Ol butonuna tiklar
         *  Kullanici sayfanin en altindaki Zaten uyeyim! Giris Yap butonuna tiklar.
         *  Kullanici Oturum Ac sayfasina yonlenmelidir.



