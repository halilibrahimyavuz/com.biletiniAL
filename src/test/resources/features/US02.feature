
        @us2  @sirali   @paralel2
       Feature: US02 Kullanici Giris İslemleri

           @us2tc1
        Scenario: TC01  Kullanici basarili uye girisi yapabilmelidir
          * Kullanici "url" e gider
          * Kullanici Anasayfadaki Giris Yap butonuna tiklar
          * Kullanici email textboxa "GecerliEmail" girer
          * Kullanici Sifre bolumune "GecerliSifre" girer.
          * Kullanici Giris Yap butonuna tiklar
          * Kullanici basarili uye oldugunda Anasayfaya Login olarak yonlendigi dogrulanmalidir

        @us2tc2
        Scenario: TC02 Kullanici Gecersiz E-mail ile giris yapamamalidir
          * Kullanici "url" e gider
          * Kullanici Anasayfadaki Giris Yap butonuna tiklar
          * Kullanici email textboxa "GecersizEmail" girer
          * Kullanici Sifre bolumune "GecerliSifre" girer.
          * Kullanici Giris Yap butonuna tiklar
          * Kullanici basarili uye girisi yapamadigi dogrulanmalidir.


          @us2tc3
          Scenario: TC03 Kullanici GEcersiz Sifre ile giris yapamamalidir
          * Kullanici "url" e gider
          * Kullanici Anasayfadaki Giris Yap butonuna tiklar
          * Kullanici email textboxa "GecerliEmail" girer
          * Kullanici Sifre bolumune "GecersizSifre" girer.
          * Kullanici Giris Yap butonuna tiklar
          * Kullanici Hatali kullanici adi veya sifre yazili popupi dogrulamalidir

            @us2tc4
            Scenario: TC04 Kullanici Sistemde kayitli olmayan E-mail ile giris yapamamalidir
          * Kullanici "url" e gider
          * Kullanici Anasayfadaki Giris Yap butonuna tiklar
          * Kullanici email textboxa sistemde kayitli olmayan bir email girer.
          * Kullanici Sifre bolumune "GecerliSifre" girer.
          * Kullanici Giris Yap butonuna tiklar
          * Kullanici E-mail adresine sahip kullanici bulunamadi uyarisi verdigini dogrular

              @us2tc5
              Scenario:  TC05 Kullanici "GecersizEmail" ve "GecersizSifre" girerek sisteme giris yapamamalidir
          * Kullanici "url" e gider
          * Kullanici Anasayfadaki Giris Yap butonuna tiklar
          * Kullanici email textboxa "GecersizEmail" girer
          * Kullanici Sifre bolumune "GecersizSifre" girer.
          * Kullanici Giris Yap butonuna tiklar
          * Kullanici basarili uye girisi yapamadigi dogrulanmalidir.

                @us2tc6
             Scenario:  TC06 Kullanici Hemen Uye ol butonuna tiklayinca gerekli sayfaya yonlenmelidir
          * Kullanici "url" e gider
          * Kullanici Anasayfadaki Giris Yap butonuna tiklar
          * Kullanici Hemen Uye Ol butonuna tiklar
          * Kullanici Hemen Uye Ol sayfasina yonlendigini dogrulamalidir


                @us2tc7
                Scenario: TC07 Kullanici Sifremi Unuttum butonuna basinca ilgili sayfaya yonlenmelidir
          * Kullanici "url" e gider
          * Kullanici Anasayfadaki Giris Yap butonuna tiklar
          * Kullanici Sifremi Unuttum butonuna tiklar
          * Kullanici Sifremi Unuttum sayfasina yonlendigini dogrulamalidir

                  @us2tc8
              Scenario: TC08 Kullanici Sifresini unutunca yeni sifre alabilmelidir
          * Kullanici "url" e gider
          * Kullanici Anasayfadaki Giris Yap butonuna tiklar
          * Kullanici Sifremi Unuttum butonuna tiklar
          * Kullanici Sifremi Unuttum sayfasindaki Email textbox a "KayitliEmail" girer
          * Kullanici Gonder butonuna tiklar
          * Kullanici Sifre sifirlama sayfasina yonlendigini dogrular


                @us2tc9
              Scenario: TC09 Kullanici Uyeliksiz Devam Et butonuna basinca ilgili sayfaya yonlenmelidir
          * Kullanici "url" e gider
          * Kullanici Anasayfadaki Giris Yap butonuna tiklar
          * Kullanici Uyeliksiz Devam Et butonuna tiklar
          * Kullanici Anasayfaya yonlendigini dogrular