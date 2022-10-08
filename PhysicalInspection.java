import java.util.List;

import static java.lang.System.in;

public class PhysicalInspection {
    private List<String> AvailableDate;
    private String CustomerTime;

    public PhysicalInspection(List<String> availableDate, String customerTime) {
        AvailableDate = availableDate;
        CustomerTime = customerTime;
    }

    public String getCustomerTime() {
        return CustomerTime;
    }

    public void setAvailableDate(List<String> availableDate) {
        AvailableDate = availableDate;
    }

    public List<String> getAvailableDate() {
        return AvailableDate;
    }

    public void setCustomerTime(String customerTime) {
        CustomerTime = customerTime;
    }
    public boolean physicalCheck(Boolean physicalCheck) {
        for (int i = 0; i < AvailableDate.size(); i++) {
            if (AvailableDate.get(i).equals(CustomerTime)) {
                physicalCheck = true;
                break;
            } else {
                physicalCheck = false;
            }
        }
        return physicalCheck;
    }
}
