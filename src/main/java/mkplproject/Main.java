package mkplproject;

public class Main {
    public static void main(String[] args) {
        
        Convert myTemp = new Convert(23);

        System.out.println("Celcius: " + myTemp.getCelciusValue());

        System.out.println("Kelvin: " + myTemp.toKelvin());

        System.out.println("Fahrenheit: " + myTemp.toFahrenheit());
        
    }
}