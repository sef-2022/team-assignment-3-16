import java.io.IOException;
import java.util.ArrayList;

public class Venue {
    private String name;
    private String address;
    private double cost;
    private String description;
    private Boolean physicalInspection;
    private ArrayList<Venue> venueList = new ArrayList<>();
    private File file = new File();

    public Venue(String name, String address, double cost, String description, Boolean physicalInspection) {
        this.name = name;
        this.address = address;
        this.cost = cost;
        this.description = description;
        this.physicalInspection = physicalInspection;
    }

    public Venue() {
        try {
            if (venueList.isEmpty()) { // to check is the list empty
                initVenueList();      // if empty, initialize the list
            } else {
                loadFromFile();      // if not empty, load from file
            }
        } catch (IOException e) {
            e.printStackTrace(); // print the error
        }
    }

    public void editVenueList() throws IOException {
        System.out.println("Edit venue list"); // print the message
        saveToFile(); // save to file
    }

    private void initVenueList() throws IOException {
        if (venueList.isEmpty()) {
            saveToFile();
            venueList.add(new Venue("Ikun basketball court", "Ikun street", 1000, "A good venue", true));
            venueList.add(new Venue("Kun basketball court", "Kun street", 2000, "A bad venue", false));
            saveToFile();
            // save and initialize the list
        } else {
            loadFromFile();
            // load from file
        }
    }

    private void saveToFile() throws IOException {
        file.writeToFile("Venue.txt", new ArrayList<>(venueList));
            // save to file
    }

    private void loadFromFile() throws IOException {
        ArrayList<String> stringList = file.loadFromFile("Venue.txt");
        stringList.forEach(string -> {
            String[] venueInfo = string.split(",");
            venueList.add(new Venue(venueInfo[0], venueInfo[1], Double.parseDouble(venueInfo[2]), venueInfo[3], Boolean.parseBoolean(venueInfo[4])));
        });
    }

    public String toString() {
        return name + "," + address + "," + cost + "," + description + "," + physicalInspection;
    }

    public void printInspection(Boolean print) {
        for (Venue venue : venueList) {
            if (venue.physicalInspection == print) {
                System.out.println(venue);
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getPhysicalInspection() {
        return physicalInspection;
    }

    public void setPhysicalInspection(Boolean physicalInspection) {
        this.physicalInspection = physicalInspection;
    }

    public ArrayList<Venue> getVenueList() {
        return venueList;
    }

    public void setVenueList(ArrayList<Venue> venueList) {
        this.venueList = venueList;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
