package com.projects.airlineReservation;

public class Reservation {
    private Flight flight;
    private Passenger passenger;

    public Reservation(Flight flight, Passenger passenger) {
        this.flight = flight;
        this.passenger = passenger;
    }

    public void makeReservation(){
        if(flight.bookSeat()){
            System.out.println("Reservation confirmed for " + passenger.getName() + " on flight " + flight.getFlightNumber());
        } else {
            System.out.println("Sorry, no available seats on flight " + flight.getFlightNumber());
        }
    }
}
