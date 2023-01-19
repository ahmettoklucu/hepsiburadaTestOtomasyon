package page;

import org.openqa.selenium.WebDriver;

public class Sales extends Page
{
    public final  String filter="//label[contains(text(),'Sıralama')]";
    public final  String artan="//div[contains(text(),'Artan fiyat')]";
    public final  String azalan="//div[contains(text(),'Azalan fiyat')]";
    public final  String cokSatan="//div[contains(text(),'Çok satanlar')]";
    public final  String cokDegerlendirilen="//div[contains(text(),'Çok değerlendirilenler')]";
    public final  String yuksekPuan="//div[contains(text(),'Yüksek puanlılar')]";
    public final  String indirimOrani="//div[contains(text(),'İndirim oranı')]";
    public final String yeniEklenenler="//div[contains(text(),'Yeni eklenenler')]";
    public final String marka="//div[contains(text(),'Universal')]";
    public final String urunCesidi="//div[contains(text(),'Brandalar')]";
    public final String fiyatAralik="//div[contains(text(),'0 - 25 TL')]";
    public final String degerlendirmePuan="//div[contains(text(),'4 yıldız ve üzeri')]";
    public final String kuponluUrun="//label[starts-with(@class,'moria-Toggle-')]/child::button";
    public Sales(WebDriver driver) {
        super(driver);
    }
}
