package DataTypeExercise;

public class Exercise4 {
    public static void main(String[] args){
    double num1=25.5;
    double num2=3.5;
    double num3=3.5;
    double num4=3.5;
    double num5=4.5;
    double num6=4.5;
    double result = (num1 * num2 - num3 * num4) / (num5 - num6);

        System.out.printf("(( %.1f * %.1f - %.1f * %.1f) / (%.1f - %.1f)) = %.15f",
                num1, num2, num3, num4, num5, num6, result);
}}
