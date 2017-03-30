package com.example.domain;

import javax.persistence.*;

/**
 * Created by iam24 on 17/3/30.
 */
@Entity
public class TicketEntity {
    @Id
    @GeneratedValue
    private int id;
    private int seat_number;
    private String name;
    private int flight_number;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSeat_number() {
        return seat_number;
    }

    public void setSeat_number(int seat_number) {
        this.seat_number = seat_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(int flight_number) {
        this.flight_number = flight_number;
    }

    protected TicketEntity() {}

    public TicketEntity(String name, int flight_number, int seat_number) {
        this.seat_number = seat_number;
        this.name = name;
        this.flight_number = flight_number;
    }
}