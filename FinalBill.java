import java.util.List;

public class FinalBill extends Customer {
    private double bill;
    private String EventId;
    private Boolean paymentStatus;
    private MusicalBrand musicalBrand;
    private Venue venue;
    private FoodMenu foodMenu;
    private String foodSelection;
    private String brandSelection;
    private String venueSelection;

    public FinalBill(String name, String contactNumber, String email, String eventId, String address, String foodSelection, String venueSelection, String brandSelection) {
        super(name, contactNumber, email, eventId, address); // this part is to get the customer information
        this.foodSelection = foodSelection;
        this.venueSelection = venueSelection;
        this.brandSelection = brandSelection;
    }

    public boolean isPaymentStatus() {
        return paymentStatus; // return the payment status
    }

    public void setPaymentStatus (Boolean paymentStatus){
            this.paymentStatus = paymentStatus; // this part is to set the payment status
    }
    public boolean payPackage(){
        if (paymentStatus){
            System.out.println("Payment Successful");
        }
        else {
            System.out.println("Payment Unsuccessful");
        }
        return paymentStatus; // return the payment status
    }
    public void getBill(){
        System.out.println("Your Bill is: " + bill); // print the bill
    }

    public void GenerateOrderReport(){
        System.out.println("Event Id: " + EventId);
        System.out.println("Event Name: " + getName());
        System.out.println("Event Address: " + getAddress());
        System.out.println("Event Contact Number: " + getContactNumber());
        System.out.println("Event Email: " + getEmail());
        System.out.println("Event Package: " + getPackageSelection());
        System.out.println("Event Food: " + foodSelection);
        System.out.println("Event Brand: " + brandSelection);
        System.out.println("Event Venue: " + venueSelection);
        System.out.println("Event Bill: " + bill); // print the order report
    }

    public void setBill(double bill) {
        this.bill = bill; // this part is to set the bill
    }
    public void calculateBill(List<Double> packagePrice, List<Double> foodPrice, List<Double> musicalBrandPrice) {
       bill = packagePrice.get(Integer.parseInt(venueSelection)-1) + foodPrice.get(Integer.parseInt(foodSelection)-1) + musicalBrandPrice.get(Integer.parseInt(brandSelection)-1); // calculate the bill
    }
}
