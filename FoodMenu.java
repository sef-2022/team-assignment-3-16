import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FoodMenu  {
    private List<String> foodName = new ArrayList();
    private List<String> foodDetails = new ArrayList();
    private List<Double> foodPrice = new ArrayList();
    private String foodSelection;


    public List<String> getFoodName() {
        return foodName; // return the food name
    }
    public void setFoodName(List<String> foodName) {
        this.foodName = foodName; // this part is to set the food name
    }
    public List<String> getFoodDetails() {
        return foodDetails; // return the food details
    }
    public List<Double> getFoodPrice() {
        return foodPrice; // return the food price
    }
    public void setFoodPrice(List<Double> foodPrice) {
        this.foodPrice = foodPrice; // this part is to set the food price
    }
    public String getFoodSelection() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select the food you want to order");
        foodSelection = scanner.nextLine();
        return foodSelection; // return the food selection
    }
    public void setFoodSelection(String foodSelection) {
        this.foodSelection = foodSelection; // this part is to set the food selection
    }


    public void setFoodDetails( String foodName, String foodDetails, double foodPrice) {
        this.foodName.add(foodName);
        this.foodDetails.add(foodDetails);
        this.foodPrice.add(foodPrice); // this part is to set the food details
    }
    public void getFoodDetails(String foodSelection) {
        for (int i = 0; i < foodName.size(); i++) {
            if (foodName.get(i).equals(foodSelection)) {
                System.out.println("Food Name: " + foodName.get(i));
                System.out.println("Food Details: " + foodDetails.get(i));
                System.out.println("Food Price: " + foodPrice.get(i));
                break;
            }
        }
    }
}
