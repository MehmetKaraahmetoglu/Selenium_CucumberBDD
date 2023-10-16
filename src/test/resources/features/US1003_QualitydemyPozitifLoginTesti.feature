Feature: U1003 kullanici gecerli bilgilerle sayfaya giris yapar
  Scenario: TC05 qualitydemy poztif login testi

    Given kullanici "qdUrl" anasayfaya gider
    Then ilk login linkine tiklar
    And username kutusuna "qdGecerliEmail" yazar
    And password kutusuna "qdGecerliPassword" yazar
    And 2 saniye bekler
    And cookiesleri kabul eder
    And 2 saniye bekler
    And login butonuna basar
    Then basarili giris yapildigini test eder
    And sayfayi kapatir