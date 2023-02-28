public class Address {
    private String streetNum;
    private String streetName;
    private String city;
    private String state;
    private int zipCode;

    public Address (String streetNum, String streetName, String city, String state, int zipCode) {
        this.streetNum = streetNum;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public Address(Address other) {
        streetNum = other.getStreetNum();
        streetName = other.getStreetName();
        city = other.getCity();
        state = other.getState();
        zipCode = other.getZipCode();
    }

    public Address (String address) {
        streetNum = address.substring(0, address.indexOf(" "));
        address = address.substring(address.indexOf(" ") + 1);
        String[] addressParts = address.split(", ");
        streetName = addressParts[0];
        city = addressParts[1];
        state = addressParts[2].substring(0, addressParts[2].indexOf(" "));
        zipCode = Integer.parseInt(addressParts[2].substring(addressParts[2].indexOf(" ") + 1));
    }

    public String getStreetNum() {
        return streetNum;
    }

    public void setStreetNum(String streetNum) {
        this.streetNum = streetNum;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String toString() {
        return streetNum + " " + streetName + ", " + city + ", " + state + " " + zipCode;
    }
}
