import java.util.ArrayList;

public class PackageSimulator {
    ArrayList<Package> packages;

    public PackageSimulator() {
        packages = new ArrayList<Package>();
    }

    public void generatePackages(int numOfPackages) {
        for (int i = 0; i < numOfPackages; i++) {
            Address origin = new Address("123", "Random Street", "City", "State", (int)(Math.random() * 99450) + 501);
            Address destination = new Address("123", "Random Street", "City", "State", (int)(Math.random() * 99450) + 501);
            double weight = Math.round(((Math.random() * 50) + 2) * 100) / 100.0;
            double length = Math.round(((Math.random() * 25) + 5) * 100) / 100.0;
            double width = Math.round(((Math.random() * 25) + 5) * 100) / 100.0;
            double height = Math.round(((Math.random() * 25) + 5) * 100) / 100.0;
            packages.add(new Package(origin, destination, weight, height, length, width));
        }
    }

    public double generateTotalCost(){
        double total = 0;
        for (Package thePackage : packages) {
            total += PostageCalculator.calculatePostage(thePackage);
        }
        total = Math.round(total * 100.0) / 100.0;
        return total;
    }

    public String getSimulationInfo() {
        String info = "";
        for (int i = 0; i < packages.size(); i++) {
            info += "\nPackage " + (i + 1) + "------------------------------------------------\n";
            info += "Origin Address: " + packages.get(i).getOrigin() + "\n";
            info += "Destination Address: " + packages.get(i).getDestination() + "\n";
            info += "Weight: " + packages.get(i).getWeight() + " pounds\n";
            info += "Height: " + packages.get(i).getHeight() + " inches\n";
            info += "Length: " + packages.get(i).getLength() + " inches\n";
            info += "Width: " + packages.get(i).getWidth() + " inches\n";
        }
        return info;
    }

    public void resetSimulation() {
        while (packages.size() > 0) {
            packages.remove(0);
        }
    }
}
