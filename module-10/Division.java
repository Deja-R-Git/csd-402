//JuedejaRichard_7-11-25_Module10
//Create an abstract Division class with fields for a company's division name and account number, and an abstract display () method
// that will be defined in the subclasses. Use a constructor in the superclass that requires values for both fields.
//Create two subclasses named InternationalDivision and DomesticDivision. The InternationalDivision class includes a field for
//the country in which the division is located, a field for the language spoken, and a constructor that requires all fields when created.
//The DomesticDivision class includes a field for the state in which the division is located and a constructor that requires all fields when created.
//Write an application named UseDivision that creates two instances of each of these concrete classes (4 total instances).
//Save the files as: Division, InternationalDivision, DomesticDivision, and UseDivision.
package module10;

//public abstract superclass
public abstract class Division {
    String name;
    int accountNumber;

//constructor to make objects with above fields
public Division(String name, int accNumber) {
    this.name = name;
    this.accountNumber = accNumber;
    }
}


