public class Locations2 {                                  // Creates class called Location

    private String houseName;                             // Declaring String parameter called houseName
    private int buildingNumber;                           // Declaring int parameter called buildingNumber

    private Locations2(String house, int build) {          // Constructor for the Location class. Listing the different parameters used in the Location object.
        houseName = house;                                // house initializes the field called houseName. Here it is also common to use .this
        buildingNumber = build;                           // build initializes buildingNumber

    }

    // Creates a toString method returning a String representation of the objects.
    public String toString() {
        return "This is the " + getHouseName() + " which you can find in building number " + getBuildingNumber();
    }
    // Creates getters for the parameters which is to be used. This enables access to parameters from other classes.
    public String getHouseName() { return houseName; }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    // The main method holds an array of four different objects which calls the Location constructor
    public static void main(String[] args) {

        Locations2[] locations = new Locations2[4];           // Declares and initializes the array

        locations[0] = new Locations2("library", 26);
        locations[1] = new Locations2("student house", 13);
        locations[2] = new Locations2("HumTek house", 06);
        locations[3] = new Locations2("canteen", 01);

        // For loop calling the toString which prints information held in the string above
        for (Locations2 i : locations) {
            System.out.println(i.toString());
        }
    }
}
