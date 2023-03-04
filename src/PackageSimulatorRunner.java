import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.Scanner;

public class PackageSimulatorRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        while (!answer.equals("4")) {
            System.out.println("------------------------------------------------");
            System.out.println("What would you like to do?");
            System.out.println("1. Calculate the price of one package");
            System.out.println("2. Simulate packages");
            System.out.println("3. How package costs are calculated");
            System.out.println("4. Exit");
            System.out.print("Input: ");
            answer = scanner.nextLine();
            if (answer.equals("1")) {
                System.out.print("Enter the zip code of the origin package: ");
                int zip1 = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter the zip code of the destination package: ");
                int zip2 = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter the weight of the package: ");
                double weight = Double.parseDouble(scanner.nextLine());
                System.out.print("Enter the height of the package: ");
                double height = Double.parseDouble(scanner.nextLine());
                System.out.print("Enter the length of the package: ");
                double length = Double.parseDouble(scanner.nextLine());
                System.out.print("Enter the width of the package: ");
                double width = Double.parseDouble(scanner.nextLine());
                System.out.println("Cost: " + PostageCalculator.calculatePostage(zip1, zip2, weight, height, length, width));
            } else if (answer.equals("2")) {
                PackageSimulator simulator = new PackageSimulator();
                System.out.print("How many packages would you like to simulate? ");
                int packagesNum = Integer.parseInt(scanner.nextLine());
                simulator.generatePackages(packagesNum);
                System.out.print("Randomly generated packages info: ");
                System.out.println(simulator.getSimulationInfo());
                System.out.println("------------------------------------------------");
                System.out.println("Total Cost of all packages: $" + simulator.generateTotalCost());
            } else if (answer.equals("3")) {
                System.out.println("The base cost of a package is $3.75");
                System.out.println("\u001B[1mFinal costs are calculated based on 5 different attributes: origin zipcode, destination zipcode, " +
                        "weight, height, length, and width.");
                System.out.println("\u001B[1m\u001b[4mOrigin & Destination ZipCode:\u001b[0m");
                System.out.println("•Each package has two zipCode; one indicating where it's coming from and the other " +
                        "indication where it's going.");
                System.out.println("•We take the difference between the two county codes (first 3 digits) and divide that by 100. " +
                        "That gets added onto the final cost");
                System.out.println("\u001B[1m\u001b[4mWeight:\u001b[0m");
                System.out.println("•Packages have a maximum weight of 40 pounds with no extra cost");
                System.out.println("•Any package that exceeds the 40 pound weight limit, gets charged 10 extra cents per " +
                        "tenth of a pound that goes over");
                System.out.println("\u001B[1m\u001b[4mHeight & Length & Width:\u001b[0m");
                System.out.println("•Packages have a maximum size on each side of 36 inches with no extra cost");
                System.out.println("•Any package with any side exceeding that 36 inch limit, gets charged 10 extra cents " +
                        "per inch that goes over (All sides are tracked separately)");
            }
        }
    }
}
