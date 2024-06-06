package mkplproject;

/**
 * Convert
 */
public class Convert {
    private double celciusValue;

    public double getCelciusValue(){
        return celciusValue;
    }

    public Convert(int celciusValue){
        this.celciusValue = celciusValue;
    }

    public double toKelvin(){
        double celcius = celciusValue;
        return celcius += 273.15;
    }

    public double toFahrenheit(){
        double celcius = celciusValue;
        return celcius * (9/5) + 32;
    }
}