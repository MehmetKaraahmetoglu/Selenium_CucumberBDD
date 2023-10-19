Feature: US1014 Amazon Testleri
  @wip
  Scenario:TC18 dropdown testi
    Given kullanici "amazonUrl" anasayfaya gider
    Then Arama kutusunun solundaki dropdown menuyu handle edin
    And dropdown menudeki opsiyonlari liste olarak yazdirin
    Then dropdown menude 28 eleman olduğunu test edin
