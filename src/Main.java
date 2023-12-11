import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean done = false;

        do {
            double gallonsInTank, fuelEfficiency, gasPricePerGallon;

            System.out.print("Enter the number of gallons of gas in the tank: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.nextLine();
            }
            gallonsInTank = scanner.nextDouble();

            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.nextLine();
            }
            fuelEfficiency = scanner.nextDouble();

            System.out.print("Enter the price of gas per gallon: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.nextLine();
            }
            gasPricePerGallon = scanner.nextDouble();

            double costPer100Miles = (100 / fuelEfficiency) * gasPricePerGallon;
            System.out.println("Cost per 100 miles: $" + costPer100Miles);

            double distance = gallonsInTank * fuelEfficiency;
            System.out.println("The car can go approximately " + distance + " miles with the gas in the tank.");


            System.out.print("Do you want to calculate again? (Y/N): ");
            String input = scanner.next();
            done = !input.equalsIgnoreCase("Y");

        } while (!done);

        System.out.println("Program terminated. Thanks for using the Gas Calculator!");
        scanner.close();
    }
}