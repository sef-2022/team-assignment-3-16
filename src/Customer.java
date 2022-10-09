import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
    private String name;
    private int contactNumber;
    private String email;
    private String address;
    private String paymentMethod;
    private ArrayList<Customer> customerslist = new ArrayList<>();
    private ArrayList<Bill> billslist = new ArrayList<>();

    public Customer() {

    }

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.run();
    }

    public Customer(String name, int contactNumber, String email, String address, String paymentMethod) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.email = email;
        this.address = address;
        this.paymentMethod = paymentMethod;
    }

    public void run() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter your name");
            String name = scanner.nextLine();
            System.out.println("enter your contact number");
            int contactNumber = scanner.nextInt();
            System.out.println("enter your email");
            String email1 = scanner.nextLine();
            String email = scanner.nextLine();
            System.out.println("enter your address");
            String address = scanner.nextLine();
            System.out.println("enter your payment method");
            String paymentMethod = scanner.nextLine();
            Customer customer = new Customer(name, contactNumber, email, address, paymentMethod);
            customerslist.add(customer);


            // Todo: package or own choice
            System.out.println("Do you want to choose a package or make your own choice?(1 for choose package we made,2 for your own");
            if (scanner.nextInt() == 1) {
                System.out.println("Which package do you want to choose?");
                Package package1 = new Package();
                package1.getPackageList().forEach(System.out::println);
                int packageChoice = scanner.nextInt();
                System.out.println("You have chosen " + packageChoice);
                Bill bill = new Bill(contactNumber,
                        new Package().getPackageList().get(packageChoice-1));
                billslist.add(bill);
                System.out.println(bill.printBill());
                Event event = new Event(contactNumber,customerslist,billslist);
                event.printEvent();

                break;
            } else {
                System.out.println("Which food do you want to choose?");
                Food food1 = new Food();
                food1.getFoodList().forEach(System.out::println);
                int foodChoice = scanner.nextInt();
                System.out.println("You have chosen " + foodChoice);

                System.out.println("Which venue do you want to choose?");
                Venue venue1 = new Venue();
                venue1.getVenueList().forEach(System.out::println);
                int venueChoice = scanner.nextInt();
                System.out.println("You have chosen " + venueChoice);

                System.out.println("Do you need a band?(0 for no, 1 for yes)");
                if (scanner.nextInt() == 1) {
                    System.out.println("Which band do you want to choose?");
                    Band band1 = new Band();
                    band1.getBandList().forEach(System.out::println);
                    int bandChoice = scanner.nextInt();
                    System.out.println("You have chosen " + bandChoice);
                } else {
                    System.out.println("You have chosen no band");
                }
                // Todo: new Package(String name, String description, Food food, Venue venue, Band band);
                Package package2 = new Package("Package 1", "A good package",
                        new Food().getFoodList().get(foodChoice),
                        new Venue().getVenueList().get(venueChoice),
                        new Band().getBandList().get(0));
                Bill bill2 = new Bill(contactNumber, package2);
                System.out.println(bill2.printBill());
                    break;
            }
        }

    }
}
