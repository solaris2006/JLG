package home.jlg.lesson5;

public class DistanceConverter extends ValueConverter{


    public static void InchesToCentimeters( double inches){
       print(inches, convert(inches , 2.54), "Inches", "Centimeters");
    }

    public static void feetToMeters( double feet){
        print(feet, convert(feet ,0.3048 ), "Feet", "Meteres");
    }

    public static void feetToKilometers( double feet){
        print(feet, convert(feet, 0.0003048), "Feet", "Kilometers");
    }
}
