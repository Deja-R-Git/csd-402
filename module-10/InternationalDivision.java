package module10;

public class InternationalDivision extends  Division {
//fields for internationalDivision class
    private String country;
    private String language;

// Constructor to initialize the InternationalDivision with fields from Division class added to International
    public InternationalDivision(String name, int accNumber, String country, String language) {
        super(name, accNumber); // Call the constructor of the superclass (Division)
        this.country = country;
        this.language = language;
    }

//display method for international division information
    public void display() {
        System.out.println("International Division Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
    }
}
