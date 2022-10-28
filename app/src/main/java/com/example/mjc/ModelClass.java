package com.example.mjc;

public class ModelClass {
    String mobilenumber, address, pincode, postel, startdate, enddate, content;

    public ModelClass(String mobilenumber, String address, String pincode, String postel, String startdate, String enddate, String content) {
        this.mobilenumber = mobilenumber;
        this.address = address;
        this.pincode = pincode;
        this.postel = postel;
        this.startdate = startdate;
        this.enddate = enddate;
        this.content = content;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getPostel() {
        return postel;
    }

    public void setPostel(String postel) {
        this.postel = postel;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

