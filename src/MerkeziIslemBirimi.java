public class MerkeziIslemBirimi implements Observer {

    boolean sogutucuAcikKapali = false;
    SicaklikAlgilayici algilayici = new SicaklikAlgilayici();
    Eyleyici eyleyici = new Eyleyici();


    public void sicaklikGoster() {         
        System.out.println("Sıcaklık = " + algilayici.sicaklikOku());
        System.out.println("=============");
    }
    
    public void sogutucuAc() {
        if (sogutucuAcikKapali == false) {

            sogutucuAcikKapali = eyleyici.sogutucuAc(this);  //same as sogutucuAcikKapali = true;

            algilayici.sicaklikAzaltYukselt(true);
            System.out.println("Soğutucu Açıldı.");
        } else
            sogutucuAcikUyariMesaji();
    }

    public void sogutucuKapat() {
        if (sogutucuAcikKapali == true) {
            
            sogutucuAcikKapali = eyleyici.sogutucuKapat(this);  //same as sogutucuAcikKapali = false;

            algilayici.sicaklikAzaltYukselt(false);
            System.out.println("Soğutucu Kapatıldı.");
        } else
            sogutucuKapaliUyariMesaji();
    }

    @Override
    public void sogutucuKapaliUyariMesaji() {
        System.out.println("Soğutucu kapalı. Kapatma işlemi yapılamıyor.");
    }

    @Override
    public void sogutucuAcikUyariMesaji() {
        System.out.println("Soğutucu açık. Açma işlemi yapılamıyor.");
    }
}
