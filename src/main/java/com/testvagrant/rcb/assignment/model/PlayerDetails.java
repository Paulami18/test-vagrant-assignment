package com.testvagrant.rcb.assignment.model;

public class PlayerDetails {
     private String name;
     private String country;
     private String role;
     private double price;

     public PlayerDetails() {
     }



     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public String getCountry() {
          return country;
     }

     public void setCountry(String country) {
          this.country = country;
     }

     public String getRole() {
          return role;
     }

     public void setRole(String role) {
          this.role = role;
     }

     public double getPrice() {
          return price;
     }

     public void setPrice(double price) {
          this.price = price;
     }

}
