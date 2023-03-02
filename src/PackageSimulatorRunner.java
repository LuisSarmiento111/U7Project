import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.Scanner;

public class PackageSimulatorRunner {
    public static void main(String[] args) {
        Address test = new Address("1313", "Mockingbird Lane", "Springfield", "MO", 65123);
        System.out.println(test);
        System.out.println(PostageCalculator.calculatePostage(73561, 10206, 2.7, 2, 4, 6));
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        while (!answer.equals("4")) {
            System.out.println("------------------------");
            System.out.println("What would you like to do?");
            System.out.println("1. Calculate the price of one package");
            System.out.println("2. Simulate packages");
            System.out.println("3. How package costs are calculated");
            System.out.println("4. Exit");
            System.out.print("Input: ");
            answer = scanner.nextLine();
            if (answer.equals("1")) {
                System.out.print("Enter the zip code of the origin package: ");
                System.out.print("Enter the zip code of the destination package: ");

            }
        }
    }
}
