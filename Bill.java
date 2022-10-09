public class Bill {
    private int billID;
    private Package package1;

    public Bill() {

    }

    public Bill(int billID, Package package1) {
        this.billID = billID;
        this.package1 = package1;
    }

    public String printBill() {
        return "Bill{" +
                "billID=" + billID +
                ", package1=" + package1 +
                '}';
    }

    public int getBillID() {
        return billID;
    }

    public void setBillID(int billID) {
        this.billID = billID;
    }

    public Package getPackage1() {
        return package1;
    }

    public void setPackage1(Package package1) {
        this.package1 = package1;
    }

}
