import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Package {
    private List<String> packageName = new ArrayList();
    private List<String> packageDetails = new ArrayList();
    List<Double> packagePrice = new ArrayList();
    private String packageSelection;
    private FoodMenu foodMenu;
    private MusicalBrand musicalBrand;
    private FinalBill finalBill;
    private MusicalBrand musicalBrand1;

    public List<String> getFoodDetails() {
        return foodMenu.getFoodDetails();
        // return the food details
    }

    public List<Double> getPackagePrice() {
        return packagePrice;
        // return the package price
    }


    public void upDatePackagePrice(List<Double> packagePrice) {
        this.packagePrice = packagePrice;
    }
    public void NeedABrand(boolean isNeedABrand){
        if (isNeedABrand){
            musicalBrand.getMusicalBrandDetails();
            musicalBrand.getMusicalBrandPrice();
        }
        else {
            System.out.println("No Brand");
        }
    }// this part if the customer choose the option 1, it will show the brand details and price then the customer can choose the brand they want,
    // if the customer choose the option 2, it will show the message "No Brand"

    public void setPackageSelection(String packageSelection) {
        this.packageSelection = packageSelection;
    }
    public void setPackageDetails(String... packageDetails) {
        this.packageDetails.addAll(Arrays.asList(packageDetails));
    }
    public void getPackageDetails() {
        System.out.println(packageDetails);
    }
}
