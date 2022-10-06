package home.jlg.lesson2;

public class CalculatorOverloaded {
    public static int add(int a, int b){
        return a + b;
    }

    public static int add(int a, int b, int c){
        return a + b + c;
    }

    public static double add(double a, double b){
        return a + b;
    }


    public static int multiply(int a, int b){
        return a * b;
    }

    public static int multiply(int a, int b, int c){
        return a * b * c;
    }


    public static double multiply(double a, double b){
        return a * b;
    }

    public static int divide(int a, int b){

        if (b != 0) return a + b;
        return 0;
    }

    public static int subtract(int a, int b){
        return a - b;
    }

}
