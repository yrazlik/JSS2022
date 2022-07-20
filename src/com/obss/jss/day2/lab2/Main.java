package com.obss.jss.day2.lab2;

public class Main {

    public static void main(String[] args) {
        Passenger passenger = new Passenger("Veli", Destination.ISTANBUL);
        Passenger passenger2 = new Passenger("Ali", Destination.IZMIR);
        Passenger passenger3 = new Passenger("Ayşe", Destination.ISTANBUL);
        Passenger passenger4 = new Passenger("Fatma", Destination.ISTANBUL);
        Bus bus = new Bus(Destination.ISTANBUL);
        bus.insertPassenger(passenger);
        bus.insertPassenger(passenger2);
        bus.insertPassenger(passenger3);
        bus.insertPassenger(passenger4);
    }
}
