public class Location {                                                                  // Creates class called Location

    private String locationName;                                                         // Declaring String parameter called LocationName
    private int locationNumber;                                                          // Declaring int parameter called buildingNumber
    private String category;                                                             //
    private String [][] questions ;                                                      // Declaring a two-dimensional String array named questions, to be able to hold both question and answer.

    public Location(String locationName, int locationNumber, String category, String [][] questions) {    // Constructor for the Location class. Listing the different parameters used in the Location object.
        this.locationName = locationName;                                                // locationName initializes the field called houseName.
        this.locationNumber = locationNumber;                                            // initializes buildingNumber
        this.questions = questions;
        this.category = category;
    }


    public String getLocationName() { return locationName; }

    public int getLocationNumber() { return locationNumber; }

    public String getCategory () { return category; }
    public String [][] getQuestions () { return questions;}                    // To be able to get the entire question array

    public String getQuestion (int index) { return questions[index] [0]; }     // To be able to get a question given index
    public String getAnswer (int index) { return questions[index] [1]; }       // To be able to get a answer given index



}






