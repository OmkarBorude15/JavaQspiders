import java.util.Scanner;
class Tipcalculation{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bill: ");  // Use print instead of println for inline input
        float bill = sc.nextFloat();

        System.out.print("Enter Tip rate: "); // Added a space for readability
        float tiprate = sc.nextFloat();
        
        float tipAmount = (tiprate * bill) / 100;
        float totalBill = bill + tipAmount;

        System.out.println("Total Bill is: " + totalBill);
        System.out.println("Tip Added is: " + tipAmount);
        
        sc.close(); // Close Scanner to avoid resource leaks
    }
}

       