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
            double weight = 0;
            double length = 0;
            double width = 0;
            double height = 0;
            packages.add(new Package(origin, destination, weight, height, length, width));
        }
    }

    public int generateTotalCost(){
        int total = 0;
        for (Package thePackage : packages) {
            total += PostageCalculator.calculatePostage(thePackage);
        }
        return total;
    }

    public String getSimulationInfo() {
        String info = "";
        for (int i = 0; i < packages.size(); i++) {
            info += "Package " + (i + 1) + "---------------------------\n";
            info += "Origin Address: " + packages.get(i).getOrigin() + "\n";
            info += "Destination Address: " + packages.get(i).getDestination() + "\n";
            info += "Weight: " + packages.get(i).getWeight() + "\n";
            info += "Height: " + packages.get(i).getDestination() + "\n";
            info += "Length: " + packages.get(i).getLength() + "\n";
            info += "Width: " + packages.get(i).getWidth() + "\n";
        }
        return info;
    }

    public void resetSimulation() {
        while (packages.size() > 0) {
            packages.remove(0);
        }
    }
}
