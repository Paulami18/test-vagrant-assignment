package com.testvagrant.rcb.assignment.model;

import java.util.List;

public class TeamDetails {

    private String name;
    private String location;
    private List<PlayerDetails> player;

    public TeamDetails() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<PlayerDetails> getPlayer() {
        return player;
    }

    public void setPlayer(List<PlayerDetails> player) {
        this.player = player;
    }
}
