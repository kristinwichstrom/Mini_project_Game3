public class Locations {                                                   // Creates class called Location

    private String locationName;                                          // Declaring String parameter called LocationName
    private int locationNumber;                                           // Declaring int parameter called buildingNumber

    private Locations(String locationName, int locationNumber) {          // Constructor for the Location class. Listing the different parameters used in the Location object.
        this.locationName = locationName;                                 // house initializes the field called houseName. Here it is also common to use .this
        this.locationNumber = locationNumber;                             // build initializes buildingNumber
    }

    private static final String[] differentLocations = {
            " library ", " student house ", " RUC bar ", " canteen ", "HumTek house ", " FabLab ",
            " SamBas house ", " Solar Pavilion ", " the big auditorium ", " the small auditorium "};


    public String getLocationName() { return locationName; }

    public int locationNumber() { return locationNumber; }

}






