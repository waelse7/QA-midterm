package org.example.api.entities.responses.LoginResponse.ResponseClasses;

public class Address {
    private String city;
    private int city_id;
    private String street;
    private int street_id;
    private Object entrance;
    private Object street_number;

    public Address(String city, int city_id, String street, int street_id, Object entrance, Object street_number) {
        this.city = city;
        this.city_id = city_id;
        this.street = street;
        this.street_id = street_id;
        this.entrance = entrance;
        this.street_number = street_number;
    }

    public Address() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getStreet_id() {
        return street_id;
    }

    public void setStreet_id(int street_id) {
        this.street_id = street_id;
    }

    public Object getEntrance() {
        return entrance;
    }

    public void setEntrance(Object entrance) {
        this.entrance = entrance;
    }

    public Object getStreet_number() {
        return street_number;
    }

    public void setStreet_number(Object street_number) {
        this.street_number = street_number;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", city_id=" + city_id +
                ", street='" + street + '\'' +
                ", street_id=" + street_id +
                ", entrance=" + entrance +
                ", street_number=" + street_number +
                '}';
    }
}