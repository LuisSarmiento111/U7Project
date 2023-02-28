public class PackageSimulator {

    public static double calculatePostage(int zip1, int zip2, double weight, double height, double length, double width) {
        return 3.75 + (weight / .1) + ((zip1 / 100 - zip2 / 100) / 100);
    }
}
