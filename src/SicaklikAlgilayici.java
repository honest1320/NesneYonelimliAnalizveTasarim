import java.util.Random;

public class SicaklikAlgilayici {       //SicaklikAlgilayici does the operations found after device is already on

    private int sicaklik;
    private Random rnd = new Random();

    public SicaklikAlgilayici() //this constructor initializes the device's readings(gives initial temperature)
    {
        sicaklik = rnd.nextInt(20) + 10;
    }


    public int sicaklikOku()
    {
        return sicaklik;
    }

    public void sicaklikAzaltYukselt(boolean kontrol)
    {
        if(kontrol == true)
        {
            sicaklik -= rnd.nextInt(10);
        }

        if(kontrol == false)
        {
            sicaklik += rnd.nextInt(10);
        }
    }
}
