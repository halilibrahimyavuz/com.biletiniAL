
    @us4   @sirali
    Feature: US04 Kullanici sinema bilet islemleri yapabilmelidir

        @us4tc1
    Scenario: TC01 Kullanici Uye olmadan Sinema bileti alabilmelidir
    * Kullanici "url" e gider
    * Kullanici Anasayfadaki Sinema dropdowna tiklar
    * Kullanici bir film secer
    * Kullanici BiletiniAl butonuna tiklar
    * Kullanici Sehir Secer
    * Kullanici acilan sayfadan bir Sinemaya ait seans secer
    * Kullanici Uyeliksiz Devam Et butonuna tiklar
    * Kullanici bir koltuk secer
    * Kullanici Simdi Odeme Yap butonuna tiklar
    * Kullanici bilgilerini girer
    * Kullanici Odeme bilgilerini girer
    * Kullanici Kullanim sartlarini okudum butonuna tiklar
    * Kullanici Odeme Yap butonuna tiklar
    * Kullanici odeme ekranina geldigini dogrular



    Scenario: TC02 Kullanici Uye girisi yaparak sinema bileti alabilmelidir
    * Kullanici "url" e gider
    * Kullanici Anasayfadaki Sinema dropdowna tiklar
    * Kullanici bir film secer
    * Kullanici BiletiniAl butonuna tiklar
    * Kullanici Sehir Secer
    * Kullanici acilan sayfadan bir Sinemaya ait seans secer
    * Kullanici email textboxa "KayitliEmail" girer
    * Kullanici Sifre bolumune "GecerliSifre" girer.
    * Kullanici Giris Yap butonuna tiklar
    * Kullanici bir koltuk secer
    * Kullanici Simdi Odeme Yap butonuna tiklar
    * Kullanici Odeme bilgilerini girer
    * Kullanici Kullanim sartlarini okudum butonuna tiklar
    * Kullanici Odeme Yap butonuna tiklar
    * Kullanici odeme ekranina geldigini dogrular

