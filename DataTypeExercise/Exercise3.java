package DataTypeExercise;

public class Exercise3 {
    public static void main(String[] args) {

        int num1 = -5; int num2=8; int num3=6; int num4=55; int num5=9; int num6=9; int num7=20; int num8=-3;
        int num9=5; int num10=8; int num11=5; int num12=15; int num13=3; int num14=2; int num15=8; int num16=3;
        {
        int op1 = num1 + num2 * num3;
        int op2 = (num4 + num5) % num6;
        int op3 = num7 + num8 * num9 / num10;
        int op4 = num11 + num12 / num13 * num14 - num15 % num16;

        System.out.printf("%d + %d * %d = %d\n", num1, num2, num3, op1);
        System.out.printf("(%d + %d) %s %d = %d\n", num4, num5, "%", num6, op2);
        System.out.printf("%d + %d * %d / %d = %d\n", num7, num8, num9, num10, op3);
        System.out.printf("%d + %d / %d * %d - %d %s %d = %d", num11, num12, num13, num14, num15, "%", num16, op4);


}}}
