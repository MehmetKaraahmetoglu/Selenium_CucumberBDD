package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    /*
    TestNG'de page classlari
    surekli kullandigimiz bir sayfa/webSitesi'nde ki
    locate'leri ve
    ilgili sayfada kullanilacak login gibi basit method'lari icerir.

    TestNG page classlarin'da ki locatelere erisim icin
    Test class'larinda page class'indan obje olusturulmasini benimsemistir.
     */

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(id ="twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement sonucYaziElementi;

    @FindBy(xpath = "(//div[@class='a-section aok-relative s-image-square-aspect'])[1]")
    public WebElement ilkUrunElementi;

    @FindBy(xpath = "//span[@class='a-size-large product-title-word-break']")
    public WebElement ilkUrunIsimElementi;

    @FindBy (xpath = "//select[@id='searchDropdownBox']")
    public WebElement dropDownElement;

    @FindBy(xpath = "(//div[@class='a-section aok-relative s-image-square-aspect'])[2]")
    public WebElement ikinciElement;

    @FindBy(xpath = "//span[@id='productTitle']")
    public WebElement ikinciUrunIsimElementi;

    @FindBy(xpath = "(//*[@class='a-offscreen'])[3]")
    public WebElement ikinciUrunFiyatElementi;

    @FindBy(xpath = "//*[@id='add-to-cart-button']")
    public WebElement addToCard;


}
