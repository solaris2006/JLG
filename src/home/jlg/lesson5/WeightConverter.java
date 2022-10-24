package home.jlg.lesson5;

public class WeightConverter extends ValueConverter{



    public static void gramsToKilograms(double grams){
        print(grams, convert(grams, 0.001), "Grams", "Kilograms" );
    }

    public static void gramsToOunces(double grams){
        print(grams,  convert(grams, 0.03527396195), "Grams", "Ounces");

    }

    public static void ouncesToPounds(double ounces){
        print(ounces, convert(ounces, 0.0625), "Ounces", "Pounds");
    }

    public static void poundsToKilograms(double pounds){
        print(pounds, convert(pounds, 0.45359237), "Pounds", "Kilograms");
    }


}
