package com.example.customlistview.model;

public class Contact {
    private int mColro;
    private String mName;
    private String mNumber;

    public Contact(int mColro, String mName, String mNumber) {
        this.mColro = mColro;
        this.mName = mName;
        this.mNumber = mNumber;
    }

    public int getmColro() {
        return mColro;
    }

    public void setmColro(int mColro) {
        this.mColro = mColro;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmNumber() {
        return mNumber;
    }

    public void setmNumber(String mNumber) {
        this.mNumber = mNumber;
    }
}
