import java.io.IOException;

public class Manager {
    private Package package1;
    private Food food1;
    private Band band1;
    private Venue venue1;
    private Event event1;
    private Bill bill1;

    public Manager() {
    }

    private void showPackageList() {
        package1.getPackageList().forEach(System.out::println);
    }

    private void editPackageList() throws IOException {
        package1.editPackageList();
    }

    private void showFoodList() {
        food1.getFoodList().forEach(System.out::println);
    }

    private void editFoodList() throws IOException {
        food1.editFoodList();
    }

    private void showBandList() {
        band1.getBandList().forEach(System.out::println);
    }

    private void editBandList() throws IOException {
        band1.editBandList();
    }

    private void showVenueList() {
        venue1.getVenueList().forEach(System.out::println);
    }

    private void editVenueList() throws IOException {
        venue1.editVenueList();
    }

    private void showEventList() {
        event1.getEventList().forEach(System.out::println);
    }
}
