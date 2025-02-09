package com.projects.airlineReservation;

public class Main {
    public static void main(String[] args) {

        Passenger passenger1 = new Passenger("Irmak Ertaş", "A1234567");
        Passenger passenger2 = new Passenger("Kerem Özkan", "B9876543");

        Flight flight1 = new Flight("TK202", "Istanbul", "London", 2);

        Reservation reservation1 = new Reservation(flight1, passenger1);
        Reservation reservation2 = new Reservation(flight1, passenger2);

        reservation1.makeReservation();
        reservation2.makeReservation();
    }
}
