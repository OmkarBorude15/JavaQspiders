import java.util.Scanner;
public class PeriOfCircle {
    public static void main(String[] args) { //Program For Perimeter Of Circle
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius Of Circle: ");
        float radius = sc.nextFloat();

        final float pi = 3.14f;
        float Perimeter = 2 * pi * radius;
        System.out.println("Perimeter of Circle is: "+Perimeter);
    }
    
}
