import java.io.IOException;
import java.util.ArrayList;

public class Package {
    private String name;
    private String description;
    private double price;
    private Food food;
    private Venue venue;
    private Band band;
    private ArrayList<Package> packageList = new ArrayList<>();
    private File file = new File();

    public Package(String name, String description, Food food, Venue venue, Band band) {
        this.name = name;
        this.description = description;
        this.price = food.getPrice() + venue.getCost() + band.getFee();
        this.food = food;
        this.venue = venue;
        this.band = band; //  this part is to set the imformation of the package
    }

    public Package() {
        try {
            if (packageList.isEmpty()) { // if the package list is empty
                initPackageList(); // to initialize the package list
            } else {
                loadFromFile(); // to load the file
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void editPackageList() throws IOException {
        System.out.println("Edit package list");
        saveToFile();
    }

    private void initPackageList() throws IOException {
        if (packageList.isEmpty()) {
            saveToFile();
            packageList.add(new Package("Package 1", "A good package",
                    new Food().getFoodList().get(0),
                    new Venue().getVenueList().get(0),
                    new Band().getBandList().get(0)));
            packageList.add(new Package("Package 2", "A bad package",
                    new Food().getFoodList().get(1),
                    new Venue().getVenueList().get(1),
                    new Band().getBandList().get(1)));
            saveToFile();
        } else {
            loadFromFile();
        }
    }

    private void saveToFile() throws IOException {
        file.writeToFile("Package.txt", new ArrayList<>(packageList));
    }

    private void loadFromFile() throws IOException {
        ArrayList<String> stringList = file.loadFromFile("Package.txt");
        stringList.forEach(string -> {
            String[] packageInfo = string.split(",");
            packageList.add(new Package(packageInfo[0], packageInfo[1],
                    new Food().getFoodList().get(Integer.parseInt(packageInfo[3])),
                    new Venue().getVenueList().get(Integer.parseInt(packageInfo[4])),
                    new Band().getBandList().get(Integer.parseInt(packageInfo[5]))));
        }); // this part is to load the file

    }

    @Override
    public String toString() {
        return name + "," + description + "," + price + "," + food + "," + venue + "," + band;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public Band getBand() {
        return band;
    }

    public void setBand(Band band) {
        this.band = band;
    }

    public ArrayList<Package> getPackageList() {
        return packageList;
    }

    public void setPackageList(ArrayList<Package> packageList) {
        this.packageList = packageList;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
