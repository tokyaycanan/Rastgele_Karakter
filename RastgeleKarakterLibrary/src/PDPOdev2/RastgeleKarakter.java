/**
 *
 * @author Canan Tokyay tokyaycanan@gmail.com
 * @since 16.03.2019
 * <p> 
 * Random olarak karakter üreten bir kütüphanedir.
 * <p>
 */
package PDPOdev2;

public class RastgeleKarakter 
{
    /**
     * 
     *  Rastgele karakter oluşturucu method.
     */
       public char RandChar()
    {
        char karakter=0;
 //item nanoTime() ile gelen değeri integar a çevirdikten sonra tutulan değişken.
        int item;
 // büyük harf atamalar için;
        if(System.nanoTime()%2==0)
        {
            item=(int)System.nanoTime();
 //nanoTime() methodundan gelen değer - işaretli(negatif) olabileceği için kontrol yapmalıyız.
            if(item<0)
            {
                item=item*(-1);
            }
 //item daki değeri mod 26 ya alıp 65 eklenmesinin sebebi: ASCII de büyük harflerin 65 ile 90 arasında olmasıdır.
            item=((item%26)+65);
        }
 // küçük harf için de aynı işlemleri tekrarlıyoruz.
        else
        {
            item=(int)System.nanoTime();
            if(item<0)
            {
                item=item*(-1);
            }
 //küçük sayılar ise 97ile 122 arasında alınıyor.
            item=((item%26)+97);
        }
//itemdan gelen ifade char tipinde karaktere aktarılıyorve return ile döndürülüyor.
        karakter=(char)item;
        return karakter;
        
    }
    /**
     * 
     *  Rastgele birden fazla karakter oluşturmak için method
     */

    public void RandCharUzun(int x)
    {
        // parameter içine girilen değer kadar karakter üreten fonksiyon çağırılıyor.
        System.out.print("RASTGELE "+x+" KARAKTER : ");
        int i=0;
        while(i<x)
        {
            System.out.print(RandChar());
            i++;
        }
    }
    /**
     * 
     *  Verilen iki değer arasında sayı üreten fonksiyon.
     * 
     */
    public void AraDegerBul(int x, char itm1, char itm2)
    {
//kullanmak için karakter oluşturuyoruz.
            char _karakter= RandChar();
// a,b itm1 ve itm2 paremetrelerinin integar değerlerini tutmak için.
            int a, b;
//a ya atama yapılıyor.
            a=(int)itm1;
//büyük harf ise küçüğe çeviriyoruz.
            if(a<97)
            {
               a=a+32; 
            }
// y için atama ve kontrol:
            b=(int)itm2;
            if(b<97)
            {
               b=b+32; 
            }
// eğer ilk parametre diğerinden büyükse yer değiştiriyoruz.
            if(a>b)
            {
                int tmp=a;
                a=b;
                b=tmp;
            }
//ekran çıktısı için gereken satır.
            System.out.print("VERİLEN 2 KARAKTER ARASI("+itm1+","+itm2+"):");
            
//x kaç karakter olmasını istememmizdi.
//while ile yazdırma işlemi yapıyoruz.
            int i=0;
            
            while(i<x)
            {
//istenien karakterler arasında ise yazdırılıyor ve yeri rastgele karakter oluşturuluyor.
                if ((int) _karakter > a && (int) _karakter < b)
	        {
		    System.out.print(_karakter);
		    _karakter = RandChar();
		    i++;
	        }
//eğer a ve b arasında değilse başka karakter atayıp deniyoruz.
                else
                {
                    _karakter=RandChar();
                }
            }
    }
    /**
     * 
     *  Girilen karakterler arasında rastgele seçilip yazdıran fonksiyon.
     */
//(char... kaç karakter olduğu belirsiz olduğundan dolayı.)
        public void GirilenKarakterlerArasindanSec(int x, char... item)
        {
//ekran çıktısı için:
            System.out.print("Belirtilen karakterler (");
//burada for döngüsüyle test programında kaç karakter girdiysek o kadar yazdırmak için.
            for(int i=0; i<item.length;i++)
            {
                System.out.print(item[i]);
//If dongusu son karakterden sonra virgul konmamasi icin.
	        if(i+1!=item.length)
	        {
		System.out.print(",");
	        }
            }
            System.out.print("):");
//For döngüsünde kac tane karakter istendiyse o kadar karakter cikartmak icin.
            for(int i=0; i<x;i++)
            {
//secim char dizisinden rastgele seçmek için.
                int secim=(int)System.nanoTime();
//NanoTime - isaretli olabileceği için.      
                if(secim<0)
                {
                    secim=secim*(-1);
                }
//item dizimizin adı
                secim=secim%item.length;
	        System.out.print(item[secim]);
            }
        }
        /**
         * 
         * Cümle otuşturan fonksyon.
         */

        public void CumleOlustur(int itm)
        {
            int kelimedurdur=0;
            System.out.print("cümle: \"");
//ekran çıktısı icin duzenli bir cikis saglandiktan sonra while icinde kac tane kelime isteniyorsa o kadar kelime uretiliyor.          
            while(kelimedurdur<itm)
            {
                int kelimeuzunlugu=(int)System.nanoTime();
//eksi olmaması için:
                if(kelimeuzunlugu<0)
	        {
		kelimeuzunlugu=kelimeuzunlugu*(-1);
	        }
//kelime uzunluğu 2 ile 8 arasında değişir.
                kelimeuzunlugu=((kelimeuzunlugu%6)+2);
//döngü ile kelimeuzunlugu kadar rastgele karakter cikartiliyor.
                for(int i=0; i<kelimeuzunlugu; i++)
                {
                    char x= RandChar();
//if ile kelimelerin kucuk harf olmasi saglaniyor cumlede karakterlerin kucuk harf olusmasi icin.
                    if((int)x<97)
                    {
                        x=(char)((int)x+32);
                    }
                    System.out.print(x);
                }
//burada son kelime haric diger kelimelerden sonra bosluk birakiliyor.
                if(kelimedurdur+1!=itm)
	            {
	                System.out.print(" ");
	            }
//Bu ifde de son kelimeden sonra nokta koyuluyor.
	        if(kelimedurdur+1==itm)
	            {
		        System.out.print(".");
	            }
	        kelimedurdur++;
	}
//cümleyi tamamlayıp yazdırıyoruz.
	System.out.println("\"");
    }
}
            
            
        
               
    
            
    

