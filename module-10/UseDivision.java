package module10;

public class UseDivision {
//main method to display division information and where you create instances
    public static void main(String[] args) {
        System.out.println("Displaying Division Information:");

// Two instances of the International Division (2 objects)
    InternationalDivision IntDiv1 = new InternationalDivision("Athena in Greece", 100, "Greece", "Greek");
    InternationalDivision IntDiv2 = new InternationalDivision("Garcia Auto", 200, "Spain", "Spanish");

//Two instance of Domestic Division (2 objects)
    DomesticDivision DomDiv1 = new DomesticDivision("Judge Judy Bank", 300,"New York");
    DomesticDivision DomDiv2 = new DomesticDivision("Mobile Mashed Potatoes", 400, "Washington");

// Display the information for each division
        IntDiv1.display();
        System.out.println();

        IntDiv2.display();
        System.out.println();

        DomDiv1.display();
        System.out.println();

        DomDiv2.display();
    }
}
