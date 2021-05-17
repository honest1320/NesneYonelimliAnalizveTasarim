import java.util.Scanner;

public class AgArayuzu {

    public void Arayuz()
    {
        Scanner a = new Scanner(System.in);
        String KullaniciAdi;
        String Sifre;
        int loginNo=0;
        MerkeziIslemBirimi akilliCihaz = new MerkeziIslemBirimi();

        while(loginNo<=2)
        {
            System.out.print("\nLütfen Kullanıcı Adınızı Giriniz : ");
            KullaniciAdi = a.next();
            System.out.print("Lütfen Şifrenizi Giriniz : ");
            Sifre = a.next();
            if(Veritabani.getInstance().Kontrol(KullaniciAdi , Sifre)){
                System.out.println("\nGiriş başarılı.\n");
                break;
            }
            else System.out.println("\nHatalı Giriş Yaptınız!\n");
            loginNo++;

        }
        if (loginNo>2) {
            System.out.println("Çok fazla hatalı giriş yaptınız. Lütfen daha sonra tekrar girin.\n\n");
            System.exit(0);
        }
        

        while(true)
        {
            byte secim;
            Scanner b = new Scanner(System.in);
            System.out.println("\n Yapmak istediğiniz işlemi seçin.. \n");
            System.out.println("1-Sıcaklık Görüntüle");
            System.out.println("2-Soğutucu Aç");
            System.out.println("3-Soğutucu Kapat");
            System.out.println("4-Çıkış Yap");
            //System.out.println("\n");
            secim = b.nextByte();
            if(secim == 1)
            {
                System.out.println("\n");
                akilliCihaz.sicaklikGoster();
            }
            if(secim == 2)
            {
                System.out.println("\n");
                akilliCihaz.sogutucuAc();
            }
            if(secim == 3)
            {
                System.out.println("\n");
                akilliCihaz.sogutucuKapat();
            }
            if(secim == 4)
            {
                System.exit(1);
            }
            // a.close();
            // b.close();

        }
    }
}