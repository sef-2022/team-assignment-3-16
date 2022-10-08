import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Package package1 = new Package();
        package1.setPackageDetails("Package 1", "Package 2", "Package 3");
        package1.upDatePackagePrice(Arrays.asList(1000.0, 2000.0, 3000.0));
        package1.getPackageDetails();
        System.out.println("Please select the package you want to hold");

        Scanner scanner = new Scanner(System.in);
        String packageSelection = scanner.nextLine();
        package1.setPackageSelection(packageSelection);
        package1.upDatePackagePrice(Arrays.asList(1000.0, 2000.0, 3000.0, 4000.0));

        FoodMenu foodMenu = new FoodMenu();
        foodMenu.setFoodDetails( "1,Chicken", "Chicken with rice", 100.0);
        foodMenu.setFoodDetails( "2,Beef", "Beef with rice", 200.0);
        foodMenu.setFoodDetails( "3,Pork", "Pork with rice", 300.0);
        foodMenu.setFoodDetails( "4,Fish", "Fish with rice", 400.0);
        System.out.println("Please select the food you want to order");
        System.out.println(foodMenu.getFoodName());

        String foodSelection = scanner.nextLine();
        foodMenu.setFoodPrice(Arrays.asList(100.0, 200.0, 300.0, 400.0));
        foodMenu.setFoodSelection(foodSelection);

        MusicalBrand musicalBrand = new MusicalBrand();
        System.out.println("Please select the brand you want to order");
        System.out.println("1. Brand ");
        System.out.println("2. I don't need a brand");
        musicalBrand.setMusicalBrandPrice(Arrays.asList(100.0, 0.0));
        String brandSelection = scanner.nextLine();
        musicalBrand.setBrandSelection(brandSelection);
        musicalBrand.NeedABrand(musicalBrand.getNeedMusicalBrand());
        Event event = new Event();
        event.GenerateEventid();
        System.out.println("Your event id is " + event.getEventId());



        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Event Management System");
        System.out.println("Please enter your name");
        String name = input.nextLine();
        System.out.println("Please enter your contact number");
        String contactNumber = input.nextLine();

        System.out.println("Please enter your email");
        String email = input.nextLine();

        System.out.println("Please enter your event id");
        String eventId = input.nextLine();
        System.out.println("Please enter your address");
        String address = input.nextLine();
        Customer customer = new Customer(name,contactNumber,email,eventId,address);
        FinalBill finalBill = new FinalBill(name,contactNumber,email,eventId,address,packageSelection,foodSelection,brandSelection);
        finalBill.calculateBill(package1.getPackagePrice(),foodMenu.getFoodPrice(),musicalBrand.getMusicalBrandPrice());
        finalBill.GenerateOrderReport();
        customer.makeComplaint(eventId);
        customer.makeSuggestion(eventId);
        customer.CancelOrder(eventId);


    }
}
