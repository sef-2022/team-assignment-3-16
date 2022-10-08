import java.util.List;

public class Venue {
    private List<String> venueName;
    private List<String> venueDetails;
    private List<Double> venuePrice;
    private String venueSelection;

    public Venue(List<String> venueName, List<String> venueDetails, List<Double> venuePrice, String venueSelection, Boolean physicalCheck) {
        this.venueName = venueName;
        this.venueDetails = venueDetails;
        this.venuePrice = venuePrice;
        this.venueSelection = venueSelection;
    }

    public List<Double> getVenuePrice() {
        return venuePrice;
    }
    public void setVenuePrice(List<Double> venuePrice) {
        this.venuePrice = venuePrice;
    }
    public String getVenueDetails() {
        return venueDetails.get(Integer.getInteger(venueSelection));
    }

    public void setVenueSelection(String venueSelection) {
        this.venueSelection = venueSelection;
    }

    public String getVenueSelection() {
        return venueSelection;
    }
}
