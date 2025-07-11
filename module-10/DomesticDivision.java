package module10;

public class DomesticDivision extends Division {
//field for which state domestic division is located in
    private String State;

//constructor with state field included
    public DomesticDivision(String name, int accNumber, String State) {
        super(name, accNumber);
        this.State = State;
    }
//method to display domestic division information
    public void display() {
        System.out.println("Domestic Division Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("State: " + State);
    }
}