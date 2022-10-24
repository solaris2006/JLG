package home.jlg.lesson5;

public abstract class  ValueConverter {


       public static double convert(double valueToBeConverted, double factor) {
          return valueToBeConverted * factor;
      };

       public static void print(double valueToBeConverted, double convertedValue, String valueToBeCovertedName, String convertedValueName){
           System.out.println(valueToBeConverted  + " " +  valueToBeCovertedName + " are " + convertedValue + " " + convertedValueName);
       };
}
