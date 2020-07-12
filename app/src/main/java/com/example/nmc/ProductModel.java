package com.example.nmc;

public class ProductModel {
    private String ProductName;
    private int ProductSerialNumber;
    private String ProductImageURL;
    private String VendorName;
    private int VendorPhoneNumber;
    private String VendorAddress;
    private int vendorGSTNumber;

    private int PaymentHistoryReceived;
    private int PaymentHistorySent;
    private int OrderDate;
    private int OrderQuantity;
    private String OrderVendorName;
    private String OrderItem;

    private String PendingOrderVendor;
    private int Quantity;
    private int PendingOrderItem;


    private int PendingPaymentDuePAmount;
    private int PendingPaymentDueRAmount;
    private String PendingPaymentVendorP;
    private String PendingPaymentVendorR;


    int i;

    public void setProductDetails(String ProductName, int ProductSerialNumber, String ProductImageURL) {
        this.ProductName = ProductName;
        this.ProductSerialNumber = ProductSerialNumber;
        this.ProductImageURL = ProductImageURL;
    }


    public void getProductDetails() {
        return(hashMap.get("ProductName"));
        return(hashMap.get("ProductSerialNumber"));
        return(hashMap.get("ProductImageURL"));
    }


    public void setVendorDetails(String VendorName, int VendorPhoneNumber, String VendorAddress, int vendorGSTNumber) {
        this.VendorName = VendorName;
        this.VendorPhoneNumber = VendorPhoneNumber;
        this.VendorAddress = VendorAddress;
        this.vendorGSTNumber = vendorGSTNumber;
    }

    public void getVendorDetails() {
        return(hashMap.get("VendorName"));
        return(hashMap.get("VendorPhoneNumber"));
        return(hashMap.get("VendorAddress="));
        return(hashMap.get("VendorGSTNumber"));
    }

    public void setPaymentHistory(int PaymentHistoryReceived, int PaymentHistorySent) {
        this.PaymentHistoryReceived = PaymentHistoryReceived;
        this.PaymentHistorySent = PaymentHistorySent;

    }

    public void getPaymentHistory() {
        return(hashMap.get("PaymentHistoryReceived"));
        return(hashMap.get("PaymentHistorySent"));

    }


    public void setOrderHistory(int OrderDate, int OrderQuantity, String OrderVendorName, String OrderItem) {
        this.OrderDate = OrderDate;
        this.OrderQuantity = OrderQuantity;
        this.OrderVendorName = OrderVendorName;
        this.OrderItem = OrderItem;
    }

    public void getOrderHistory() {
        return(hashMap.get("OrderDate"));
        return(hashMap.get("OrderQuantity"));
        return(hashMap.get("OrderVendorName"));
        return(hashMap.get("OrderItem"));
    }


    public void setPendingOrder(String PendingOrderVendor, int Quantity, int PendingOrderItem) {
        this.PendingOrderVendor = PendingOrderVendor;
        this.Quantity = Quantity;
        this.PendingOrderItem = PendingOrderItem;
    }

    public void getPendingOrder() {
        return(hashMap.get("PendingOrderVendor"));
        return(hashMap.get("Quantity"));
        return(hashMap.get("PendingOrderItem"));

    }


    public void setPendingPayment(String PendingPaymentVendorP, int PendingPaymentDuePAmount, String PendingPaymentVendorR, int PendingPaymentDueRAmount) {
        this.PendingPaymentVendorP = PendingPaymentVendorP;
        this.PendingPaymentDuePAmount = PendingPaymentDuePAmount;
        this.PendingPaymentVendorR = PendingPaymentVendorR;
        this.PendingPaymentDueRAmount = PendingPaymentDueRAmount;
    }

    public void getPendingPayment() {
        return(hashMap.get("PendingPaymentVendorP"));
        return(hashMap.get("PendingPaymentDuePAmount"));
        return(hashMap.get("PendingPaymentVendorR"));
        return(hashMap.get("PendingPaymentDueRAmount"));


    }


    public void ConvertObjectToMap(ProductModel object) {

        HashMap<String, Object> hashMap = new HashMap();
        hashMap.put("ProductName", object.ProductName);
        hashMap.put("ProductSerialNumber", object.ProductSerialNumber);
        hashMap.put("ProductImageURL", object.ProductImageURL);
        hashMap.put("VendorName", object.VendorName);
        hashMap.put("VendorAddress", object.VendorAddress);
        hashMap.put("VendorPhoneNumber", object.VendorPhoneNumber);

        hashMap.put("vendorGSTNumber", object.vendorGSTNumber);
        hashMap.put("PaymentHistoryReceived", object.PaymentHistoryReceived);
        hashMap.put("PaymentHistorySent", object.PaymentHistorySent);
        hashMap.put("OrderDate", object.OrderDate);
        hashMap.put("OrderQuantity", object.OrderQuantity);
        hashMap.put("OrderVendorName", object.OrderVendorName);
        hashMap.put("OrderItem", object.OrderItem);
        hashMap.put("PendingOrderVendor", object.PendingOrderVendor);
        hashMap.put(" PendingOrderItem", object.PendingOrderItem);
        hashMap.put(" Quantity", object.Quantity);

        hashMap.put("PendingPaymentDuePAmount", object.PendingPaymentDuePAmount);
        hashMap.put("PendingPaymentDueRAmount", object.PendingPaymentDueRAmount);
        hashMap.put("PendingPaymentVendorP", object.PendingPaymentVendorP);
        hashMap.put("PendingPaymentVendorR", object.PendingPaymentVendorR);
        add_product(hashMap);
        }
    }
}

