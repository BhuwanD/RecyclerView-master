package com.example.recycler;

public class Contacts {
    private String Name;
    private String phonenumber;
    private int Imageid;
    private String Email;
    private String Address;

    public Contacts(String name, String phonenumber, int imageid, String email, String address) {
        Name = name;
        this.phonenumber = phonenumber;
        Imageid = imageid;
        Email = email;
        Address=address;

    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public int getImageid() {
        return Imageid;
    }

    public void setImageid(int imageid) {
        Imageid = imageid;
    }
}
