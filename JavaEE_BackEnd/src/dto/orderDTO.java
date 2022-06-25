package dto;

import entity.orderDetails;

import java.util.ArrayList;

public class orderDTO {
    private String oid;
    private String date;
    private String customerID;
    private int discount;
    private double total;
    private double subtotal;
    private ArrayList<orderDetails> orderDetailsArrayList;

    public orderDTO() {
    }

    public orderDTO(String oid, String date, String customerID, int discount, double total, double subtotal, ArrayList<orderDetails> orderDetailsArrayList) {
        this.oid = oid;
        this.date = date;
        this.customerID = customerID;
        this.discount = discount;
        this.total = total;
        this.subtotal = subtotal;
        this.orderDetailsArrayList = orderDetailsArrayList;
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

    public ArrayList<orderDetails> getOrderDetailsArrayList() {
        return orderDetailsArrayList;
    }

    public void setOrderDetailsArrayList(ArrayList<orderDetails> orderDetailsArrayList) {
        this.orderDetailsArrayList = orderDetailsArrayList;
    }

    @Override
    public String toString() {
        return "orderDTO{" +
                "oid='" + oid + '\'' +
                ", date='" + date + '\'' +
                ", customerID='" + customerID + '\'' +
                ", discount=" + discount +
                ", total=" + total +
                ", subtotal=" + subtotal +
                ", orderDetailsArrayList=" + orderDetailsArrayList +
                '}';
    }
}
