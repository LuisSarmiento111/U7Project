import java.util.ArrayList;

public class PackageSimulator {
    ArrayList<Package> packages;

    public PackageSimulator() {
        packages = new ArrayList<Package>();
    }

    public void generatePackages(int numOfPackages) {
        for (int i = 0; i < numOfPackages; i++) {
            Address origin = new Address("123", "Random Street", "City", "State", 49100);
            Address destination = new Address("123", "Random Street", "City", "State", 49100);
            // packages.add(new Package(origin, destination,));
        }
    }

    public int generateTotalCost(){
        int total = 0;
        for (Package thePackage : packages) {
            total += PostageCalculator.calculatePostage(thePackage);
        }
        return total;
    }

    public void resetSimulation() {
        packages.removeAll(packages);
    }
}
