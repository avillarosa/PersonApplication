package com.example.personapplication.model;

import java.util.ArrayList;

public class Person {
    protected String mFirstName;
    protected String mLastName;
    protected ArrayList<Vehicle> mVehicles;

    public Person(String fName, String lName) {
        mFirstName = fName;
        mLastName = lName;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
    }

    public ArrayList<Vehicle> getVehicles() {
        return mVehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        mVehicles = vehicles;
    }
}
