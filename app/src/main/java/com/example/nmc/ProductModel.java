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
    private  int OrderDate;
    private int OrderQuantity;
    private String OrderVendorName;
    private String OrderItem;

    private String PendingOrderVendor;
    private int Quantity;
    private int PendingOrderItem;


    private int  PendingPaymentDuePAmount;
    private int PendingPaymentDueRAmount;
    private String PendingPaymentVendorP;
    private String PendingPaymentVendorR;

    public void setProductDetials(String ProductName,int ProductSerialNumber)
    {
        this.ProductName=ProductName;
        this.ProductSerialNumber=ProductSerialNumber;
    }

    public void setProductName(String ProductName)
    {
        this.ProductName= ProductName;
    }
    public void  setVendorDetails(String VendorName, int VendorPhoneNumber, String VendorAddress, int vendorGSTNumber )
    {
        this.VendorName=VendorName;
        this.VendorPhoneNumber=VendorPhoneNumber;
        this.VendorAddress= VendorAddress;
        this.vendorGSTNumber=vendorGSTNumber;
    }

    public void setPaymentHistory(int PaymentHistoryReceived,int PaymentHistorySent)
    {
        this.PaymentHistoryReceived=PaymentHistoryReceived;
        this.PaymentHistorySent=PaymentHistorySent;

    }

    public void setOrderHistory( int OrderDate,int OrderQuantity, String OrderVendorName, String OrderItem)
    {
        this.OrderDate=OrderDate;
        this.OrderQuantity=OrderQuantity;
        this.OrderVendorName=OrderVendorName;
        this.OrderItem=OrderItem;
    }

    public void setPendingOrder(String PendingOrderVendor,int Quantity,int PendingOrderItem)
    {
        this.PendingOrderVendor=PendingOrderVendor;
        this.Quantity=Quantity;
        this.PendingOrderItem=PendingOrderItem;
    }

    public void setPendingPayment(String PendingPaymentVendorP,int PendingPaymentDuePAmount,String PendingPaymentVendorR,int PendingPaymentDueRAmount)
    {
        this.PendingPaymentVendorP=PendingPaymentVendorP;
        this.PendingPaymentDuePAmount=PendingPaymentDuePAmount;
        this.PendingPaymentVendorR=PendingPaymentVendorR;
        this.PendingPaymentDueRAmount=PendingPaymentDueRAmount;
    }





}
