package com.example.pokemonapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pokemon {

    @JsonProperty("name")
    private String name;

    @JsonProperty("id")
    private int id;

    // Tambahkan atribut lain sesuai kebutuhan

    // Getters dan Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Override toString() jika diperlukan
}
