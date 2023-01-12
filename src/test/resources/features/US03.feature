

     @us3  @sıralı
    Feature: US03 Kullanici Anasayfaki dropdowlarin calistigini dogrular

      Background: BiletiniAl anasayfaya gitmek
        * Kullanici "url" e gider

        @us3tc1
      Scenario: TC01 Kullanici Sinema dropdownina tiklayinca ilgili sayfaya yonlenmelidir.
        * Kullanici Anasayfadaki Sinema dropdowna tiklar
        * Kullanici Sinema sayfasina yonledigini dogrular.


      @us3tc2
      Scenario: TC02 Kullanici Tiyatro dropdownina tiklayinca ilgili sayfaya yonlenmelidir.
        * Kullanici Anasayfadaki Tiyatro dropdowna tiklar
        * Kullanici Tiyatro sayfasina yonledigini dogrular.

      @us3tc3
      Scenario: TC03 Kullanici Muzik dropdownina tiklayinca ilgili sayfaya yonlenmelidir.
        * Kullanici Anasayfadaki Muzik dropdowna tiklar
        * Kullanici Muzik sayfasina yonledigini dogrular.

      @us3tc4
      Scenario: TC04 Kullanici Spor dropdownina tiklayinca ilgili sayfaya yonlenmelidir.
        * Kullanici Anasayfadaki Spor dropdowna tiklar
        * Kullanici Spor sayfasina yonledigini dogrular.

      @us3tc5
      Scenario: TC05 Kullanici Kultur ve Turizm Bakanligi dropdownina tiklayinca ilgili sayfaya yonlenmelidir.
        * Kullanici Anasayfadaki Kultur ve Turizm Bakanligi dropdowna tiklar
        * Kullanici Bakanligin sayfasina yonledigini dogrular.

      @us3tc6
      Scenario: TC06 Kullanici Sehire Ozel Etkinlikler butonuna tiklayinca ilgili sayfaya yonlenmelidir.
     * Kullanici Anasayfadaki Sehire Ozel Etkinlikler butonuna tiklar
     * Kullanici Sehire Ozel Etkinlik sayfaya yonledigini dogrular.


      @us3tc7
      Scenario: TC07 Kullanici Sehir Sec dropdownina tiklayip sehir secebilmeldiir.
     * Kullanici Anasayfadaki Sehir Sec dropdowna tiklar
     * Kullanici acilan dropdowndan sectigi sehrin ustune tiklar
     * Kullanici anasayfadaki Sehir Sec dropdown yerinde sectigi sehrin yazdigini dogrular


      @us3tc8
        Scenario: TC08 Kullanici Sehir sectikten sonra iptal edebilmeldir

      * Kullanici Anasayfadaki Sehir Sec dropdowna tiklar
      * Kullanici acilan dropdowndan sectigi sehrin iptal edebilmelidir
      * Kullanici anasayfadaki Sehir Sec dropdown yerinde Sehir yazmadigini dogrular



      @us3tc9
        Scenario: TC09 Kullanici BiletiniAl dropdownina basinca Anasayfaya yonlenmelidir.
      * Kullanici Anasayfadaki biletinial butonuna tiklar
      * Kullanici Anasayfaya yonlendigini dogrular

