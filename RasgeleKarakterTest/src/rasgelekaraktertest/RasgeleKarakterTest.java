/**
 *
 * @author Canan Tokyay tokyaycanan@gmail.com
 * @since 16.03.2019
 * <p>
 * Rastgele karakter oluştuan kütüphaneyi test amaçlı yazılan program.
 * <p>
 */
package rasgelekaraktertest;
import PDPOdev2.RastgeleKarakter;

public class RasgeleKarakterTest {

   
   
    public static void main(String[] args)
    {
//Kutuphanemizi kullanabilmek için nesne tanımlamayız.
	RastgeleKarakter nesne = new RastgeleKarakter();
	
//rastlege karakter oluşturarak RandChar() metodunu test ediyoruz.
	System.out.println("Rastgele Karakter:" + nesne.RandChar());
	System.out.println("Rastgele Karakter:" + nesne.RandChar());
        System.out.println("Rastgele Karakter:" + nesne.RandChar());
	System.out.println("Rastgele Karakter:" + nesne.RandChar());
        System.out.println("Rastgele Karakter:" + nesne.RandChar());
	System.out.println("Rastgele Karakter:" + nesne.RandChar());
        System.out.println("Rastgele Karakter:" + nesne.RandChar());
	System.out.println("Rastgele Karakter:" + nesne.RandChar());
	
/*Birden fazla ve ne kadar uzunlukta girildiyse o buyuklukte bir karakter oluşturmak için 
**RandCharuzun() metodunu test ediyoruz.
**Yazdırma islemi methodun içinde oldugu icin println ile bir satır asagıya aktarıyoruz. */
	nesne.RandCharUzun(2);
	System.out.println("");
	nesne.RandCharUzun(5);
	System.out.println("");
	nesne.RandCharUzun(3);
	System.out.println("");
        nesne.RandCharUzun(4);
	System.out.println("");
	nesne.RandCharUzun(6);
	System.out.println("");
	nesne.RandCharUzun(5);
	System.out.println("");	
	
/*Burada AraDegerBul() metodu ile stringlere girilen karakterler arasinda bir 
**karakter yazdirma yapiyoruz.
**Soldaki sayi kac tane karakter olcagini belirtiyor.
**
**Karakterler yine methodun icinde yazdiriliyor ve de stringlerde kontrol yapılabilmesi
**girilen karakter buyuk harf girilmisse kucuk harfe ceviriyoruz.*/
	String birinci="a";
	birinci=birinci.toLowerCase();
	char karakter1=birinci.charAt(0);
	String ikinci="z";
	ikinci=ikinci.toLowerCase();
	char karakter2=ikinci.charAt(0);
	nesne.AraDegerBul(1,karakter1,karakter2);
	System.out.println("");
	
	birinci="k";
	birinci=birinci.toLowerCase();
	karakter1=birinci.charAt(0);
	ikinci="c";
	ikinci=ikinci.toLowerCase();
	karakter2=ikinci.charAt(0);
	nesne.AraDegerBul(2,karakter1,karakter2);
	System.out.println("");
	
	birinci="c";
	birinci=birinci.toLowerCase();
	karakter1=birinci.charAt(0);
	ikinci="r";
	ikinci=ikinci.toLowerCase();
	karakter2=ikinci.charAt(0);
	nesne.AraDegerBul(3,karakter1,karakter2);
	System.out.println("");
        
        birinci="i";
	birinci=birinci.toLowerCase();
	karakter1=birinci.charAt(0);
	ikinci="z";
	ikinci=ikinci.toLowerCase();
	karakter2=ikinci.charAt(0);
	nesne.AraDegerBul(2,karakter1,karakter2);
	System.out.println("");
	
        birinci="k";
	birinci=birinci.toLowerCase();
	karakter1=birinci.charAt(0);
	ikinci="y";
	ikinci=ikinci.toLowerCase();
	karakter2=ikinci.charAt(0);
	nesne.AraDegerBul(1,karakter1,karakter2);
	System.out.println("");
	
	
/*Burada girilen karakterlerden secerek rastgele birini yazdiriyor, yani
**GirilenKarakterlerArasindanSec() metodunu test ediyoruz.
**Soldaki sayi kac tane karakter olacagini belirtiyor.
**println asagiya gecmesi icin.*/
	nesne.GirilenKarakterlerArasindanSec(1,'a','b','e','r','d');
	System.out.println("");
	
	nesne.GirilenKarakterlerArasindanSec(2,'b','g','y','p','l');
	System.out.println("");
	
	nesne.GirilenKarakterlerArasindanSec(1,'b','w','e','s','a');
	System.out.println("");
        
        nesne.GirilenKarakterlerArasindanSec(2,'z','b','a','p','w');
	System.out.println("");
	
	nesne.GirilenKarakterlerArasindanSec(2,'x','y','e','p','d');
	System.out.println("");
	
//CumleOlustur()metodunu test ediyor. Sayi kac tane kelime istendigini belitir.
	nesne.CumleOlustur(6);
        nesne.CumleOlustur(10);
        nesne.CumleOlustur(5);
        nesne.CumleOlustur(4);
        nesne.CumleOlustur(3);
        nesne.CumleOlustur(5);
    }
}
