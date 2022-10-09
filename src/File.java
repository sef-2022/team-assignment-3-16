import java.io.*;
import java.util.ArrayList;

public class File {
    private String name;

    public File() {
    }

    public void writeToFile(String fileName, ArrayList<Object> arrayList) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName)); // to write the file
        for (Object object : arrayList) {
            writer.write(object.toString()); // to write the file
            writer.newLine(); // to write the file
        }
        writer.close(); // to write the file
    }

    public ArrayList loadFromFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName)); // to read the file
        ArrayList<Object> arrayList = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) { // if the line is not null
            arrayList.add(line); // to add the line
        }
        reader.close(); //close the reader
        return arrayList;// return the arraylist
    }
}
