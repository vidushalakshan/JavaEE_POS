package entity;

public class order {
    private String oid;
    private String date;
    private String customerID;
    private int discount;
    private double total;
    private double subtotal;

    public order() {
    }

    public order(String oid, String date, String customerID, int discount, double total, double subtotal) {
        this.oid = oid;
        this.date = date;
        this.customerID = customerID;
        this.discount = discount;
        this.total = total;
        this.subtotal = subtotal;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public String toString() {
        return "order{" +
                "oid='" + oid + '\'' +
                ", date='" + date + '\'' +
                ", customerID='" + customerID + '\'' +
                ", discount=" + discount +
                ", total=" + total +
                ", subtotal=" + subtotal +
                '}';
    }
}
