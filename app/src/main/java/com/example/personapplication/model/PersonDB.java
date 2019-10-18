package com.example.personapplication.model;


import java.util.ArrayList;

public class PersonDB {
    private static final PersonDB ourInstance = new PersonDB();

    protected ArrayList<Person> mPeople;

    static public PersonDB getInstance() {
        return ourInstance;
    }

    private PersonDB() {
        createPersonObjects();
    }

    public ArrayList<Person> getPeople() {
        return mPeople;
    }

    public void setPeople(ArrayList<Person> people) {
        mPeople = people;
    }


    protected void createPersonObjects() {
        // Create James Person object
        Person p = new Person("James", "Shen");
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Vehicle("J899999999", "Honda", "Accord"));
        p.setVehicles(vehicles);
        mPeople = new ArrayList<Person>();
        mPeople.add(p);
        // Create Another Person
        p = new Person("John", "Chang");
        vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Vehicle("J47474747", "Toyota", "Camry"));
        p.setVehicles(vehicles);
        mPeople.add(p);
        //
        //PersonDB.getInstance().setPeople(personList);
    }

}
