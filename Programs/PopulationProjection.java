import java.util.Scanner;

class PopulationProjection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long currentPopulation = 321032486; // Initial population
        int secondsPerYear = 365 * 24 * 60 * 60;

        long birthPerYear = secondsPerYear / 7;
        long deathPerYear = secondsPerYear / 13;
        long immigrantPerYear = secondsPerYear / 45;

        // Ask user for the number of years
        System.out.print("Enter the number of years for projection: ");
        int years = sc.nextInt(); // User input for years

        // Calculate the projected population
        long newPopulation = currentPopulation + (years * (birthPerYear - deathPerYear + immigrantPerYear));

        // Output results
        System.out.println("Current Population: " + currentPopulation);
        System.out.println("Projected Population after " + years + " years: " + newPopulation);

        sc.close(); // Close Scanner to prevent resource leaks
    }
}
