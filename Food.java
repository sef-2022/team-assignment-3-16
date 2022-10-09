import java.io.IOException;
import java.util.ArrayList;

public class Food {
    private String name;
    private double price;
    private String description;
    private ArrayList<Food> foodList = new ArrayList<Food>();
    private File file = new File();

    public Food() {
        try {
            if (foodList.isEmpty()) {
                initFoodList();
            } else {
                loadFromFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void editFoodList() throws IOException {
        System.out.println("Edit food list");
        saveToFile();
    }

    private void initFoodList() throws IOException {
        if (foodList.isEmpty()) {
            saveToFile();
            foodList.add(new Food("Burger", 5.99, "A delicious burger"));
            foodList.add(new Food("Fries", 2.99, "A delicious fries"));
            foodList.add(new Food("Pizza", 7.99, "A delicious pizza"));
            foodList.add(new Food("Salad", 4.99, "A delicious salad"));
            foodList.add(new Food("Soda", 1.99, "A delicious soda"));
            saveToFile();
        } else {
            loadFromFile();
        }
    }

    private void saveToFile() throws IOException {
        file.writeToFile("Food.txt", new ArrayList<>(foodList));
    }

    private void loadFromFile() throws IOException {
        ArrayList<String> stringList = file.loadFromFile("Food.txt");
        stringList.forEach(string -> {
            String[] foodInfo = string.split(",");
            foodList.add(new Food(foodInfo[0], Double.parseDouble(foodInfo[1]), foodInfo[2]));
        });
    }

    @Override
    public String toString() {
        return name + "," + price + "," + description;
    }

    public Food(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(ArrayList<Food> foodList) {
        this.foodList = foodList;
    }
}
