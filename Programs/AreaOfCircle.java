import java.util.Scanner;
class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value of radius: ");
        float radius =  sc.nextFloat();

        final float pi = 3.14f;
        float area = pi* (radius*radius);
        System.out.println("Area Of Circle: "+ area+ " cm^2");
    }
}