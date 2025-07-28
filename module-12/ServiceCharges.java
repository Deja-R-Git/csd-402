//JuedejaRichard_Module12_7-26-25
//Write a program with four methods for calculating the cost
// of a yearly auto service visit. The methods will be titled yearlyService.
//Write a main method that will test each of these methods two times.

public class ServiceCharges {
    //constants
    public static final int standardCharge = 100;

    //fields
    private int oilFee = 40;
    private int tireRotation = 0;
    private int coupon = 20;

    //no argument constructor
    public int yearlyService(){
        return standardCharge;
    }
    //One argument constructor
    public int yearlyService(int oilFee){
        this.oilFee = oilFee;
        return oilFee;
    }
    //two argument constructor
    public int yearlyService(int oilFee, int tireRotation){
        this.oilFee = oilFee;
        this.tireRotation = tireRotation;
        return oilFee + tireRotation;
    }
    //three argument constructor
    public int yearlyService(int oilFee, int tireRotation, int coupon) {
        this.oilFee = oilFee;
        this.tireRotation = tireRotation;
        this.coupon = coupon;
        return (oilFee + tireRotation) - coupon;
    }
    //setters
    public void setOilFee(int oilFee) {
        this.oilFee = oilFee;
    }

    public void setTireRotation(int tireRotation) {
        this.tireRotation = tireRotation;
    }

    public void setCoupon( int coupon) {
        this.coupon = coupon;
    }

    //getters
    public int getOilFee() {
        return oilFee;
    }
    public int getTireRotation() {
        return tireRotation;
    }
    public int getCoupon() {
        return coupon;
    }

    public static void main(String[] args) {
        //create first object and set attributes
        ServiceCharges serviceCharges1 = new ServiceCharges();
        serviceCharges1.setOilFee(40);
        serviceCharges1.setTireRotation(10);
        serviceCharges1.setCoupon(20);

        //Information to display for first object
        System.out.println("Here are your charges for your First service: ");
        System.out.println("Standard Charge: " + serviceCharges1.yearlyService());
        System.out.println("Total = " + (serviceCharges1.yearlyService() + serviceCharges1.getOilFee()));
        System.out.println("\n");

        ServiceCharges serviceCharges2 = new ServiceCharges();
        //create second object and set attributes
        serviceCharges2.setOilFee(56);
        serviceCharges2.setTireRotation(25);
        serviceCharges2.setCoupon(40);

        //Information to display for Second object
        System.out.println("Here are your charges for your Second service: ");
        System.out.println("Standard Charge: " + serviceCharges2.yearlyService());
        System.out.println("Total = " + (serviceCharges2.yearlyService()));
        System.out.println("\n");

        ServiceCharges serviceCharges3 = new ServiceCharges();
        //create second object and set attributes
        serviceCharges3.setOilFee(25);
        serviceCharges3.setTireRotation(36);
        serviceCharges3.setCoupon(17);

        //Information to display for third object
        System.out.println("Here are your charges for your Third service: ");
        System.out.println("Standard Charge: " + serviceCharges3.yearlyService());
        System.out.println("Oil Fee: " + serviceCharges3.getOilFee());
        System.out.println("Total = " + (serviceCharges3.yearlyService() + serviceCharges3.getOilFee()));
        System.out.println("\n");

        ServiceCharges serviceCharges4 = new ServiceCharges();
        //create second object and set attributes
        serviceCharges4.setOilFee(80);
        serviceCharges4.setTireRotation(38);
        serviceCharges4.setCoupon(12);

        //Information to display for fourth object
        System.out.println("Here are your charges for your Fourth service: ");
        System.out.println("Standard Charge: " + serviceCharges4.yearlyService());
        System.out.println("Oil Fee: " + serviceCharges4.getOilFee());
        System.out.println("Total = " + (serviceCharges4.yearlyService() + serviceCharges4.getOilFee()));
        System.out.println("\n");

        ServiceCharges serviceCharges5 = new ServiceCharges();
        //create second object and set attributes
        serviceCharges5.setOilFee(45);
        serviceCharges5.setTireRotation(13);
        serviceCharges5.setCoupon(7);

        //Information to display for fifth object
        System.out.println("Here are your charges for your Fifth service: ");
        System.out.println("Standard Charge: " + serviceCharges5.yearlyService());
        System.out.println("Oil Fee: " + serviceCharges5.getOilFee());
        System.out.println("Tire Rotation: " + serviceCharges5.getTireRotation());
        System.out.println("Total = " + (serviceCharges5.yearlyService() + serviceCharges5.getOilFee() +
                serviceCharges5.getTireRotation()));
        System.out.println("\n");

        ServiceCharges serviceCharges6 = new ServiceCharges();
        //create second object and set attributes
        serviceCharges3.setOilFee(50);
        serviceCharges3.setTireRotation(10);
        serviceCharges3.setCoupon(10);

        //Information to display for sixth object
        System.out.println("Here are your charges for your Sixth service: ");
        System.out.println("Standard Charge: " + serviceCharges6.yearlyService());
        System.out.println("Oil Fee: " + serviceCharges6.getOilFee());
        System.out.println("Tire Rotation: " + serviceCharges6.getTireRotation());
        System.out.println("Total = " + (serviceCharges6.yearlyService() + serviceCharges6.getOilFee() +
                serviceCharges6.getTireRotation()));
        System.out.println("\n");

        ServiceCharges serviceCharges7 = new ServiceCharges();
        //create second object and set attributes
        serviceCharges3.setOilFee(70);
        serviceCharges3.setTireRotation(15);
        serviceCharges3.setCoupon(20);

        //Information to display for seventh object
        System.out.println("Here are your charges for your Seventh service: ");
        System.out.println("Standard Charge: " + serviceCharges7.yearlyService());
        System.out.println("Oil Fee: " + serviceCharges7.getOilFee());
        System.out.println("Tire Rotation: " + serviceCharges7.getTireRotation());
        System.out.println("Coupon: " + serviceCharges7.getCoupon());
        System.out.println("Total = " + (serviceCharges7.yearlyService() + serviceCharges7.getOilFee() +
                serviceCharges7.getTireRotation() - serviceCharges7.getCoupon()));
        System.out.println("\n");

        ServiceCharges serviceCharges8 = new ServiceCharges();
        //create second object and set attributes
        serviceCharges8.setOilFee(30);
        serviceCharges8.setTireRotation(10);
        serviceCharges8.setCoupon(5);

        //Information to display for eighth object
        System.out.println("Here are your charges for your Eighth service: ");
        System.out.println("Standard Charge: " + serviceCharges8.yearlyService());
        System.out.println("Oil Fee: " + serviceCharges8.getOilFee());
        System.out.println("Tire Rotation: " + serviceCharges8.getTireRotation());
        System.out.println("Coupon: " + serviceCharges8.getCoupon());
        System.out.println("Total = " + (serviceCharges8.yearlyService() + serviceCharges8.getOilFee() +
                serviceCharges8.getTireRotation() - serviceCharges8.getCoupon()));
        System.out.println("\n");
    }
}
