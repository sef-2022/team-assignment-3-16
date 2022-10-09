import java.io.IOException;
import java.util.ArrayList;

public class Band {
    private String name;
    private double fee;
    private String description;
    private ArrayList<Band> bandList = new ArrayList<>();
    private File file = new File();

    public Band() {
        try {
            if (bandList.isEmpty()) {  // if the list is empty, read the file
                initBandList();    // and populate the list
            } else {
                loadFromFile();   // otherwise, load the list from the file
            }
        } catch (IOException e) {
            e.printStackTrace(); // if there is an error, print the stack trace
        }
    }

    public void editBandList() throws IOException {
        System.out.println("Edit band list");  // print the menu
        saveToFile();
    }

    private void initBandList() throws IOException {
        if (bandList.isEmpty()) {
            saveToFile();  // if the list is empty, save the list to the file
            bandList.add(new Band("Ikun", 1000, "A good band"));
            bandList.add(new Band("Kun", 2000, "A bad band"));
            bandList.add(new Band("Kun", 3000, "A bad band"));
            bandList.add(new Band("Michael", 4000, "A bad band")); // initialize the list
            saveToFile(); // save the list to the file
        } else {
            loadFromFile();  // otherwise, load the list from the file
        }
    }

    private void saveToFile() throws IOException {
        file.writeToFile("Band.txt", new ArrayList<>(bandList)); // save the list to the file
    }

    private void loadFromFile() throws IOException {
        ArrayList<String> stringList = file.loadFromFile("Band.txt"); // load the list from the file
        stringList.forEach(string -> {
            String[] bandInfo = string.split(",");
            bandList.add(new Band(bandInfo[0], Double.parseDouble(bandInfo[1]), bandInfo[2])); // add the list to the file
        });
    }

    public Band(String name, double fee, String description) {
        this.name = name;
        this.fee = fee;
        this.description = description;
    }


    @Override
    public String toString() {
        return name + "," + fee + "," + description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Band> getBandList() {
        return bandList;
    }

    public void setBandList(ArrayList<Band> bandList) {
        this.bandList = bandList;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}

