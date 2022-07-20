package com.obss.jss.day2.lab2;

public class Bus {

    private int currentPassengerCount = 0;
    private Destination destination;
    private Passenger[] passengers = new Passenger[2];

    public Bus(Destination destination) {
        this.destination = destination;
    }

    public Bus(Destination destination, Passenger[] passengers) {
        this.destination = destination;
        this.passengers = passengers;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public Passenger[] getPassengers() {
        return passengers;
    }

    public void setPassengers(Passenger[] passengers) {
        this.passengers = passengers;
    }

    public void insertPassenger(Passenger p) {
        if(this.destination != p.getDestination()) {
            System.out.println("Destinations dont match");
        } else if(this.currentPassengerCount >= passengers.length) {
            System.out.println("Full");
        } else {
            currentPassengerCount++;
            System.out.println("Passenger inserted");
        }


    }
}
