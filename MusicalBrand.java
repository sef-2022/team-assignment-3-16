import java.util.List;

public class MusicalBrand {
    private Boolean NeedMusicalBrand;
    private List<String> MusicalBrandName;
    private List<String> MusicalBrandDetails;
    private List<Double> MusicalBrandPrice;
    private String MusicalBrandSelection;

    public List<Double> getMusicalBrandPrice() {
        return MusicalBrandPrice; //
    }

    public List<String> getMusicalBrandDetails() {
        return MusicalBrandDetails;
    }
    public MusicalBrand() {

    }

    public String getMusicalBrandSelection() {
        return MusicalBrandSelection;
    }

    public void setMusicalBrandDetails(List<String> musicalBrandDetails) {
        MusicalBrandDetails = musicalBrandDetails;
    }

    public void setMusicalBrandPrice(List<Double> musicalBrandPrice) {
        MusicalBrandPrice = musicalBrandPrice;
    }

    public void setMusicalBrandSelection(String musicalBrandSelection) {
        MusicalBrandSelection = musicalBrandSelection;
    }

    public void setNeedMusicalBrand(Boolean needMusicalBrand) {
        NeedMusicalBrand = needMusicalBrand;
    }

    public Boolean getNeedMusicalBrand() {
        if (MusicalBrandSelection.equals("1")) {
            NeedMusicalBrand = true;
        } else {
            NeedMusicalBrand = false;
        }
        return NeedMusicalBrand;
    }

    public void setBrandSelection(String brandSelection) {
        MusicalBrandSelection = brandSelection;
    }

    public void NeedABrand(Boolean needMusicalBrand) {
    }
}
