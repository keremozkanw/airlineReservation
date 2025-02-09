package com.projects.airlineReservation;

import java.security.KeyStore;

public class Flight {
    private String flightNumber;
    private String departure;
    private String destination;
    private int availableSeats;

    public Flight(String flightNumber, String departure, String destination, int availableSeats) {
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
        this.availableSeats = availableSeats;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public boolean bookSeat() {
        if(availableSeats>0){
            availableSeats--;
            return true;
        }
        return false;
    }
}
