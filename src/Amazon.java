import Myfunc.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com.tr/");

        WebElement cookie = driver.findElement(By.id("a-autoid-0"));
        cookie.click();
        MyFunc.Bekle(2);

        WebElement coksatanlar=driver.findElement(By.linkText("Çok Satanlar"));
        System.out.println("coksatanlar = " + coksatanlar.getText());
        coksatanlar.click();
        MyFunc.Bekle(1);

        WebElement logo1=driver.findElement(By.id("nav-logo-sprites"));
        logo1.click();
        MyFunc.Bekle(1);


        WebElement gununfirsatlari=driver.findElement(By.linkText("Günün Fırsatları"));
        System.out.println("gununfirsatlari = " + gununfirsatlari.getText());
        gununfirsatlari.click();
        MyFunc.Bekle(1);


        WebElement logo2=driver.findElement(By.id("nav-logo-sprites"));
        logo2.click();
        MyFunc.Bekle(1);

        WebElement prime=driver.findElement(By.linkText("Prime"));
        System.out.println("prime = " + prime.getText());
        prime.click();
        MyFunc.Bekle(1);

        WebElement logo3=driver.findElement(By.id("nav-logo-sprites"));
        logo3.click();
        MyFunc.Bekle(1);

        WebElement yenicikanlar=driver.findElement(By.linkText("Yeni Çıkanlar"));
        System.out.println("yenicikanlar = " + yenicikanlar.getText());
        yenicikanlar.click();
        MyFunc.Bekle(1);

        WebElement logo4=driver.findElement(By.id("nav-logo-sprites"));
        logo4.click();
        MyFunc.Bekle(1);

        WebElement hediyefikirleri=driver.findElement(By.linkText("Hediye Fikirleri"));
        System.out.println("hediyefikirleri = " + hediyefikirleri.getText());
        hediyefikirleri.click();
        MyFunc.Bekle(1);

        WebElement logo5=driver.findElement(By.id("nav-logo-sprites"));
        logo5.click();
        MyFunc.Bekle(1);

        WebElement elektronik=driver.findElement(By.partialLinkText("Elektronik"));
        System.out.println("elektronik.getText() = " + elektronik.getText());
        elektronik.click();
        MyFunc.Bekle(1);

        WebElement logo6=driver.findElement(By.id("nav-logo-sprites"));
        logo6.click();
        MyFunc.Bekle(1);

        WebElement moda=driver.findElement(By.linkText("Moda"));
        System.out.println("moda.getText() = " + moda.getText());
        moda.click();
        MyFunc.Bekle(1);

        WebElement logo7=driver.findElement(By.id("nav-logo-sprites"));
        logo7.click();
        MyFunc.Bekle(1);

        WebElement kitap=driver.findElement(By.linkText("Kitap"));
        System.out.println("kitap.getText() = " + kitap.getText());
        kitap.click();
        MyFunc.Bekle(1);

        WebElement logo8=driver.findElement(By.id("nav-logo-sprites"));
        logo8.click();
        MyFunc.Bekle(1);

        WebElement bilgisayar=driver.findElement(By.linkText("Bilgisayar"));
        System.out.println("bilgisayar.getText() = " + bilgisayar.getText());
        bilgisayar.click();
        MyFunc.Bekle(1);

        WebElement logo9=driver.findElement(By.id("nav-logo-sprites"));
        logo9.click();
        MyFunc.Bekle(1);

        WebElement amazonayricaliklari=driver.findElement(By.linkText("Amazon Ayrıcalıkları"));
        System.out.println("amazonayricaliklari.getText() = " + amazonayricaliklari.getText());
        amazonayricaliklari.click();
        MyFunc.Bekle(1);

        WebElement logo10=driver.findElement(By.id("nav-logo-sprites"));
        logo10.click();
        MyFunc.Bekle(1);

        WebElement satisyap=driver.findElement(By.linkText("Satış Yap"));
        System.out.println("satisyap.getText() = " + satisyap.getText());
        satisyap.click();
        MyFunc.Bekle(1);

        WebElement logo11=driver.findElement(By.id("nav-logo-sprites"));
        logo11.click();
        MyFunc.Bekle(1);

        WebElement hediyekartlari=driver.findElement(By.linkText("Hediye Kartları"));
        System.out.println("hediyekartlari.getText() = " + hediyekartlari.getText());
        hediyekartlari.click();
        MyFunc.Bekle(1);

        WebElement logo12=driver.findElement(By.id("nav-logo-sprites"));
        logo12.click();
        MyFunc.Bekle(4);
        System.out.println("TEST BAŞARIYLA TAMAMALANDI");
        driver.quit();
























    }
}
