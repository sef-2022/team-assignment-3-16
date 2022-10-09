import java.io.*;
import java.util.ArrayList;

public class File {
    private String name;

    public File() {
    }

    public void writeToFile(String fileName, ArrayList<Object> arrayList) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        for (Object object : arrayList) {
            writer.write(object.toString());
            writer.newLine();
        }
        writer.close();
    }

    public ArrayList loadFromFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        ArrayList<Object> arrayList = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            arrayList.add(line);
        }
        reader.close();
        return arrayList;
    }
}
