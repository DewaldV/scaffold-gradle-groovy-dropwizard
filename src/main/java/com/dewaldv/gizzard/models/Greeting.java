package com.dewaldv.gizzard.models;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Greeting {
    private final int id;
    private final String name;

    public Greeting(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @JsonProperty
    public int getId() {
        return id;
    }

    @JsonProperty
    public String getName() {
        return name;
    }
}
