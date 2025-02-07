import java.util.Scanner;

class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter temperature in Celsius: ");
        float celsius = sc.nextFloat();
        
        // Correct conversion formula
        float fahrenheit = (celsius * 9.0f/5) + 32;

        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        
        sc.close(); // Close scanner to avoid resource leaks
    }
}
