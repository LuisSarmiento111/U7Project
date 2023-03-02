public class PostageCalculator {
    public static double calculatePostage(int zip1, int zip2, double weight, double height, double length, double width) {
        double total = (3.75 + (weight / .1) * .05 + (Math.abs(zip1 / 100.0 - zip2 / 100.0) / 100.0));
        if (height + length + width > 36) {
            total += (height + length + width - 36) * .10;
        }
        if (weight > 40) {
            total += ((weight - 40) / .1) * .10;
        }
        total = Math.round(total * 100.0) / 100.0;
        return total;
    }

    public static double calculatePostage(Address address1, Address address2,double weight, double height, double length, double width) {
        double total = (3.75 + (weight / .1) * .05 + (Math.abs(address1.getZipCode() / 100.0 - address2.getZipCode() / 100.0) / 100.0));
        if (height + length + width > 36) {
            total += (height + length + width - 36) * .10;
        }
        if (weight > 40) {
            total += ((weight - 40) / .1) * .10;
        }
        total = Math.round(total * 100.0) / 100.0;
        return total;
    }

    public static double calculatePostage(Package thePackage) {
        double total = (3.75 + (thePackage.getWeight() / .1) * .05 + (Math.abs(thePackage.getOrigin().getZipCode()
                / 100.0 - thePackage.getDestination().getZipCode() / 100.0) / 100.0));
        if (thePackage.getHeight() + thePackage.getLength() + thePackage.getWidth() > 36) {
            total += (thePackage.getHeight() + thePackage.getLength() + thePackage.getWidth() - 36) * .10;
        }
        if (thePackage.getWeight() > 40) {
            total += ((thePackage.getWeight() - 40) / .1) * .10;
        }
        total = Math.round(total * 100.0) / 100.0;
        return total;
    }
}
