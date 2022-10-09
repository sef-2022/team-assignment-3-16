import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Event {
    private int eventID;
    private ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<Bill> bills = new ArrayList<>();

    private ArrayList<Event> eventList = new ArrayList<>();

    private File file = new File();

    public Event() {
    }

    public Event(int eventID, ArrayList<Customer> customers, ArrayList<Bill> bills) {
        this.eventID = eventID;
        this.customers = customers;
        this.bills = bills;  // to input the eventID, customer and bill
    }

    public Iterable<Object> getEventList() {
        return Collections.singleton(eventList);
    }

    // Todo: save and load event
    public void saveEvent() throws IOException {
        file.writeToFile("event.txt", new ArrayList<>(eventList)); // to save the event
    }

    public void loadEvent() throws IOException {
        ArrayList<String> stringList = file.loadFromFile("event.txt");
        stringList.forEach(string -> {
            String[] eventInfo = string.split(",");
            eventList.add(new Event(Integer.parseInt(eventInfo[0]), new ArrayList<>(), new ArrayList<>()));
        }); // to load the event
    }
    // Todo: getter and setter

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Bill> getBills() {
        return bills;
    }

    public void setBills(ArrayList<Bill> bills) {
        this.bills = bills;
    }

    public void setEventList(ArrayList<Event> eventList) {
        this.eventList = eventList;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    // Todo: print event
    public void printEvent() {
        System.out.println("Event ID: " + eventID);
        System.out.println("Customer: ");
        customers.forEach(System.out::println);
        System.out.println("Bill: ");
        bills.forEach(System.out::println); // to print the event
    }
}
