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
            if (bandList.isEmpty()) {
                initBandList();
            } else {
                loadFromFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void editBandList() throws IOException {
        System.out.println("Edit band list");
        saveToFile();
    }

    private void initBandList() throws IOException {
        if (bandList.isEmpty()) {
            saveToFile();
            bandList.add(new Band("Ikun", 1000, "A good band"));
            bandList.add(new Band("Kun", 2000, "A bad band"));
            bandList.add(new Band("Kun", 3000, "A bad band"));
            bandList.add(new Band("Michael", 4000, "A bad band"));
            saveToFile();
        } else {
            loadFromFile();
        }
    }

    private void saveToFile() throws IOException {
        file.writeToFile("Band.txt", new ArrayList<>(bandList));
    }

    private void loadFromFile() throws IOException {
        ArrayList<String> stringList = file.loadFromFile("Band.txt");
        stringList.forEach(string -> {
            String[] bandInfo = string.split(",");
            bandList.add(new Band(bandInfo[0], Double.parseDouble(bandInfo[1]), bandInfo[2]));
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

