package DataTypeExercise;

public class Exercise5 {
    public static void main(String[] args){
        double radius=7.5;
        double area = Math.PI * radius * radius;
        double perimeter = Math.PI * 2 * radius;

        System.out.printf("Circle (radius:%.2f) Area = %.14f\n", radius, area);
        System.out.printf("Circle (radius:%.2f) Perimeter = %.14f", radius, perimeter);
    }
        
    }


