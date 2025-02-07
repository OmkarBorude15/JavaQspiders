 import java.util.Scanner;
 class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Radius: ");
        float radius = sc.nextFloat();

        final float pi = 3.14f;
        float area = pi*(radius*radius);

        System.out.println("Enter Height: ");
        float height = sc.nextFloat();
        float volume = area*height;

        System.out.println("Area Of Cylinder: "+area);
        System.out.println("Volume of Cylinder: "+volume);
    }
    
}
