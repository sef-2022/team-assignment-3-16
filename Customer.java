import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer {
    private String name;
    private String contactNumber;
    private String Email;
    private String address;
    private String EventId;
    private List<String> suggestions = new ArrayList();
    private List<String> complaints = new ArrayList();
    private Package packageSelection;
    private Event event;

    public Package getPackageSelection() {
        return packageSelection;
    }

    public void setAddress(String address) {
        this.address = address; // this part is to get the customer address
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;  // this part is to get the customer contact number
    }

    public void setEmail(String email) {
        Email = email; // this part is to get the customer email
    }

    public void setEventId(String eventId) {
        EventId = eventId; // this part is to get the event id
    }

    public void setName(String name) {
        this.name = name; // this part is to set the name of the customer
    }
    public Customer(String name, String contactNumber, String email, String eventId, String address){
        this.address = address;
        this.contactNumber = contactNumber;
        this.Email = email;
        this.EventId = eventId;
        this.name = name;  // this part to input the customer information
    }

    public String getContactNumber() {
        return contactNumber;  // return the contact number
    }

    public String getAddress() {
        return address;  // return the address
    }

    public String getEmail() {
        return Email;  // return the email
    }

    public String getEventId() {
        return EventId; // return the event id
    }

    public String getName() {
        return name; // return the customer name
    }
    public void makeSuggestion(String EventId){
        Scanner sc = new Scanner(System.in);
        suggestions.add(EventId);
        System.out.println("What is your suggestion?");
        String suggestion = sc.nextLine();
        suggestions.add(suggestion);
        System.out.println("Thank you for your suggestion");
    }  // this part is to make suggestion
    public void makeComplaint(String EventId){
        Scanner sc = new Scanner(System.in);
        complaints.add(EventId);
        System.out.println("What is your complaint?");
        String complaint = sc.nextLine();
        complaints.add(complaint);
        System.out.println("Thank you for your complaint");
    } // this part is to make complaint
    public void CancelOrder(String EventId){
        event.setEventId(EventId);
        event.CancelEvent();
        System.out.println("Your order has been cancelled");
    } // this part is to cancel the order

}
