
public class Eyleyici implements Observable{        //Eyleyici only turns on or off the device
    public boolean sogutucuAc(Observer observer)           
    {
        
        return true;
    }

    public boolean sogutucuKapat(Observer observer)
    {
        
        return false;
    }
}
