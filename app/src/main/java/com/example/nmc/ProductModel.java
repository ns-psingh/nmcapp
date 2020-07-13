package com.example.nmc;

import java.util.HashMap;

public class ProductModel {
    private String ProductName;
    private String ProductSerialNumber;
    private String ProductImageURL;
    private String VendorName;
    private String VendorPhoneNumber;
    private String VendorAddress;
    private String vendorGSTNumber;

    private String PaymentHistoryReceived;
    private String PaymentHistorySent;
    private String OrderDate;
    private String OrderQuantity;
    private String OrderVendorName;
    private String OrderItem;

    private String PendingOrderVendor;
    private String Quantity;
    private String PendingOrderItem;


    private String PendingPaymentDuePAmount;
    private String PendingPaymentDueRAmount;
    private String PendingPaymentVendorP;
    private String PendingPaymentVendorR;


    int i;

    public void setProductDetails(String ProductName, String ProductSerialNumber, String ProductImageURL) {
        this.ProductName = ProductName;
        this.ProductSerialNumber = ProductSerialNumber;
        this.ProductImageURL = ProductImageURL;
    }

    public ProductModel()
    {
        this.ProductName = "";
        this.ProductImageURL = "";
        this.ProductSerialNumber = "";
        this.VendorName = "";
        this.VendorPhoneNumber = "";
        this.VendorAddress = "";
        this.vendorGSTNumber = "";
        this.PaymentHistoryReceived = "";
        this.PaymentHistorySent = "";
        this.OrderDate = "";
        this.OrderQuantity = "";
        this.OrderVendorName = "";
        this.OrderItem = "";
        this.PendingOrderVendor = "";
        this.Quantity = "";
        this.PendingOrderItem = "";
        this.PendingPaymentDuePAmount = "";
        this.PendingPaymentDueRAmount = "";
        this.PendingPaymentVendorP = "";
        this.PendingPaymentVendorR = "";
    }


    public HashMap<String, Object> getProductDetails() {
        HashMap<String, Object> hashMap = new HashMap<>(); //fixed in feature_30
        hashMap.put("ProductName", this.ProductName);
        hashMap.put("ProductSerialNumber", this.ProductSerialNumber);
        hashMap.put("ProductImageURL", this.ProductImageURL);
        return hashMap;
    }


    public void setVendorDetails(String VendorName, String VendorPhoneNumber, String VendorAddress, String vendorGSTNumber) {
        this.VendorName = VendorName;
        this.VendorPhoneNumber = VendorPhoneNumber;
        this.VendorAddress = VendorAddress;
        this.vendorGSTNumber = vendorGSTNumber;
    }

    public HashMap<String, Object> getVendorDetails() {
        HashMap<String, Object> hashMap = new HashMap<>(); //fixed in feature_30
        hashMap.put("VendorName", this.VendorName);
        hashMap.put("VendorPhoneNumber", this.VendorPhoneNumber);
        hashMap.put("VendorAddress", this.VendorAddress);
        hashMap.put("VendorGSTNumber", this.vendorGSTNumber);
        return hashMap;
    }

    public void setPaymentHistory(String PaymentHistoryReceived, String PaymentHistorySent) {
        this.PaymentHistoryReceived = PaymentHistoryReceived;
        this.PaymentHistorySent = PaymentHistorySent;

    }

    public HashMap<String, Object> getPaymentHistory() {
        HashMap<String, Object> hashMap = new HashMap<>(); //fixed in feature_30
        hashMap.put("PaymentHistoryReceived", this.PaymentHistoryReceived);
        hashMap.put("PaymentHistorySent", this.PaymentHistorySent);
        return hashMap;
    }


    public void setOrderHistory(String OrderDate, String OrderQuantity, String OrderVendorName, String OrderItem) {
        this.OrderDate = OrderDate;
        this.OrderQuantity = OrderQuantity;
        this.OrderVendorName = OrderVendorName;
        this.OrderItem = OrderItem;
    }

    public HashMap<String, Object> getOrderHistory() {
        HashMap<String, Object> hashMap = new HashMap<>(); //fixed in feature_30
        hashMap.put("OrderDate", this.OrderDate);
        hashMap.put("OrderQuantity", this.OrderQuantity);
        hashMap.put("OrderVendorName", this.OrderVendorName);
        hashMap.put("OrderItem", this.OrderItem);
        return hashMap;
    }


    public void setPendingOrder(String PendingOrderVendor, String Quantity, String PendingOrderItem) {
        this.PendingOrderVendor = PendingOrderVendor;
        this.Quantity = Quantity;
        this.PendingOrderItem = PendingOrderItem;
    }

    public HashMap<String, Object> getPendingOrder() {
        HashMap<String, Object> hashMap = new HashMap<>(); //fixed in feature_30
        hashMap.put("PendingOrderVendor", this.PendingOrderVendor);
        hashMap.put("Quantity", this.Quantity);
        hashMap.put("PendingOrderItem", this.PendingOrderItem);
        return hashMap;
    }


    public void setPendingPayment(String PendingPaymentVendorP, String PendingPaymentDuePAmount, String PendingPaymentVendorR, String PendingPaymentDueRAmount) {
        this.PendingPaymentVendorP = PendingPaymentVendorP;
        this.PendingPaymentDuePAmount = PendingPaymentDuePAmount;
        this.PendingPaymentVendorR = PendingPaymentVendorR;
        this.PendingPaymentDueRAmount = PendingPaymentDueRAmount;
    }

    public HashMap<String, Object> getPendingPayment() {
        HashMap<String, Object> hashMap = new HashMap(); //fixed in feature_30
        hashMap.put("PendingPaymentVendorP", this.PendingPaymentVendorP);
        hashMap.put("PendingPaymentDuePAmount", this.PendingPaymentDuePAmount);
        hashMap.put("PendingPaymentVendorR", this.PendingPaymentVendorR);
        hashMap.put("PendingPaymentDueRAmount", this.PendingPaymentDueRAmount);
        return hashMap;
    }


    public HashMap<String, Object> ConvertObjectToMap() {
        //restructured the function in feature30
        HashMap<String, Object> hashMap = new HashMap();
        hashMap.put("ProductName", this.ProductName);
        hashMap.put("ProductSerialNumber", this.ProductSerialNumber);
        hashMap.put("ProductImageURL", this.ProductImageURL);
        hashMap.put("VendorName", this.VendorName);
        hashMap.put("VendorAddress", this.VendorAddress);
        hashMap.put("VendorPhoneNumber", this.VendorPhoneNumber);

        hashMap.put("vendorGSTNumber", this.vendorGSTNumber);
        hashMap.put("PaymentHistoryReceived", this.PaymentHistoryReceived);
        hashMap.put("PaymentHistorySent", this.PaymentHistorySent);
        hashMap.put("OrderDate", this.OrderDate);
        hashMap.put("OrderQuantity", this.OrderQuantity);
        hashMap.put("OrderVendorName", this.OrderVendorName);
        hashMap.put("OrderItem", this.OrderItem);
        hashMap.put("PendingOrderVendor", this.PendingOrderVendor);
        hashMap.put(" PendingOrderItem", this.PendingOrderItem);
        hashMap.put(" Quantity", this.Quantity);

        hashMap.put("PendingPaymentDuePAmount", this.PendingPaymentDuePAmount);
        hashMap.put("PendingPaymentDueRAmount", this.PendingPaymentDueRAmount);
        hashMap.put("PendingPaymentVendorP", this.PendingPaymentVendorP);
        hashMap.put("PendingPaymentVendorR", this.PendingPaymentVendorR);
        return hashMap;
        }
    }

